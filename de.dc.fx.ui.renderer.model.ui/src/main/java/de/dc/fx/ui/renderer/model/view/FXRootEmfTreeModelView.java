package de.dc.fx.ui.renderer.model.view;

import org.greenrobot.eventbus.Subscribe;

import de.dc.fx.ui.renderer.model.*;
import de.dc.fx.ui.renderer.model.manager.*;
import de.dc.fx.emf.support.file.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.emf.ui.di.EMFPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.event.EmfCommand;
import de.dc.javafx.xcore.workbench.emf.ui.event.EventContext;
import de.dc.javafx.xcore.workbench.emf.ui.event.EventTopic;
import de.dc.javafx.xcore.workbench.emf.ui.event.IEventBroker;

public class FXRootEmfTreeModelView extends EmfTreeModelView<FXRoot> {
	
	public FXRootEmfTreeModelView() {
		// Set edit mode for several attributes
		// addEditableFor(FXRootPackage.eINSTANCE.getName());

		
		EMFPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	public IEmfManager<FXRoot> getEmfManager() {
		if (manager==null) {
			manager = new FXRootEmfManager();
		}
		return manager;
	}

	@Subscribe
	public void updateViewByEventBroker(EventContext<EmfCommand> context) {
		if (context.getEventTopic()==EventTopic.COMMAND_STACK_REFRESH) {
			if (context.getInput() instanceof EmfCommand) {
//				manager.getRoot().getValues().add(context.getInput());
			}
		}
	}
	
	@Override
	public IEmfManager<FXRoot> initEmfManager() {
		return new FXRootEmfManager();
	}
}
