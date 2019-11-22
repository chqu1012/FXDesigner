package de.dc.fx.ui.renderer.model.renderer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXEvent;
import de.dc.fx.ui.renderer.model.FXFilteredTableView;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXLabel;
import de.dc.fx.ui.renderer.model.FXListView;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXPadding;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXSortFilteredTableView;
import de.dc.fx.ui.renderer.model.FXTab;
import de.dc.fx.ui.renderer.model.FXTabPane;
import de.dc.fx.ui.renderer.model.FXTableView;
import de.dc.fx.ui.renderer.model.FXVBox;
import de.dc.fx.ui.renderer.model.control.FXBaseView;
import de.dc.fx.ui.renderer.model.control.FXFilteredTableViewControl;
import de.dc.fx.ui.renderer.model.control.FXListViewControl;
import de.dc.fx.ui.renderer.model.control.FXRootControl;
import de.dc.fx.ui.renderer.model.control.FXSortFilteredTableViewControl;
import de.dc.fx.ui.renderer.model.control.FXTableViewControl;
import de.dc.fx.ui.renderer.model.control.UI;
import de.dc.fx.ui.renderer.model.util.UISwitch;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class UIRenderer extends UISwitch<Node> {

	private Map<String, Region> controlRegistry = new HashMap<>();
	private Map<String, Tab> tabRegistry = new HashMap<>();
	
	private FXRootControl root;
	
	@SuppressWarnings("unchecked")
	public <T extends Region> T findNodeBy(String id) {
		return (T) controlRegistry.get(id);
	}

	private Region init(FXNode object, Region node) {
		controlRegistry.put(object.getId(), node);
		initSize(object, node);
		caseFXEvent(object);
		return node;
	}
	
	private void initSize(FXNode object, Region node) {
		node.setMinHeight(object.getMinHeight() == 0 ? Double.MIN_VALUE : object.getMinHeight());
		node.setMinWidth(object.getMinWidth() == 0 ? Double.MIN_VALUE : object.getMinWidth());
		node.setMaxHeight(object.getMaxHeight() == 0 ? Double.MAX_VALUE : object.getMaxHeight());
		node.setMaxWidth(object.getMaxWidth() == 0 ? Double.MAX_VALUE : object.getMaxWidth());
		if (object.getPrefHeight() > 0) {
			node.setPrefHeight(object.getPrefHeight());
		}
		if (object.getPrefWidth() > 0) {
			node.setPrefWidth(object.getPrefWidth());
		}
	}

	@Override
	public Node caseFXTabPane(FXTabPane object) {
		TabPane node = new TabPane();
		object.getChildren().stream().map(e->(FXTab)e).forEach(e-> {
			Tab tab = new Tab(e.getName()==null? "": e.getName());
			FXNode content = e.getContent();
			if (content!=null) {
				tab.setContent(doSwitch(content));
			}
			node.getTabs().add(tab);
			tabRegistry.put(e.getId(), tab);
		});
		return init(object, node);
	}
	
	@Override
	public Node caseFXEvent(FXEvent object) {
		FXNode fxNode = (FXNode) object;
		String id = fxNode.getId();
		Region control = controlRegistry.get(id);
		if (control != null) {
			if (object.getOnMouseClicked()!=null) {
				// Used for viewers
				if (control instanceof FXBaseView) {
					((FXBaseView)control).getControl().setOnMouseClicked(e-> root.invokeMethodBy(object.getOnMouseClicked(), e));
				}else {
					control.setOnMouseClicked(e-> root.invokeMethodBy(object.getOnMouseClicked(), e));
				}
			}
		}
		return super.caseFXEvent(object);
	}
	
	@Override
	public Node caseFXLabel(FXLabel object) {
		Label node = new Label(object.getName()==null?"":object.getName());
		return init(object, node);
	}
	
	@Override
	public Node caseFXRoot(FXRoot object) {
		root = new FXRootControl(object);
		object.getChildren().forEach(e->root.setCenter(doSwitch(e)));
		initialize();
		return root;
	}

	@Override
	public Node caseFXSortFilteredTableView(FXSortFilteredTableView object) {
		FXSortFilteredTableViewControl<Object> node = new FXSortFilteredTableViewControl<>(object);
		return init(object, node);
	}
	
	@Override
	public Node caseFXFilteredTableView(FXFilteredTableView object) {
		FXFilteredTableViewControl<Object> node = new FXFilteredTableViewControl<>(object);
		return init(object, node);
	}
	
	@Override
	public Node caseFXTableView(FXTableView object) {
		FXTableViewControl<Object> node = new FXTableViewControl<>(object);
		return init(object, node);
	}
	
	@Override
	public Node caseFXListView(FXListView object) {
		FXListViewControl<Object> node = new FXListViewControl<>(object);
		return init(object, node);
	}
	
	@Override
	public Node caseFXButton(FXButton object) {
		Button node = new Button(object.getName());
		return init(object, node);
	}
	
	@Override
	public Node caseFXHBox(FXHBox object) {
		HBox node = new HBox(object.getSpacing());
		object.getChildren().forEach(e->addChild(node, e));
		return init(object, node);
	}
	
	@Override
	public Node caseFXVBox(FXVBox object) {
		VBox node = new VBox(object.getSpacing());
		object.getChildren().forEach(e->addChild(node, e));
		return init(object, node);
	}
	
	@Override
	public Node caseFXBorderPane(FXBorderPane object) {
		BorderPane node = new BorderPane();
		node.setLayoutX(object.getLayoutX());
		node.setLayoutY(object.getLayoutY());

		createBorderPaneItem(object.getLeft()).ifPresent(e -> node.setLeft(e));
		createBorderPaneItem(object.getRight()).ifPresent(e -> node.setRight(e));
		createBorderPaneItem(object.getTop()).ifPresent(e -> node.setTop(e));
		createBorderPaneItem(object.getBottom()).ifPresent(e -> node.setBottom(e));
		createBorderPaneItem(object.getCenter()).ifPresent(e -> node.setCenter(e));

		return init(object, node);
	}
	
	private Optional<Node> createBorderPaneItem(FXNode mNode) {
		if (mNode!=null) {
			Optional<Node> node = Optional.ofNullable(doSwitch(mNode));
//			BorderPane.setMargin(node.get(), createInsets(mNode.getMargin()));
			return node;
		}
		return Optional.empty();
	}
	
	@Override
	public Node caseFXPadding(FXPadding object) {
		FXNode node = (FXNode) object.eContainer();
		Region uiNode = controlRegistry.get(node.getId());
		if (uiNode!=null) {
			uiNode.setPadding(new Insets(object.getLeft(), object.getRight(), object.getTop(), object.getBottom()));
		}
		// Emtpy Node
		return new Pane();
	}
	
	private void addChild(Pane node, FXNode eNode) {
		Node current = doSwitch(eNode);
		initSize(eNode, node);
		node.getChildren().add(current);
	}

	public void initialize() {
		if (root==null && root.getController()==null) {
			return;
		}
		root.getController().ifPresent(e->{
			Field[] declaredFields = e.getClass().getDeclaredFields();
			for (Field field : declaredFields) {
				if (field.isAnnotationPresent(UI.class)) {
					Region control = controlRegistry.get(field.getName());
					if (control!=null) {
						try {
							field.setAccessible(true);
							field.set(e, control);
						} catch (IllegalArgumentException | IllegalAccessException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
	}
}