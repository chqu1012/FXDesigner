package de.dc.fx.ui.renderer.model.control;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXTableColumn;
import de.dc.fx.ui.renderer.model.FXTableView;
import javafx.scene.control.Control;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class FXTableViewControl<T> extends FXBaseView<T>{

	protected Map<String, TableColumn> columnsRegistry = new HashMap<String, TableColumn>();
	
	public FXTableViewControl(FXTableView model) {
		super(model);
		model.getColumns().forEach(e->createColumn(e));
		((TableView<T>)view).setItems(masterData);
	}
	
	public void createColumn(FXTableColumn e) {
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
		
		((TableView<T>)view).getColumns().add(column);
	}
	
	public Optional<TableColumn> findColumnBy(String id) {
		return Optional.of(columnsRegistry.get(id));
	}
	
	@Override
	public FXNode getFXNode() {
		return model;
	}

	@Override
	protected Control initControl() {
		return new TableView<T>();
	}
}
