package de.dc.fx.ui.renderer.model.renderer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXEvent;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXTableColumn;
import de.dc.fx.ui.renderer.model.FXTableView;
import de.dc.fx.ui.renderer.model.util.UISwitch;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
		BorderPane root = new BorderPane();
		object.getChildren().forEach(e->root.setCenter(doSwitch(e)));
		return root;
	}

	@Override
	public Node caseFXTableView(FXTableView object) {
		TableView<Object> tableView = new TableView<>();
		object.getColumns().forEach(c->{
			TableColumn<Object, ?> column = new TableColumn<>(c.getName());
			tableView.getColumns().add(column );
			
			
		});
		return tableView;
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
		return new Button(object.getName());
	}
	
	@Override
	public Node caseFXHBox(FXHBox object) {
		HBox hbox = new HBox(object.getSpacing());
		object.getChildren().forEach(e->hbox.getChildren().add(doSwitch(e)));
		return hbox;
	}
	
	@Override
	public Node caseFXBorderPane(FXBorderPane object) {
		BorderPane borderPane = new BorderPane();
		FXNode center = object.getCenter();
		FXNode left = object.getLeft();
		FXNode right = object.getRight();
		FXNode bottom = object.getBottom();
		FXNode top = object.getRight();
		if (center!=null) {
			borderPane.setCenter(doSwitch(center));
		}
		if (left != null) {
			borderPane.setLeft(doSwitch(left));
		}
		if (right != null) {
			borderPane.setRight(doSwitch(right));
		}
		if (bottom != null) {
			borderPane.setBottom(doSwitch(bottom));
		}
		if (top != null) {
			borderPane.setTop(doSwitch(top));
		}
		return borderPane;
	}
}