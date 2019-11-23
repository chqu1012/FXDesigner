/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXTabClosePolicy;
import de.dc.fx.ui.renderer.model.FXTabPane;
import de.dc.fx.ui.renderer.model.UIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Tab Pane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXTabPaneImpl#getTabClosePolicy <em>Tab Close Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXTabPaneImpl extends FXLayoutImpl implements FXTabPane {
	/**
	 * The default value of the '{@link #getTabClosePolicy() <em>Tab Close Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabClosePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final FXTabClosePolicy TAB_CLOSE_POLICY_EDEFAULT = FXTabClosePolicy.ALL_TABS;

	/**
	 * The cached value of the '{@link #getTabClosePolicy() <em>Tab Close Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabClosePolicy()
	 * @generated
	 * @ordered
	 */
	protected FXTabClosePolicy tabClosePolicy = TAB_CLOSE_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTabPaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.FX_TAB_PANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXTabClosePolicy getTabClosePolicy() {
		return tabClosePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabClosePolicy(FXTabClosePolicy newTabClosePolicy) {
		FXTabClosePolicy oldTabClosePolicy = tabClosePolicy;
		tabClosePolicy = newTabClosePolicy == null ? TAB_CLOSE_POLICY_EDEFAULT : newTabClosePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_TAB_PANE__TAB_CLOSE_POLICY,
					oldTabClosePolicy, tabClosePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UIPackage.FX_TAB_PANE__TAB_CLOSE_POLICY:
			return getTabClosePolicy();
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
		case UIPackage.FX_TAB_PANE__TAB_CLOSE_POLICY:
			setTabClosePolicy((FXTabClosePolicy) newValue);
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
		case UIPackage.FX_TAB_PANE__TAB_CLOSE_POLICY:
			setTabClosePolicy(TAB_CLOSE_POLICY_EDEFAULT);
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
		case UIPackage.FX_TAB_PANE__TAB_CLOSE_POLICY:
			return tabClosePolicy != TAB_CLOSE_POLICY_EDEFAULT;
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
		result.append(" (tabClosePolicy: ");
		result.append(tabClosePolicy);
		result.append(')');
		return result.toString();
	}

} //FXTabPaneImpl
