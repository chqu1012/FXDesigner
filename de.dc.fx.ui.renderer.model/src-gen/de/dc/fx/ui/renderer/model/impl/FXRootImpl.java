/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.UIPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl#getController <em>Controller</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXRootImpl extends MinimalEObjectImpl.Container implements FXRoot {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<FXNode> children;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected String controller = CONTROLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> styleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.FX_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FXNode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<FXNode>(FXNode.class, this, UIPackage.FX_ROOT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_ROOT__BASE_PACKAGE, oldBasePackage,
					basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(String newController) {
		String oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_ROOT__CONTROLLER, oldController,
					controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStyleClass() {
		if (styleClass == null) {
			styleClass = new EDataTypeEList<String>(String.class, this, UIPackage.FX_ROOT__STYLE_CLASS);
		}
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UIPackage.FX_ROOT__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UIPackage.FX_ROOT__CHILDREN:
			return getChildren();
		case UIPackage.FX_ROOT__BASE_PACKAGE:
			return getBasePackage();
		case UIPackage.FX_ROOT__CONTROLLER:
			return getController();
		case UIPackage.FX_ROOT__NAME:
			return getName();
		case UIPackage.FX_ROOT__STYLE_CLASS:
			return getStyleClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UIPackage.FX_ROOT__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends FXNode>) newValue);
			return;
		case UIPackage.FX_ROOT__BASE_PACKAGE:
			setBasePackage((String) newValue);
			return;
		case UIPackage.FX_ROOT__CONTROLLER:
			setController((String) newValue);
			return;
		case UIPackage.FX_ROOT__NAME:
			setName((String) newValue);
			return;
		case UIPackage.FX_ROOT__STYLE_CLASS:
			getStyleClass().clear();
			getStyleClass().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UIPackage.FX_ROOT__CHILDREN:
			getChildren().clear();
			return;
		case UIPackage.FX_ROOT__BASE_PACKAGE:
			setBasePackage(BASE_PACKAGE_EDEFAULT);
			return;
		case UIPackage.FX_ROOT__CONTROLLER:
			setController(CONTROLLER_EDEFAULT);
			return;
		case UIPackage.FX_ROOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UIPackage.FX_ROOT__STYLE_CLASS:
			getStyleClass().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UIPackage.FX_ROOT__CHILDREN:
			return children != null && !children.isEmpty();
		case UIPackage.FX_ROOT__BASE_PACKAGE:
			return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
		case UIPackage.FX_ROOT__CONTROLLER:
			return CONTROLLER_EDEFAULT == null ? controller != null : !CONTROLLER_EDEFAULT.equals(controller);
		case UIPackage.FX_ROOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UIPackage.FX_ROOT__STYLE_CLASS:
			return styleClass != null && !styleClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", controller: ");
		result.append(controller);
		result.append(", name: ");
		result.append(name);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //FXRootImpl
