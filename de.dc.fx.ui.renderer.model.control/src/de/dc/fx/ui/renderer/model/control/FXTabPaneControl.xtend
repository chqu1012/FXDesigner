package de.dc.fx.ui.renderer.model.control

import de.dc.fx.ui.renderer.model.FXTabPane
import java.util.HashMap
import java.util.Map
import javafx.scene.Node
import javafx.scene.control.Tab
import javafx.scene.control.TabPane

class FXTabPaneControl extends TabPane implements IFXNodeControl {
	
	FXTabPane model
	Map<String, Tab> tabRegistry = new HashMap

	new(FXTabPane model) {
		this.model = model
	}

	def createTab(String name, Node content) {
		var tab = new Tab(name)
		tab.content = content
		tabs += tab
		tabRegistry.put(name, tab)
	}

	def findBy(String name) {
		tabRegistry.get(name)
	}

	override getFXNode() {
		model
	}
}
