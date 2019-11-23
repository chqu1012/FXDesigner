package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXAccordion
import java.util.HashMap
import java.util.Map
import javafx.scene.control.Accordion
import javafx.scene.control.TitledPane
import javafx.scene.Node

class FXAccordionControl extends Accordion implements IFXNodeControl{

	FXAccordion model

	Map<String, TitledPane> titledPaneRegistry = new HashMap

	new(FXAccordion model) {
		this.model=model
	}
	
	def createTtitlePane(String name, Node pane){
		val titledPane = pane as TitledPane
		titledPaneRegistry.put(name, titledPane)
		panes += titledPane
	}
	
	override getFXNode() {
		model
	}
	
}