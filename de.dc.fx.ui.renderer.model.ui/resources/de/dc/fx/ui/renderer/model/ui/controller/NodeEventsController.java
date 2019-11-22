package de.dc.fx.ui.renderer.model.ui.controller;

import de.dc.fx.ui.renderer.model.control.UI;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class NodeEventsController {
	
	@UI Label myLabel;
	@UI Button buttonFillValues;
	@UI Button buttonReset;
	Button buttonTest;

	public void initialize() {
		System.out.println("initialized!");
	}
	
	public void onMyButtonClicked(MouseEvent e) {
		if (e.getSource()==buttonFillValues) {
			myLabel.setText(e.toString());
		}
		if (e.getSource()==buttonReset) {
			myLabel.setText("Hello Reset");
		}
	}
}
