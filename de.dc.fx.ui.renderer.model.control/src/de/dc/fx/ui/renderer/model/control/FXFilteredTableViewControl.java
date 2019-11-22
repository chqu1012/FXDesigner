package de.dc.fx.ui.renderer.model.control;

import de.dc.fx.ui.renderer.model.FXFilteredTableView;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXFilteredTableViewControl<T> extends FXTableViewControl<T>{

	protected FilteredList<T> filteredData = new FilteredList<>(masterData);
	
	protected TextField textSearch = new TextField();
	
	public FXFilteredTableViewControl(FXFilteredTableView model) {
		super(model);
		textSearch.setPromptText("Search for entries");
		getChildren().add(0, textSearch);
		((TableView<T>)view).setItems(filteredData);
	}

}
