package de.dc.fx.ui.renderer.model.control;

import javafx.scene.control.SelectionModel;

public interface IFXSelectionModelNode<T> extends IFXNodeControl{
	
	SelectionModel<T> getSelectionModel();
}
