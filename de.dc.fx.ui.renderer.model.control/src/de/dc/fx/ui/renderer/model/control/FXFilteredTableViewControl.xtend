package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXFilteredTableView
import javafx.collections.transformation.FilteredList
import javafx.scene.control.TableView
import javafx.scene.control.TextField

class FXFilteredTableViewControl<T> extends FXTableViewControl<T> {
	
	protected FilteredList<T> filteredData = new FilteredList(masterData)
	protected TextField textSearch = new TextField

	new(FXFilteredTableView model) {
		super(model)
		textSearch.promptText = "Search for entries"
		children.add(0, textSearch)
		((view as TableView<T>)).items = filteredData
	}
}
