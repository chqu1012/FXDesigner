/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXInsets;
import de.dc.fx.ui.renderer.model.UIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Insets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXInsetsImpl#getTop <em>Top</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXInsetsImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXInsetsImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXInsetsImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXInsetsImpl extends MinimalEObjectImpl.Container implements FXInsets {
	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected double top = TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected double bottom = BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected double right = RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected double left = LEFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXInsetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.FX_INSETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTop(double newTop) {
		double oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_INSETS__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottom(double newBottom) {
		double oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_INSETS__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(double newRight) {
		double oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_INSETS__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(double newLeft) {
		double oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_INSETS__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UIPackage.FX_INSETS__TOP:
			return getTop();
		case UIPackage.FX_INSETS__BOTTOM:
			return getBottom();
		case UIPackage.FX_INSETS__RIGHT:
			return getRight();
		case UIPackage.FX_INSETS__LEFT:
			return getLeft();
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
		case UIPackage.FX_INSETS__TOP:
			setTop((Double) newValue);
			return;
		case UIPackage.FX_INSETS__BOTTOM:
			setBottom((Double) newValue);
			return;
		case UIPackage.FX_INSETS__RIGHT:
			setRight((Double) newValue);
			return;
		case UIPackage.FX_INSETS__LEFT:
			setLeft((Double) newValue);
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
		case UIPackage.FX_INSETS__TOP:
			setTop(TOP_EDEFAULT);
			return;
		case UIPackage.FX_INSETS__BOTTOM:
			setBottom(BOTTOM_EDEFAULT);
			return;
		case UIPackage.FX_INSETS__RIGHT:
			setRight(RIGHT_EDEFAULT);
			return;
		case UIPackage.FX_INSETS__LEFT:
			setLeft(LEFT_EDEFAULT);
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
		case UIPackage.FX_INSETS__TOP:
			return top != TOP_EDEFAULT;
		case UIPackage.FX_INSETS__BOTTOM:
			return bottom != BOTTOM_EDEFAULT;
		case UIPackage.FX_INSETS__RIGHT:
			return right != RIGHT_EDEFAULT;
		case UIPackage.FX_INSETS__LEFT:
			return left != LEFT_EDEFAULT;
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
		result.append(" (top: ");
		result.append(top);
		result.append(", bottom: ");
		result.append(bottom);
		result.append(", right: ");
		result.append(right);
		result.append(", left: ");
		result.append(left);
		result.append(')');
		return result.toString();
	}

} //FXInsetsImpl
