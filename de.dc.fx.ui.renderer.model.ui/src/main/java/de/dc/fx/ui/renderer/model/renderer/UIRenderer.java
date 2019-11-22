package de.dc.fx.ui.renderer.model.renderer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXFilteredTableView;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXPadding;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXSortFilteredTableView;
import de.dc.fx.ui.renderer.model.FXTableView;
import de.dc.fx.ui.renderer.model.FXVBox;
import de.dc.fx.ui.renderer.model.control.FXFilteredTableViewControl;
import de.dc.fx.ui.renderer.model.control.FXRootControl;
import de.dc.fx.ui.renderer.model.control.FXSortFilteredTableViewControl;
import de.dc.fx.ui.renderer.model.control.FXTableViewControl;
import de.dc.fx.ui.renderer.model.util.UISwitch;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class UIRenderer extends UISwitch<Node> {

	private Map<String, Region> controlRegistry = new HashMap<>();
	
	@SuppressWarnings("unchecked")
	public <T extends Region> T findNodeBy(String id) {
		return (T) controlRegistry.get(id);
	}

	private Region init(FXNode object, Region node) {
		controlRegistry.put(object.getId(), node);
		initSize(object, node);
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
	public Node caseFXRoot(FXRoot object) {
		FXRootControl node = new FXRootControl(object);
		object.getChildren().forEach(e->node.setCenter(doSwitch(e)));
		return node;
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
	public Node caseFXButton(FXButton object) {
		Button node = new Button(object.getName());
		return init(object, node);
	}
	
	@Override
	public Node caseFXHBox(FXHBox object) {
		HBox node = new HBox(object.getSpacing());
		object.getChildren().forEach(e->addChild(node, object));
		return init(object, node);
	}
	
	@Override
	public Node caseFXVBox(FXVBox object) {
		VBox node = new VBox(object.getSpacing());
		object.getChildren().forEach(e->addChild(node, object));
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
}