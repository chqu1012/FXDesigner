package de.dc.fx.ui.renderer.model.control;

import de.dc.fx.ui.renderer.model.FXListView;
import de.dc.fx.ui.renderer.model.FXNode;
import javafx.scene.control.Control;
import javafx.scene.control.ListView;

public class FXListViewControl<T> extends FXBaseView<T> implements IFXNodeControl{

	protected FXListView model;

	protected ListView<T> view = new ListView<>(masterData);
	
	public FXListViewControl(FXListView model) {
		super(model);
	}
	
	@Override
	public FXNode getFXNode() {
		return model;
	}

	@Override
	protected Control initControl() {
		return new ListView<T>();
	}
}
