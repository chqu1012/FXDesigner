package de.dc.fx.ui.renderer.model.ui.controller;

import de.dc.fx.ui.renderer.model.control.FXTableViewControl;
import de.dc.fx.ui.renderer.model.control.UI;
import de.dc.fx.ui.renderer.model.renderer.UIRenderer;
import de.dc.fx.ui.renderer.model.ui.model.Person;

public class TabPaneController {

	@UI UIRenderer renderer;
	@UI FXTableViewControl<Person> personTableView;
	
	public void initialize() {
		System.out.println("Renderer: "+renderer);
		System.out.println("TableView: "+personTableView);
	}
}
