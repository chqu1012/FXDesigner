package de.dc.fx.ui.renderer.model.control;

import java.util.HashMap;
import java.util.Map;

import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXTabPane;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class FXTabPaneControl extends TabPane implements IFXNodeControl{

	private FXTabPane model;
	private Map<String, Tab> tabRegistry = new HashMap<>();

	public FXTabPaneControl(FXTabPane model) {
		this.model = model;
	}
	
	public void createTab(String name, Node content) {
		Tab tab = new Tab(name);
		tab.setContent(content);
		getTabs().add(tab);
		tabRegistry.put(name, tab);
	}
	
	public Tab findBy(String name) {
		return tabRegistry.get(name);
	}
	
	@Override
	public FXNode getFXNode() {
		return model;
	}

}
