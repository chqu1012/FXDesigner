package de.dc.fx.ui.renderer.model.ui.controller;

import javafx.scene.input.MouseEvent;

public class PersonListViewController {

	public void initialize() {
		System.out.println("initialize");
	}
	
	public void onListViewPersonClicked(MouseEvent e) {
		System.out.println(e);
	}
}
