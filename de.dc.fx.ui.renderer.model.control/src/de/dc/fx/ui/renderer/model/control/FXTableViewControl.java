package de.dc.fx.ui.renderer.model.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXTableColumn;
import de.dc.fx.ui.renderer.model.FXTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class FXTableViewControl<T> extends TableView<T> implements IFXNodeControl{

	private FXTableView model;
	private Map<String, TableColumn> columnsRegistry = new HashMap<String, TableColumn>();
	private ObservableList<T> masterData = FXCollections.observableArrayList(); 
	
	public FXTableViewControl(FXTableView model) {
		this.model=model;
		model.getColumns().forEach(e->createColumn(e));
		setItems(masterData);
	}
	
	public void add(T t) {
		this.masterData.add(t);
	}

	public void addAll(List<T> t) {
		this.masterData.addAll(t);
	}
	
	public void clear() {
		this.masterData.clear();
	}
	
	public ObservableList<T> getMasterData(){
		return masterData;
	}
	
	private void createColumn(FXTableColumn e) {
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
		
		getColumns().add(column);
	}

	public Optional<TableColumn> findColumnBy(String id) {
		return Optional.of(columnsRegistry.get(id));
	}
	
	@Override
	public FXNode getFXNode() {
		return model;
	}
}
