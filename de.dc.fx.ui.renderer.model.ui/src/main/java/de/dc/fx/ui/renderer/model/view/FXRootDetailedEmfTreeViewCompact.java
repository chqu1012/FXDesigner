package de.dc.fx.ui.renderer.model.view;

import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.template.BaseControllerTemplate;
import de.dc.fx.ui.renderer.model.template.ControllerTemplate;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeViewCompact;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;

public class FXRootDetailedEmfTreeViewCompact extends EmfDetailedTreeViewCompact<FXRoot> {

	private ControllerTemplate tpl = new ControllerTemplate();
	private BaseControllerTemplate bastpl = new BaseControllerTemplate();
	
	@Override
	protected EmfTreeModelView<FXRoot> initEmfModelTreeView() {
		FXRootEmfTreeModelView view = new FXRootEmfTreeModelView();
		view.activeGenerateMenu(true);
		view.addMenuItemToGenerateMenu("Generate Controller", t -> {
			System.out.println(tpl.gen((FXRoot) t.getValue()));
			System.out.println(bastpl.gen((FXRoot) t.getValue()));
			return null;
		});
		return view;
	}
}
