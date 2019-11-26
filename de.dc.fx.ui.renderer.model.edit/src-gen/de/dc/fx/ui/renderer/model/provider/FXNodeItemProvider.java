/**
 */
package de.dc.fx.ui.renderer.model.provider;

import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.UIFactory;
import de.dc.fx.ui.renderer.model.UIPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.fx.ui.renderer.model.FXNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FXNodeItemProvider extends FXEventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXNodeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOpacityPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addDisablePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
			addLayoutXPropertyDescriptor(object);
			addLayoutYPropertyDescriptor(object);
			addPrefWidthPropertyDescriptor(object);
			addPrefHeightPropertyDescriptor(object);
			addMinWidthPropertyDescriptor(object);
			addMinHeightPropertyDescriptor(object);
			addMaxWidthPropertyDescriptor(object);
			addMaxHeightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNamedElement_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNamedElement_id_feature",
								"_UI_FXNamedElement_type"),
						UIPackage.Literals.FX_NAMED_ELEMENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNamedElement_name_feature",
								"_UI_FXNamedElement_type"),
						UIPackage.Literals.FX_NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_opacity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_opacity_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__OPACITY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_visible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_visible_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__VISIBLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Disable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_disable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_disable_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__DISABLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_style_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_style_feature", "_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__STYLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_StylePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_styleClass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_styleClass_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__STYLE_CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_StylePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Layout X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_layoutX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_layoutX_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__LAYOUT_X, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Layout Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_layoutY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_layoutY_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__LAYOUT_Y, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Pref Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_prefWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_prefWidth_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__PREF_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Pref Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_prefHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_prefHeight_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__PREF_HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Min Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_minWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_minWidth_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__MIN_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Min Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_minHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_minHeight_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__MIN_HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Max Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_maxWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_maxWidth_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__MAX_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Max Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXNode_maxHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXNode_maxHeight_feature",
								"_UI_FXNode_type"),
						UIPackage.Literals.FX_NODE__MAX_HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
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
			childrenFeatures.add(UIPackage.Literals.FX_NODE__PADDING);
			childrenFeatures.add(UIPackage.Literals.FX_NODE__MARGIN);
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
		String label = ((FXNode) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FXNode_type")
				: getString("_UI_FXNode_type") + " " + label;
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

		switch (notification.getFeatureID(FXNode.class)) {
		case UIPackage.FX_NODE__ID:
		case UIPackage.FX_NODE__NAME:
		case UIPackage.FX_NODE__OPACITY:
		case UIPackage.FX_NODE__VISIBLE:
		case UIPackage.FX_NODE__DISABLE:
		case UIPackage.FX_NODE__STYLE:
		case UIPackage.FX_NODE__STYLE_CLASS:
		case UIPackage.FX_NODE__LAYOUT_X:
		case UIPackage.FX_NODE__LAYOUT_Y:
		case UIPackage.FX_NODE__PREF_WIDTH:
		case UIPackage.FX_NODE__PREF_HEIGHT:
		case UIPackage.FX_NODE__MIN_WIDTH:
		case UIPackage.FX_NODE__MIN_HEIGHT:
		case UIPackage.FX_NODE__MAX_WIDTH:
		case UIPackage.FX_NODE__MAX_HEIGHT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case UIPackage.FX_NODE__PADDING:
		case UIPackage.FX_NODE__MARGIN:
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
				.add(createChildParameter(UIPackage.Literals.FX_NODE__PADDING, UIFactory.eINSTANCE.createFXPadding()));

		newChildDescriptors
				.add(createChildParameter(UIPackage.Literals.FX_NODE__MARGIN, UIFactory.eINSTANCE.createFXMargin()));
	}

}
