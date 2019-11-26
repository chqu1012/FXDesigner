package de.dc.fx.ui.renderer.model.ui;

import de.dc.fx.ui.renderer.model.control.FXTableViewControl;
import de.dc.fx.ui.renderer.model.renderer.UIRenderer;
import de.dc.fx.ui.renderer.model.ui.model.Person;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewApplication extends UIApplication{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	protected void init(UIRenderer renderer) {
		FXTableViewControl<Person> tableView = renderer.findNodeBy("personTableView");
		tableView.findColumnBy("columnFirstname").ifPresent(e-> e.setCellValueFactory(new PropertyValueFactory<>("name")));
		tableView.findColumnBy("columnLastname").ifPresent(e-> e.setCellValueFactory(new PropertyValueFactory<>("lastname")));
		tableView.findColumnBy("columnAge").ifPresent(e-> e.setCellValueFactory(new PropertyValueFactory<>("age")));
		tableView.findColumnBy("columnEmail").ifPresent(e-> e.setCellValueFactory(new PropertyValueFactory<>("email")));
		
		for (int i = 0; i < 20; i++) {
			tableView.add(new Person("Hello", "World", "For", "Your"));
		}
	}
	
	@Override
	protected String ui() {
		return "001_TableView.ui";
	}
}
