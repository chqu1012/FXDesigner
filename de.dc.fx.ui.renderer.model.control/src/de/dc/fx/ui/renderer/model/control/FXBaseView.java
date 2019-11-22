package de.dc.fx.ui.renderer.model.control;

import java.util.List;

import de.dc.fx.ui.renderer.model.FXNode;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public abstract class FXBaseView<T> extends VBox implements IFXNodeControl{

	protected ObservableList<T> masterData = FXCollections.observableArrayList(); 
	
	protected Control view;
	
	protected FXNode model;
	
	public FXBaseView(FXNode model) {
		this.model=model;
		view = initControl();
		VBox.setVgrow(view, Priority.ALWAYS);
		getChildren().add(view);
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
	
	public Control getControl() {
		if (view==null) {
			view = initControl();
		}
		return view;
	}

	protected abstract Control initControl();
}
