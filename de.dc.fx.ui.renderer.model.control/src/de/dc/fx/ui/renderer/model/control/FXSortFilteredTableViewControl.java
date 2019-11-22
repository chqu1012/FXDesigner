package de.dc.fx.ui.renderer.model.control;

import de.dc.fx.ui.renderer.model.FXSortFilteredTableView;
import javafx.collections.transformation.SortedList;

public class FXSortFilteredTableViewControl<T> extends FXFilteredTableViewControl<T>{

	private SortedList<T> sortedList = new SortedList<>(filteredData);
	
	public FXSortFilteredTableViewControl(FXSortFilteredTableView model) {
		super(model);
		sortedList.comparatorProperty().bind(tableView.comparatorProperty());
		tableView.setItems(sortedList);
	}
}
