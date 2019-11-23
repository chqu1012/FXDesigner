package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXSortFilteredTableView
import javafx.collections.transformation.SortedList
import javafx.scene.control.TableView

class FXSortFilteredTableViewControl<T> extends FXFilteredTableViewControl<T> {
	SortedList<T> sortedList = new SortedList(filteredData)

	new(FXSortFilteredTableView model) {
		super(model)
		sortedList.comparatorProperty.bind(((view as TableView<T>)).comparatorProperty)
		((view as TableView<T>)).items = sortedList
	}
}
