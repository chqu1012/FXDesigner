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
		
		tableView.add(new Person("Jules", "Pumas", "15", "jules.pumas@mail.com"));
		tableView.add(new Person("Peter", "Jackman", "43", "peter.jack@mail.com"));
		tableView.add(new Person("Rick", "Ross", "23", "rick.ross@mail.com"));
		tableView.add(new Person("Anna", "Liesa", "54", "anna.liesa@mail.com"));
		
		tableView.setOnMouseClicked(e-> System.out.println(tableView.getMasterData().size()));
	}
	
	@Override
	protected String ui() {
		return "001_TableView.ui";
	}
}
