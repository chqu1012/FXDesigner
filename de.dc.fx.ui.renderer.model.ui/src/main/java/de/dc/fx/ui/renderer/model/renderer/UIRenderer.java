package de.dc.fx.ui.renderer.model.renderer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXEvent;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXInsets;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXTableColumn;
import de.dc.fx.ui.renderer.model.FXTableView;
import de.dc.fx.ui.renderer.model.util.UISwitch;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.util.Callback;

public class UIRenderer extends UISwitch<Node> {

	private Map<String, Node> controlRegistry = new HashMap<>();
	private Map<String, TableColumn> columnsRegistry = new HashMap<>();
	
	private Class<?> controller;
	private Object controllerInstance;

	@SuppressWarnings("unchecked")
	public <T extends Node> T findNodeBy(String id) {
		return (T) controlRegistry.get(id);
	}

	public TableColumn findColumnBy(String id) {
		return columnsRegistry.get(id);
	}
	
	private void init(FXNode object, Region node) {
		controlRegistry.put(object.getId(), node);
		initSize(object, node);
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
	
	@SuppressWarnings("unused")
	private void invokeMethod(String name, FXEvent event) {
		if (controller!=null) {
			Method initializeMethod;
			try {
				initializeMethod = controller.getMethod(name,event.getClass());
				initializeMethod.invoke(controllerInstance, event);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public Node caseFXRoot(FXRoot object) {
		if (object.getController()!=null) {
			try {
				controller = Class.forName(object.getController());
				controllerInstance = controller.newInstance();
				Method initializeMethod = controller.getMethod("initialize");
				initializeMethod.invoke(controllerInstance,null);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		BorderPane node = new BorderPane();
		object.getChildren().forEach(e->node.setCenter(doSwitch(e)));
		return node;
	}

	@Override
	public Node caseFXTableView(FXTableView object) {
		TableView<Object> node = new TableView<>();
		object.getColumns().forEach(c->{
			TableColumn<Object, ?> column = new TableColumn<>(c.getName());
			node.getColumns().add(column );
		});
		init(object, node);
		return node;
	}
	
	private void addColumn(TableView<Object> view, FXTableColumn e) {
		TableColumn column = new TableColumn(e.getName());
		if (null!=e.getCellFactory()) {
			try {
				Class<?> c = Class.forName(e.getCellFactory());
				Object instance = c.newInstance();
				if (instance instanceof Callback) {
					Callback feature = (Callback) instance;
					column.setCellFactory(feature);
				}
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
		}
		
		String id = e.getId() == null? e.getName() : e.getId();
		columnsRegistry.put(id , column);
		
		view.getColumns().add(column);
	}
	
	@Override
	public Node caseFXButton(FXButton object) {
		Button node = new Button(object.getName());
		init(object, node);
		return node;
	}
	
	@Override
	public Node caseFXHBox(FXHBox object) {
		HBox node = new HBox(object.getSpacing());
		object.getChildren().forEach(e->node.getChildren().add(doSwitch(e)));
		init(object, node);
		return node;
	}
	
	@Override
	public Node caseFXBorderPane(FXBorderPane object) {
		BorderPane node = new BorderPane();
		node.setLayoutX(object.getLayoutX());
		node.setLayoutY(object.getLayoutY());

		init(object, node);

		createBorderPaneItem(object.getLeft()).ifPresent(e -> node.setLeft(e));
		createBorderPaneItem(object.getRight()).ifPresent(e -> node.setRight(e));
		createBorderPaneItem(object.getTop()).ifPresent(e -> node.setTop(e));
		createBorderPaneItem(object.getBottom()).ifPresent(e -> node.setBottom(e));
		createBorderPaneItem(object.getCenter()).ifPresent(e -> node.setCenter(e));

		object.getChildren().forEach(e -> addChild(node, e));
		return node;
	}
	
	private Optional<Node> createBorderPaneItem(FXNode mNode) {
		if (mNode!=null) {
			Optional<Node> node = Optional.ofNullable(doSwitch(mNode));
			BorderPane.setMargin(node.get(), createInsets(mNode.getMargin()));
			return node;
		}
		return Optional.empty();
	}
	
	private Insets createInsets(FXInsets mMargin) {
		if (mMargin == null) {
			return new Insets(5);
		}
		return new Insets(mMargin.getLeft(), mMargin.getRight(), mMargin.getTop(), mMargin.getBottom());
	}
	
	private void addChild(Pane node, FXNode eNode) {
		Node current = doSwitch(eNode);
		initSize(eNode, node);
		node.getChildren().add(current);
	}
}