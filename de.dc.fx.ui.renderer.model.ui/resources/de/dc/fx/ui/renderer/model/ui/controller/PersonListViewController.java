package de.dc.fx.ui.renderer.model.ui.controller;

import de.dc.fx.ui.renderer.model.control.FXListViewControl;
import de.dc.fx.ui.renderer.model.control.UI;
import javafx.scene.input.MouseEvent;

public class PersonListViewController {

	@UI FXListViewControl<String> listViewPerson;
	
	public void initialize() {
		System.out.println("initialize");
	}
	
	public void onListViewPersonClicked(MouseEvent e) {
		System.out.println(e);
	}
	
	public void onButtonClicked(MouseEvent e) {
		listViewPerson.getMasterData().add("Hello World");
	}
}
