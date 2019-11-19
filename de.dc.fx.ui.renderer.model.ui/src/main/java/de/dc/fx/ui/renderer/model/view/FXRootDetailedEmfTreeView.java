package de.dc.fx.ui.renderer.model.view;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.greenrobot.eventbus.EventBus;

import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.emf.ui.event.EventContext;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;

public class FXRootDetailedEmfTreeView extends EmfDetailedTreeView<FXRoot> {

	public FXRootDetailedEmfTreeView() {
		removeChildPropertiesTableView();
	}
	
	@Override
	protected EmfTreeModelView<FXRoot> initEmfModelTreeView() {
		return new FXRootEmfTreeModelView();
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> obs, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		clearAllFields();
		if (newValue != null) {
			Object value = newValue.getValue();
			if (value instanceof EObject) {
				EObject eObject = (EObject) value;
				initAttributeFormular(eObject);
				EventBus.getDefault().post(new EventContext<EObject>("/update/emfworkbench/toolbar", eObject));
			}
		}
	}
	
	@Override
	public boolean initAttributeFormular(EObject eObject) {
		EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
		attributes.forEach(e->{
			typeFormSwitch.setCurrentEObject(eObject);
			attributeContainer.getChildren().add(typeFormSwitch.doSwitch(e));
		});
		
		Button acceptAllButton = new Button("Accept All");
		acceptAllButton.setOnAction(e-> typeFormSwitch.acceptAllValues());
		return attributeContainer.getChildren().add(acceptAllButton);
	}

}
