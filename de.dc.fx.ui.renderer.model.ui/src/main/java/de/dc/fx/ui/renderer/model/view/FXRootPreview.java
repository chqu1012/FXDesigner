package de.dc.fx.ui.renderer.model.view;

import org.eclipse.emf.ecore.util.Switch;

import de.dc.fx.ui.renderer.model.renderer.UIRenderer;
import de.dc.javafx.xcore.workbench.emf.ui.EmfPreview;
import javafx.scene.Node;

public class FXRootPreview extends EmfPreview{

	@Override
	public Switch<Node> initRenderer() {
		return new UIRenderer();
	}
	
	@Override
	protected String getTitle() {
		return "FXPreview";
	}

}
