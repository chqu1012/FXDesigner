package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXListView
import javafx.scene.control.ListView

class FXListViewControl<T> extends FXBaseView<T> {
	protected FXListView model

	new(FXListView model) {
		super(model)
		((view as ListView<T>)).items = masterData
	}

	override getFXNode() {
		model
	}

	override protected initControl() {
		new ListView<T>
	}

	override getSelectionModel() {
		((view as ListView<T>)).selectionModel
	}
}
