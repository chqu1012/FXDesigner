/**
 */
package de.dc.fx.ui.renderer.model.provider;

import de.dc.fx.ui.renderer.model.FXLayout;

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
 * This is the item provider adapter for a {@link de.dc.fx.ui.renderer.model.FXLayout} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FXLayoutItemProvider extends FXNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXLayoutItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(UIPackage.Literals.FX_LAYOUT__CHILDREN);
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
		String label = ((FXLayout) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FXLayout_type")
				: getString("_UI_FXLayout_type") + " " + label;
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

		switch (notification.getFeatureID(FXLayout.class)) {
		case UIPackage.FX_LAYOUT__CHILDREN:
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
				.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN, UIFactory.eINSTANCE.createFXHBox()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN, UIFactory.eINSTANCE.createFXVBox()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN, UIFactory.eINSTANCE.createFXBorderPane()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN, UIFactory.eINSTANCE.createFXButton()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN, UIFactory.eINSTANCE.createFXLabel()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN,
				UIFactory.eINSTANCE.createFXCheckButton()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN,
				UIFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(
				createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN, UIFactory.eINSTANCE.createFXTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN,
				UIFactory.eINSTANCE.createFXFilteredTableView()));

		newChildDescriptors.add(createChildParameter(UIPackage.Literals.FX_LAYOUT__CHILDREN,
				UIFactory.eINSTANCE.createFXSortFilteredTableView()));
	}

}
