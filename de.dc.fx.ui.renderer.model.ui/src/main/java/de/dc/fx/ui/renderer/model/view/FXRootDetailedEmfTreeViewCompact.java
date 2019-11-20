package de.dc.fx.ui.renderer.model.view;

import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeViewCompact;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;

public class FXRootDetailedEmfTreeViewCompact extends EmfDetailedTreeViewCompact<FXRoot> {

	@Override
	protected EmfTreeModelView<FXRoot> initEmfModelTreeView() {
		return new FXRootEmfTreeModelView();
	}
}
