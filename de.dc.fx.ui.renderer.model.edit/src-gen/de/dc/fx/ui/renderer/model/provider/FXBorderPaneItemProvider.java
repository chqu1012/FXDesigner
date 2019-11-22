/**
 */
package de.dc.fx.ui.renderer.model.provider;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.UIFactory;
import de.dc.fx.ui.renderer.model.UIPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.fx.ui.renderer.model.FXBorderPane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FXBorderPaneItemProvider extends FXLayoutItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXBorderPaneItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UIPackage.Literals.FX_BORDER_PANE__LEFT);
			childrenFeatures.add(UIPackage.Literals.FX_BORDER_PANE__RIGHT);
			childrenFeatures.add(UIPackage.Literals.FX_BORDER_PANE__CENTER);
			childrenFeatures.add(UIPackage.Literals.FX_BORDER_PANE__BOTTOM);
			childrenFeatures.add(UIPackage.Literals.FX_BORDER_PANE__TOP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FXBorderPane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FXBorderPane"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FXBorderPane) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FXBorderPane_type")
				: getString("_UI_FXBorderPane_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FXBorderPane.class)) {
		case UIPackage.FX_BORDER_PANE__LEFT:
		case UIPackage.FX_BORDER_PANE__RIGHT:
		case UIPackage.FX_BORDER_PANE__CENTER:
		case UIPackage.FX_BORDER_PANE__BOTTOM:
		case UIPackage.FX_BORDER_PANE__TOP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT, UIFactory.eINSTANCE.createFXHBox()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT, UIFactory.eINSTANCE.createFXVBox()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT,
				UIFactory.eINSTANCE.createFXBorderPane()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT, UIFactory.eINSTANCE.createFXButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT, UIFactory.eINSTANCE.createFXLabel()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT,
				UIFactory.eINSTANCE.createFXCheckButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT,
				UIFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT, UIFactory.eINSTANCE.createFXListView()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT, UIFactory.eINSTANCE.createFXTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT,
				UIFactory.eINSTANCE.createFXFilteredTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__LEFT,
				UIFactory.eINSTANCE.createFXSortFilteredTableView()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT, UIFactory.eINSTANCE.createFXHBox()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT, UIFactory.eINSTANCE.createFXVBox()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT,
				UIFactory.eINSTANCE.createFXBorderPane()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT, UIFactory.eINSTANCE.createFXButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT, UIFactory.eINSTANCE.createFXLabel()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT,
				UIFactory.eINSTANCE.createFXCheckButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT,
				UIFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT, UIFactory.eINSTANCE.createFXListView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT,
				UIFactory.eINSTANCE.createFXTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT,
				UIFactory.eINSTANCE.createFXFilteredTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__RIGHT,
				UIFactory.eINSTANCE.createFXSortFilteredTableView()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER, UIFactory.eINSTANCE.createFXHBox()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER, UIFactory.eINSTANCE.createFXVBox()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXBorderPane()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER, UIFactory.eINSTANCE.createFXButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER, UIFactory.eINSTANCE.createFXLabel()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXCheckButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXListView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXFilteredTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__CENTER,
				UIFactory.eINSTANCE.createFXSortFilteredTableView()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM, UIFactory.eINSTANCE.createFXHBox()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM, UIFactory.eINSTANCE.createFXVBox()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXBorderPane()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM, UIFactory.eINSTANCE.createFXButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM, UIFactory.eINSTANCE.createFXLabel()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXCheckButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXListView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXFilteredTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__BOTTOM,
				UIFactory.eINSTANCE.createFXSortFilteredTableView()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXHBox()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXVBox()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXBorderPane()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXButton()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXLabel()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP,
				UIFactory.eINSTANCE.createFXCheckButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP,
				UIFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXListView()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP, UIFactory.eINSTANCE.createFXTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP,
				UIFactory.eINSTANCE.createFXFilteredTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_BORDER_PANE__TOP,
				UIFactory.eINSTANCE.createFXSortFilteredTableView()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UIPackage.Literals.FX_LAYOUT__CHILDREN
				|| childFeature == UIPackage.Literals.FX_BORDER_PANE__LEFT
				|| childFeature == UIPackage.Literals.FX_BORDER_PANE__RIGHT
				|| childFeature == UIPackage.Literals.FX_BORDER_PANE__CENTER
				|| childFeature == UIPackage.Literals.FX_BORDER_PANE__BOTTOM
				|| childFeature == UIPackage.Literals.FX_BORDER_PANE__TOP;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
