package de.dc.fx.ui.renderer.model.view;

import org.eclipse.emf.ecore.EObject;
import org.greenrobot.eventbus.Subscribe;

import de.dc.fx.emf.support.file.IEmfManager;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.manager.FXRootEmfManager;
import de.dc.fx.ui.renderer.model.renderer.UIRenderer;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.emf.ui.di.EMFPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.event.EmfCommand;
import de.dc.javafx.xcore.workbench.emf.ui.event.EventContext;
import de.dc.javafx.xcore.workbench.emf.ui.event.EventTopic;
import de.dc.javafx.xcore.workbench.emf.ui.event.IEventBroker;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXRootEmfTreeModelView extends EmfTreeModelView<FXRoot> {
	
	private UIRenderer renderer = new UIRenderer();
	
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
	
	@Override
	public void onTreeViewMouseClicked(MouseEvent event) {
		super.onTreeViewMouseClicked(event);
		if (event.getClickCount()==2) {
			Stage s = new Stage();
			Object value = treeView.getSelectionModel().getSelectedItem().getValue();
			Node node = renderer.doSwitch((EObject) value);
			Scene addFrame = new Scene(new BorderPane(node), 280, 450);
			s.setScene(addFrame);
			s.show();
		}
	}
}
