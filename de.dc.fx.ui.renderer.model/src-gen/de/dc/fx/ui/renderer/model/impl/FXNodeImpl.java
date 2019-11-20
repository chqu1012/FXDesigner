/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXInsets;
import de.dc.fx.ui.renderer.model.FXNode;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#isDisable <em>Disable</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getLayoutY <em>Layout Y</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getPrefWidth <em>Pref Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getPrefHeight <em>Pref Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl#getMargin <em>Margin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FXNodeImpl extends MinimalEObjectImpl.Container implements FXNode {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected double opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected boolean disable = DISABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

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
	 * The default value of the '{@link #getLayoutX() <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutX()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutX() <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutX()
	 * @generated
	 * @ordered
	 */
	protected double layoutX = LAYOUT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutY() <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutY()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutY() <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutY()
	 * @generated
	 * @ordered
	 */
	protected double layoutY = LAYOUT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefWidth() <em>Pref Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double PREF_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrefWidth() <em>Pref Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefWidth()
	 * @generated
	 * @ordered
	 */
	protected double prefWidth = PREF_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefHeight() <em>Pref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double PREF_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrefHeight() <em>Pref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefHeight()
	 * @generated
	 * @ordered
	 */
	protected double prefHeight = PREF_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected double minWidth = MIN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected double minHeight = MIN_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected double maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected double maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected FXInsets padding;

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected FXInsets margin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.FX_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpacity(double newOpacity) {
		double oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisable() {
		return disable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisable(boolean newDisable) {
		boolean oldDisable = disable;
		disable = newDisable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__DISABLE, oldDisable, disable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStyleClass() {
		if (styleClass == null) {
			styleClass = new EDataTypeEList<String>(String.class, this, UIPackage.FX_NODE__STYLE_CLASS);
		}
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLayoutX() {
		return layoutX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutX(double newLayoutX) {
		double oldLayoutX = layoutX;
		layoutX = newLayoutX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__LAYOUT_X, oldLayoutX, layoutX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLayoutY() {
		return layoutY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutY(double newLayoutY) {
		double oldLayoutY = layoutY;
		layoutY = newLayoutY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__LAYOUT_Y, oldLayoutY, layoutY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrefWidth() {
		return prefWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefWidth(double newPrefWidth) {
		double oldPrefWidth = prefWidth;
		prefWidth = newPrefWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__PREF_WIDTH, oldPrefWidth,
					prefWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrefHeight() {
		return prefHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefHeight(double newPrefHeight) {
		double oldPrefHeight = prefHeight;
		prefHeight = newPrefHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__PREF_HEIGHT, oldPrefHeight,
					prefHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinWidth(double newMinWidth) {
		double oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__MIN_WIDTH, oldMinWidth, minWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinHeight(double newMinHeight) {
		double oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__MIN_HEIGHT, oldMinHeight,
					minHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWidth(double newMaxWidth) {
		double oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHeight(double newMaxHeight) {
		double oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__MAX_HEIGHT, oldMaxHeight,
					maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXInsets getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadding(FXInsets newPadding, NotificationChain msgs) {
		FXInsets oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__PADDING,
					oldPadding, newPadding);
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
	public void setPadding(FXInsets newPadding) {
		if (newPadding != padding) {
			NotificationChain msgs = null;
			if (padding != null)
				msgs = ((InternalEObject) padding).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_NODE__PADDING, null, msgs);
			if (newPadding != null)
				msgs = ((InternalEObject) newPadding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_NODE__PADDING, null, msgs);
			msgs = basicSetPadding(newPadding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__PADDING, newPadding, newPadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXInsets getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMargin(FXInsets newMargin, NotificationChain msgs) {
		FXInsets oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__MARGIN,
					oldMargin, newMargin);
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
	public void setMargin(FXInsets newMargin) {
		if (newMargin != margin) {
			NotificationChain msgs = null;
			if (margin != null)
				msgs = ((InternalEObject) margin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_NODE__MARGIN, null, msgs);
			if (newMargin != null)
				msgs = ((InternalEObject) newMargin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UIPackage.FX_NODE__MARGIN, null, msgs);
			msgs = basicSetMargin(newMargin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.FX_NODE__MARGIN, newMargin, newMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UIPackage.FX_NODE__PADDING:
			return basicSetPadding(null, msgs);
		case UIPackage.FX_NODE__MARGIN:
			return basicSetMargin(null, msgs);
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
		case UIPackage.FX_NODE__ID:
			return getId();
		case UIPackage.FX_NODE__NAME:
			return getName();
		case UIPackage.FX_NODE__OPACITY:
			return getOpacity();
		case UIPackage.FX_NODE__VISIBLE:
			return isVisible();
		case UIPackage.FX_NODE__DISABLE:
			return isDisable();
		case UIPackage.FX_NODE__STYLE:
			return getStyle();
		case UIPackage.FX_NODE__STYLE_CLASS:
			return getStyleClass();
		case UIPackage.FX_NODE__LAYOUT_X:
			return getLayoutX();
		case UIPackage.FX_NODE__LAYOUT_Y:
			return getLayoutY();
		case UIPackage.FX_NODE__PREF_WIDTH:
			return getPrefWidth();
		case UIPackage.FX_NODE__PREF_HEIGHT:
			return getPrefHeight();
		case UIPackage.FX_NODE__MIN_WIDTH:
			return getMinWidth();
		case UIPackage.FX_NODE__MIN_HEIGHT:
			return getMinHeight();
		case UIPackage.FX_NODE__MAX_WIDTH:
			return getMaxWidth();
		case UIPackage.FX_NODE__MAX_HEIGHT:
			return getMaxHeight();
		case UIPackage.FX_NODE__PADDING:
			return getPadding();
		case UIPackage.FX_NODE__MARGIN:
			return getMargin();
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
		case UIPackage.FX_NODE__ID:
			setId((String) newValue);
			return;
		case UIPackage.FX_NODE__NAME:
			setName((String) newValue);
			return;
		case UIPackage.FX_NODE__OPACITY:
			setOpacity((Double) newValue);
			return;
		case UIPackage.FX_NODE__VISIBLE:
			setVisible((Boolean) newValue);
			return;
		case UIPackage.FX_NODE__DISABLE:
			setDisable((Boolean) newValue);
			return;
		case UIPackage.FX_NODE__STYLE:
			setStyle((String) newValue);
			return;
		case UIPackage.FX_NODE__STYLE_CLASS:
			getStyleClass().clear();
			getStyleClass().addAll((Collection<? extends String>) newValue);
			return;
		case UIPackage.FX_NODE__LAYOUT_X:
			setLayoutX((Double) newValue);
			return;
		case UIPackage.FX_NODE__LAYOUT_Y:
			setLayoutY((Double) newValue);
			return;
		case UIPackage.FX_NODE__PREF_WIDTH:
			setPrefWidth((Double) newValue);
			return;
		case UIPackage.FX_NODE__PREF_HEIGHT:
			setPrefHeight((Double) newValue);
			return;
		case UIPackage.FX_NODE__MIN_WIDTH:
			setMinWidth((Double) newValue);
			return;
		case UIPackage.FX_NODE__MIN_HEIGHT:
			setMinHeight((Double) newValue);
			return;
		case UIPackage.FX_NODE__MAX_WIDTH:
			setMaxWidth((Double) newValue);
			return;
		case UIPackage.FX_NODE__MAX_HEIGHT:
			setMaxHeight((Double) newValue);
			return;
		case UIPackage.FX_NODE__PADDING:
			setPadding((FXInsets) newValue);
			return;
		case UIPackage.FX_NODE__MARGIN:
			setMargin((FXInsets) newValue);
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
		case UIPackage.FX_NODE__ID:
			setId(ID_EDEFAULT);
			return;
		case UIPackage.FX_NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UIPackage.FX_NODE__OPACITY:
			setOpacity(OPACITY_EDEFAULT);
			return;
		case UIPackage.FX_NODE__VISIBLE:
			setVisible(VISIBLE_EDEFAULT);
			return;
		case UIPackage.FX_NODE__DISABLE:
			setDisable(DISABLE_EDEFAULT);
			return;
		case UIPackage.FX_NODE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case UIPackage.FX_NODE__STYLE_CLASS:
			getStyleClass().clear();
			return;
		case UIPackage.FX_NODE__LAYOUT_X:
			setLayoutX(LAYOUT_X_EDEFAULT);
			return;
		case UIPackage.FX_NODE__LAYOUT_Y:
			setLayoutY(LAYOUT_Y_EDEFAULT);
			return;
		case UIPackage.FX_NODE__PREF_WIDTH:
			setPrefWidth(PREF_WIDTH_EDEFAULT);
			return;
		case UIPackage.FX_NODE__PREF_HEIGHT:
			setPrefHeight(PREF_HEIGHT_EDEFAULT);
			return;
		case UIPackage.FX_NODE__MIN_WIDTH:
			setMinWidth(MIN_WIDTH_EDEFAULT);
			return;
		case UIPackage.FX_NODE__MIN_HEIGHT:
			setMinHeight(MIN_HEIGHT_EDEFAULT);
			return;
		case UIPackage.FX_NODE__MAX_WIDTH:
			setMaxWidth(MAX_WIDTH_EDEFAULT);
			return;
		case UIPackage.FX_NODE__MAX_HEIGHT:
			setMaxHeight(MAX_HEIGHT_EDEFAULT);
			return;
		case UIPackage.FX_NODE__PADDING:
			setPadding((FXInsets) null);
			return;
		case UIPackage.FX_NODE__MARGIN:
			setMargin((FXInsets) null);
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
		case UIPackage.FX_NODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case UIPackage.FX_NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UIPackage.FX_NODE__OPACITY:
			return opacity != OPACITY_EDEFAULT;
		case UIPackage.FX_NODE__VISIBLE:
			return visible != VISIBLE_EDEFAULT;
		case UIPackage.FX_NODE__DISABLE:
			return disable != DISABLE_EDEFAULT;
		case UIPackage.FX_NODE__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case UIPackage.FX_NODE__STYLE_CLASS:
			return styleClass != null && !styleClass.isEmpty();
		case UIPackage.FX_NODE__LAYOUT_X:
			return layoutX != LAYOUT_X_EDEFAULT;
		case UIPackage.FX_NODE__LAYOUT_Y:
			return layoutY != LAYOUT_Y_EDEFAULT;
		case UIPackage.FX_NODE__PREF_WIDTH:
			return prefWidth != PREF_WIDTH_EDEFAULT;
		case UIPackage.FX_NODE__PREF_HEIGHT:
			return prefHeight != PREF_HEIGHT_EDEFAULT;
		case UIPackage.FX_NODE__MIN_WIDTH:
			return minWidth != MIN_WIDTH_EDEFAULT;
		case UIPackage.FX_NODE__MIN_HEIGHT:
			return minHeight != MIN_HEIGHT_EDEFAULT;
		case UIPackage.FX_NODE__MAX_WIDTH:
			return maxWidth != MAX_WIDTH_EDEFAULT;
		case UIPackage.FX_NODE__MAX_HEIGHT:
			return maxHeight != MAX_HEIGHT_EDEFAULT;
		case UIPackage.FX_NODE__PADDING:
			return padding != null;
		case UIPackage.FX_NODE__MARGIN:
			return margin != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", visible: ");
		result.append(visible);
		result.append(", disable: ");
		result.append(disable);
		result.append(", style: ");
		result.append(style);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", layoutX: ");
		result.append(layoutX);
		result.append(", layoutY: ");
		result.append(layoutY);
		result.append(", prefWidth: ");
		result.append(prefWidth);
		result.append(", prefHeight: ");
		result.append(prefHeight);
		result.append(", minWidth: ");
		result.append(minWidth);
		result.append(", minHeight: ");
		result.append(minHeight);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(')');
		return result.toString();
	}

} //FXNodeImpl
