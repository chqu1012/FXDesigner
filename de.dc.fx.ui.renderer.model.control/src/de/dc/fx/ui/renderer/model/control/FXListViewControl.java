package de.dc.fx.ui.renderer.model.control;

import de.dc.fx.ui.renderer.model.FXListView;
import de.dc.fx.ui.renderer.model.FXNode;
import javafx.scene.control.Control;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;

public class FXListViewControl<T> extends FXBaseView<T>{

	protected FXListView model;

	public FXListViewControl(FXListView model) {
		super(model);
		((ListView<T>)view).setItems(masterData);
	}
	
	@Override
	public FXNode getFXNode() {
		return model;
	}

	@Override
	protected Control initControl() {
		return new ListView<T>();
	}

	@Override
	public SelectionModel<T> getSelectionModel() {
		return ((ListView<T>)view).getSelectionModel();
	}
}
