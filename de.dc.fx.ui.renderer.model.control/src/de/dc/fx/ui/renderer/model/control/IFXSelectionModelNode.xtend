package de.dc.fx.ui.renderer.model.control

import javafx.scene.control.SelectionModel

interface IFXSelectionModelNode<T> extends IFXNodeControl {
	def SelectionModel<T> getSelectionModel()

}
