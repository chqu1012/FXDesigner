/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.UIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Border Pane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl#getTop <em>Top</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXBorderPaneImpl extends FXLayoutImpl implements FXBorderPane {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected FXNode left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected FXNode right;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected FXNode center;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected FXNode bottom;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected FXNode top;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXBorderPaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.FX_BORDER_PANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXNode getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(FXNode newLeft, NotificationChain msgs) {
		FXNode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UIPackage.FX_BORDER_PANE__LEFT, oldLeft, newLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(FXNode newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_BORDER_PANE__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXNode getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(FXNode newRight, NotificationChain msgs) {
		FXNode oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UIPackage.FX_BORDER_PANE__RIGHT, oldRight, newRight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(FXNode newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_BORDER_PANE__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXNode getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenter(FXNode newCenter, NotificationChain msgs) {
		FXNode oldCenter = center;
		center = newCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UIPackage.FX_BORDER_PANE__CENTER, oldCenter, newCenter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenter(FXNode newCenter) {
		if (newCenter != center) {
			NotificationChain msgs = null;
			if (center != null)
				msgs = ((InternalEObject) center).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__CENTER, null, msgs);
			if (newCenter != null)
				msgs = ((InternalEObject) newCenter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__CENTER, null, msgs);
			msgs = basicSetCenter(newCenter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_BORDER_PANE__CENTER, newCenter,
					newCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXNode getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottom(FXNode newBottom, NotificationChain msgs) {
		FXNode oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UIPackage.FX_BORDER_PANE__BOTTOM, oldBottom, newBottom);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottom(FXNode newBottom) {
		if (newBottom != bottom) {
			NotificationChain msgs = null;
			if (bottom != null)
				msgs = ((InternalEObject) bottom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__BOTTOM, null, msgs);
			if (newBottom != null)
				msgs = ((InternalEObject) newBottom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__BOTTOM, null, msgs);
			msgs = basicSetBottom(newBottom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_BORDER_PANE__BOTTOM, newBottom,
					newBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXNode getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTop(FXNode newTop, NotificationChain msgs) {
		FXNode oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UIPackage.FX_BORDER_PANE__TOP, oldTop, newTop);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTop(FXNode newTop) {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject) top).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__TOP, null, msgs);
			if (newTop != null)
				msgs = ((InternalEObject) newTop).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_BORDER_PANE__TOP, null, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_BORDER_PANE__TOP, newTop, newTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UIPackage.FX_BORDER_PANE__LEFT:
			return basicSetLeft(null, msgs);
		case UIPackage.FX_BORDER_PANE__RIGHT:
			return basicSetRight(null, msgs);
		case UIPackage.FX_BORDER_PANE__CENTER:
			return basicSetCenter(null, msgs);
		case UIPackage.FX_BORDER_PANE__BOTTOM:
			return basicSetBottom(null, msgs);
		case UIPackage.FX_BORDER_PANE__TOP:
			return basicSetTop(null, msgs);
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
		case UIPackage.FX_BORDER_PANE__LEFT:
			return getLeft();
		case UIPackage.FX_BORDER_PANE__RIGHT:
			return getRight();
		case UIPackage.FX_BORDER_PANE__CENTER:
			return getCenter();
		case UIPackage.FX_BORDER_PANE__BOTTOM:
			return getBottom();
		case UIPackage.FX_BORDER_PANE__TOP:
			return getTop();
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
		case UIPackage.FX_BORDER_PANE__LEFT:
			setLeft((FXNode) newValue);
			return;
		case UIPackage.FX_BORDER_PANE__RIGHT:
			setRight((FXNode) newValue);
			return;
		case UIPackage.FX_BORDER_PANE__CENTER:
			setCenter((FXNode) newValue);
			return;
		case UIPackage.FX_BORDER_PANE__BOTTOM:
			setBottom((FXNode) newValue);
			return;
		case UIPackage.FX_BORDER_PANE__TOP:
			setTop((FXNode) newValue);
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
		case UIPackage.FX_BORDER_PANE__LEFT:
			setLeft((FXNode) null);
			return;
		case UIPackage.FX_BORDER_PANE__RIGHT:
			setRight((FXNode) null);
			return;
		case UIPackage.FX_BORDER_PANE__CENTER:
			setCenter((FXNode) null);
			return;
		case UIPackage.FX_BORDER_PANE__BOTTOM:
			setBottom((FXNode) null);
			return;
		case UIPackage.FX_BORDER_PANE__TOP:
			setTop((FXNode) null);
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
		case UIPackage.FX_BORDER_PANE__LEFT:
			return left != null;
		case UIPackage.FX_BORDER_PANE__RIGHT:
			return right != null;
		case UIPackage.FX_BORDER_PANE__CENTER:
			return center != null;
		case UIPackage.FX_BORDER_PANE__BOTTOM:
			return bottom != null;
		case UIPackage.FX_BORDER_PANE__TOP:
			return top != null;
		}
		return super.eIsSet(featureID);
	}

} //FXBorderPaneImpl
