/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXEvent;
import de.dc.fx.ui.renderer.model.UIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXEventImpl#getOnMouseClicked <em>On Mouse Clicked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXEventImpl extends MinimalEObjectImpl.Container implements FXEvent {
	/**
	 * The default value of the '{@link #getOnMouseClicked() <em>On Mouse Clicked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMouseClicked()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_MOUSE_CLICKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnMouseClicked() <em>On Mouse Clicked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMouseClicked()
	 * @generated
	 * @ordered
	 */
	protected String onMouseClicked = ON_MOUSE_CLICKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.FX_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnMouseClicked() {
		return onMouseClicked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnMouseClicked(String newOnMouseClicked) {
		String oldOnMouseClicked = onMouseClicked;
		onMouseClicked = newOnMouseClicked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_EVENT__ON_MOUSE_CLICKED,
					oldOnMouseClicked, onMouseClicked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UIPackage.FX_EVENT__ON_MOUSE_CLICKED:
			return getOnMouseClicked();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UIPackage.FX_EVENT__ON_MOUSE_CLICKED:
			setOnMouseClicked((String) newValue);
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
		case UIPackage.FX_EVENT__ON_MOUSE_CLICKED:
			setOnMouseClicked(ON_MOUSE_CLICKED_EDEFAULT);
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
		case UIPackage.FX_EVENT__ON_MOUSE_CLICKED:
			return ON_MOUSE_CLICKED_EDEFAULT == null ? onMouseClicked != null
					: !ON_MOUSE_CLICKED_EDEFAULT.equals(onMouseClicked);
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
		result.append(" (onMouseClicked: ");
		result.append(onMouseClicked);
		result.append(')');
		return result.toString();
	}

} //FXEventImpl
