package de.dc.fx.ui.renderer.model.control

import java.util.List
import de.dc.fx.ui.renderer.model.FXNode
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.control.Control
import javafx.scene.layout.Priority
import javafx.scene.layout.VBox

abstract class FXBaseView<T> extends VBox implements IFXSelectionModelNode<T> {
	
	protected ObservableList<T> masterData = FXCollections::observableArrayList()
	protected Control view
	protected FXNode model

	new(FXNode model) {
		this.model = model
		view = initControl
		VBox::setVgrow(view, Priority::ALWAYS)
		children += view
	}

	def add(T t) {
		this.masterData += t
	}

	def addAll(List<T> t) {
		this.masterData += t
	}

	def clear() {
		this.masterData.clear
	}

	def getMasterData() {
		masterData
	}

	def getControl() {
		if (view === null) {
			view = initControl
		}
		view
	}

	def protected abstract Control initControl()

}
