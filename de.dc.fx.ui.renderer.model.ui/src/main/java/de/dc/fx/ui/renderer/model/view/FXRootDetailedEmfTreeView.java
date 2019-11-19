package de.dc.fx.ui.renderer.model.view;

import de.dc.fx.ui.renderer.model.*;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;

public class FXRootDetailedEmfTreeView extends EmfDetailedTreeView<FXRoot>{

	@Override
	protected EmfTreeModelView<FXRoot> initEmfModelTreeView() {
		return new FXRootEmfTreeModelView();
	}

}
