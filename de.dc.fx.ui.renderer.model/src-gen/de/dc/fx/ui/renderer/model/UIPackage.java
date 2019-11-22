/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.renderer.model.UIFactory
 * @model kind="package"
 * @generated
 */
public interface UIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UIPackage eINSTANCE = de.dc.fx.ui.renderer.model.impl.UIPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl <em>FX Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXRootImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXRoot()
	 * @generated
	 */
	int FX_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT__BASE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT__CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT__STYLE_CLASS = 4;

	/**
	 * The number of structural features of the '<em>FX Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FX Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXEventImpl <em>FX Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXEventImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXEvent()
	 * @generated
	 */
	int FX_EVENT = 1;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_EVENT__ON_MOUSE_CLICKED = 0;

	/**
	 * The number of structural features of the '<em>FX Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FX Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl <em>FX Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXNodeImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXNode()
	 * @generated
	 */
	int FX_NODE = 2;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__ON_MOUSE_CLICKED = FX_EVENT__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__ID = FX_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__NAME = FX_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__OPACITY = FX_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__VISIBLE = FX_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__DISABLE = FX_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__STYLE = FX_EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__STYLE_CLASS = FX_EVENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__LAYOUT_X = FX_EVENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__LAYOUT_Y = FX_EVENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__PREF_WIDTH = FX_EVENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__PREF_HEIGHT = FX_EVENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__MIN_WIDTH = FX_EVENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__MIN_HEIGHT = FX_EVENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__MAX_WIDTH = FX_EVENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__MAX_HEIGHT = FX_EVENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__PADDING = FX_EVENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE__MARGIN = FX_EVENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>FX Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE_FEATURE_COUNT = FX_EVENT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>FX Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NODE_OPERATION_COUNT = FX_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXMarginImpl <em>FX Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXMarginImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXMargin()
	 * @generated
	 */
	int FX_MARGIN = 3;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MARGIN__TOP = 0;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MARGIN__BOTTOM = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MARGIN__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MARGIN__LEFT = 3;

	/**
	 * The number of structural features of the '<em>FX Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MARGIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>FX Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MARGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXPaddingImpl <em>FX Padding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXPaddingImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXPadding()
	 * @generated
	 */
	int FX_PADDING = 4;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PADDING__TOP = 0;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PADDING__BOTTOM = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PADDING__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PADDING__LEFT = 3;

	/**
	 * The number of structural features of the '<em>FX Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PADDING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>FX Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PADDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXLayoutImpl <em>FX Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXLayoutImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXLayout()
	 * @generated
	 */
	int FX_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__MARGIN = FX_NODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT__CHILDREN = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LAYOUT_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXHBoxImpl <em>FXH Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXHBoxImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXHBox()
	 * @generated
	 */
	int FXH_BOX = 6;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__ON_MOUSE_CLICKED = FX_LAYOUT__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__ID = FX_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__NAME = FX_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__OPACITY = FX_LAYOUT__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__VISIBLE = FX_LAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__DISABLE = FX_LAYOUT__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__STYLE = FX_LAYOUT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__STYLE_CLASS = FX_LAYOUT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__LAYOUT_X = FX_LAYOUT__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__LAYOUT_Y = FX_LAYOUT__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__PREF_WIDTH = FX_LAYOUT__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__PREF_HEIGHT = FX_LAYOUT__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__MIN_WIDTH = FX_LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__MIN_HEIGHT = FX_LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__MAX_WIDTH = FX_LAYOUT__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__MAX_HEIGHT = FX_LAYOUT__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__PADDING = FX_LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__MARGIN = FX_LAYOUT__MARGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__CHILDREN = FX_LAYOUT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX__SPACING = FX_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FXH Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX_FEATURE_COUNT = FX_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FXH Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXH_BOX_OPERATION_COUNT = FX_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXVBoxImpl <em>FXV Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXVBoxImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXVBox()
	 * @generated
	 */
	int FXV_BOX = 7;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__ON_MOUSE_CLICKED = FX_LAYOUT__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__ID = FX_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__NAME = FX_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__OPACITY = FX_LAYOUT__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__VISIBLE = FX_LAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__DISABLE = FX_LAYOUT__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__STYLE = FX_LAYOUT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__STYLE_CLASS = FX_LAYOUT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__LAYOUT_X = FX_LAYOUT__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__LAYOUT_Y = FX_LAYOUT__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__PREF_WIDTH = FX_LAYOUT__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__PREF_HEIGHT = FX_LAYOUT__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__MIN_WIDTH = FX_LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__MIN_HEIGHT = FX_LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__MAX_WIDTH = FX_LAYOUT__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__MAX_HEIGHT = FX_LAYOUT__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__PADDING = FX_LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__MARGIN = FX_LAYOUT__MARGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__CHILDREN = FX_LAYOUT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX__SPACING = FX_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FXV Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX_FEATURE_COUNT = FX_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FXV Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXV_BOX_OPERATION_COUNT = FX_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl <em>FX Border Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXBorderPane()
	 * @generated
	 */
	int FX_BORDER_PANE = 8;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__ON_MOUSE_CLICKED = FX_LAYOUT__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__ID = FX_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__NAME = FX_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__OPACITY = FX_LAYOUT__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__VISIBLE = FX_LAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__DISABLE = FX_LAYOUT__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__STYLE = FX_LAYOUT__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__STYLE_CLASS = FX_LAYOUT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__LAYOUT_X = FX_LAYOUT__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__LAYOUT_Y = FX_LAYOUT__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__PREF_WIDTH = FX_LAYOUT__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__PREF_HEIGHT = FX_LAYOUT__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__MIN_WIDTH = FX_LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__MIN_HEIGHT = FX_LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__MAX_WIDTH = FX_LAYOUT__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__MAX_HEIGHT = FX_LAYOUT__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__PADDING = FX_LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__MARGIN = FX_LAYOUT__MARGIN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__CHILDREN = FX_LAYOUT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__LEFT = FX_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__RIGHT = FX_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__CENTER = FX_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__BOTTOM = FX_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE__TOP = FX_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>FX Border Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE_FEATURE_COUNT = FX_LAYOUT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>FX Border Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BORDER_PANE_OPERATION_COUNT = FX_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXButtonImpl <em>FX Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXButtonImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXButton()
	 * @generated
	 */
	int FX_BUTTON = 9;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__MARGIN = FX_NODE__MARGIN;

	/**
	 * The number of structural features of the '<em>FX Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXLabelImpl <em>FX Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXLabelImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXLabel()
	 * @generated
	 */
	int FX_LABEL = 10;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL__MARGIN = FX_NODE__MARGIN;

	/**
	 * The number of structural features of the '<em>FX Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LABEL_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXCheckButtonImpl <em>FX Check Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXCheckButtonImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXCheckButton()
	 * @generated
	 */
	int FX_CHECK_BUTTON = 11;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON__MARGIN = FX_NODE__MARGIN;

	/**
	 * The number of structural features of the '<em>FX Check Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Check Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BUTTON_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXRadioButtonImpl <em>FX Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXRadioButtonImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXRadioButton()
	 * @generated
	 */
	int FX_RADIO_BUTTON = 12;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__MARGIN = FX_NODE__MARGIN;

	/**
	 * The number of structural features of the '<em>FX Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXListViewImpl <em>FX List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXListViewImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXListView()
	 * @generated
	 */
	int FX_LIST_VIEW = 13;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW__MARGIN = FX_NODE__MARGIN;

	/**
	 * The number of structural features of the '<em>FX List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_LIST_VIEW_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXTableViewImpl <em>FX Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXTableViewImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXTableView()
	 * @generated
	 */
	int FX_TABLE_VIEW = 14;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__ON_MOUSE_CLICKED = FX_NODE__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__ID = FX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__NAME = FX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__OPACITY = FX_NODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__VISIBLE = FX_NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__DISABLE = FX_NODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__STYLE = FX_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__STYLE_CLASS = FX_NODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__LAYOUT_X = FX_NODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__LAYOUT_Y = FX_NODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__PREF_WIDTH = FX_NODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__PREF_HEIGHT = FX_NODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__MIN_WIDTH = FX_NODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__MIN_HEIGHT = FX_NODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__MAX_WIDTH = FX_NODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__MAX_HEIGHT = FX_NODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__PADDING = FX_NODE__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__MARGIN = FX_NODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__COLUMNS = FX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW_FEATURE_COUNT = FX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW_OPERATION_COUNT = FX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXFilteredTableViewImpl <em>FX Filtered Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXFilteredTableViewImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXFilteredTableView()
	 * @generated
	 */
	int FX_FILTERED_TABLE_VIEW = 15;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__ON_MOUSE_CLICKED = FX_TABLE_VIEW__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__ID = FX_TABLE_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__NAME = FX_TABLE_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__OPACITY = FX_TABLE_VIEW__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__VISIBLE = FX_TABLE_VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__DISABLE = FX_TABLE_VIEW__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__STYLE = FX_TABLE_VIEW__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__STYLE_CLASS = FX_TABLE_VIEW__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__LAYOUT_X = FX_TABLE_VIEW__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__LAYOUT_Y = FX_TABLE_VIEW__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__PREF_WIDTH = FX_TABLE_VIEW__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__PREF_HEIGHT = FX_TABLE_VIEW__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__MIN_WIDTH = FX_TABLE_VIEW__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__MIN_HEIGHT = FX_TABLE_VIEW__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__MAX_WIDTH = FX_TABLE_VIEW__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__MAX_HEIGHT = FX_TABLE_VIEW__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__PADDING = FX_TABLE_VIEW__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__MARGIN = FX_TABLE_VIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW__COLUMNS = FX_TABLE_VIEW__COLUMNS;

	/**
	 * The number of structural features of the '<em>FX Filtered Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW_FEATURE_COUNT = FX_TABLE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Filtered Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FILTERED_TABLE_VIEW_OPERATION_COUNT = FX_TABLE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXSortFilteredTableViewImpl <em>FX Sort Filtered Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXSortFilteredTableViewImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXSortFilteredTableView()
	 * @generated
	 */
	int FX_SORT_FILTERED_TABLE_VIEW = 16;

	/**
	 * The feature id for the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__ON_MOUSE_CLICKED = FX_FILTERED_TABLE_VIEW__ON_MOUSE_CLICKED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__ID = FX_FILTERED_TABLE_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__NAME = FX_FILTERED_TABLE_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__OPACITY = FX_FILTERED_TABLE_VIEW__OPACITY;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__VISIBLE = FX_FILTERED_TABLE_VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__DISABLE = FX_FILTERED_TABLE_VIEW__DISABLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__STYLE = FX_FILTERED_TABLE_VIEW__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__STYLE_CLASS = FX_FILTERED_TABLE_VIEW__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__LAYOUT_X = FX_FILTERED_TABLE_VIEW__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__LAYOUT_Y = FX_FILTERED_TABLE_VIEW__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__PREF_WIDTH = FX_FILTERED_TABLE_VIEW__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__PREF_HEIGHT = FX_FILTERED_TABLE_VIEW__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__MIN_WIDTH = FX_FILTERED_TABLE_VIEW__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__MIN_HEIGHT = FX_FILTERED_TABLE_VIEW__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__MAX_WIDTH = FX_FILTERED_TABLE_VIEW__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__MAX_HEIGHT = FX_FILTERED_TABLE_VIEW__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__PADDING = FX_FILTERED_TABLE_VIEW__PADDING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__MARGIN = FX_FILTERED_TABLE_VIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW__COLUMNS = FX_FILTERED_TABLE_VIEW__COLUMNS;

	/**
	 * The number of structural features of the '<em>FX Sort Filtered Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW_FEATURE_COUNT = FX_FILTERED_TABLE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Sort Filtered Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SORT_FILTERED_TABLE_VIEW_OPERATION_COUNT = FX_FILTERED_TABLE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.renderer.model.impl.FXTableColumnImpl <em>FX Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.renderer.model.impl.FXTableColumnImpl
	 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXTableColumn()
	 * @generated
	 */
	int FX_TABLE_COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Cell Value Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN__CELL_VALUE_FACTORY = 3;

	/**
	 * The feature id for the '<em><b>Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN__CELL_FACTORY = 4;

	/**
	 * The number of structural features of the '<em>FX Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FX Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXRoot <em>FX Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Root</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRoot
	 * @generated
	 */
	EClass getFXRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.renderer.model.FXRoot#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRoot#getChildren()
	 * @see #getFXRoot()
	 * @generated
	 */
	EReference getFXRoot_Children();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXRoot#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRoot#getBasePackage()
	 * @see #getFXRoot()
	 * @generated
	 */
	EAttribute getFXRoot_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXRoot#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRoot#getController()
	 * @see #getFXRoot()
	 * @generated
	 */
	EAttribute getFXRoot_Controller();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRoot#getName()
	 * @see #getFXRoot()
	 * @generated
	 */
	EAttribute getFXRoot_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.dc.fx.ui.renderer.model.FXRoot#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Class</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRoot#getStyleClass()
	 * @see #getFXRoot()
	 * @generated
	 */
	EAttribute getFXRoot_StyleClass();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXEvent <em>FX Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Event</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXEvent
	 * @generated
	 */
	EClass getFXEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXEvent#getOnMouseClicked <em>On Mouse Clicked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Mouse Clicked</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXEvent#getOnMouseClicked()
	 * @see #getFXEvent()
	 * @generated
	 */
	EAttribute getFXEvent_OnMouseClicked();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXNode <em>FX Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Node</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode
	 * @generated
	 */
	EClass getFXNode();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getId()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getName()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getOpacity()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#isVisible()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_Visible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#isDisable()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_Disable();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getStyle()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_Style();

	/**
	 * Returns the meta object for the attribute list '{@link de.dc.fx.ui.renderer.model.FXNode#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Class</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getStyleClass()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getLayoutX <em>Layout X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout X</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getLayoutX()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_LayoutX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getLayoutY <em>Layout Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Y</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getLayoutY()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_LayoutY();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getPrefWidth <em>Pref Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pref Width</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getPrefWidth()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_PrefWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getPrefHeight <em>Pref Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pref Height</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getPrefHeight()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_PrefHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Width</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getMinWidth()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_MinWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Height</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getMinHeight()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_MinHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getMaxWidth()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXNode#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getMaxHeight()
	 * @see #getFXNode()
	 * @generated
	 */
	EAttribute getFXNode_MaxHeight();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXNode#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getPadding()
	 * @see #getFXNode()
	 * @generated
	 */
	EReference getFXNode_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXNode#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margin</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXNode#getMargin()
	 * @see #getFXNode()
	 * @generated
	 */
	EReference getFXNode_Margin();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXMargin <em>FX Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Margin</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXMargin
	 * @generated
	 */
	EClass getFXMargin();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXMargin#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXMargin#getTop()
	 * @see #getFXMargin()
	 * @generated
	 */
	EAttribute getFXMargin_Top();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXMargin#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXMargin#getBottom()
	 * @see #getFXMargin()
	 * @generated
	 */
	EAttribute getFXMargin_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXMargin#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXMargin#getRight()
	 * @see #getFXMargin()
	 * @generated
	 */
	EAttribute getFXMargin_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXMargin#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXMargin#getLeft()
	 * @see #getFXMargin()
	 * @generated
	 */
	EAttribute getFXMargin_Left();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXPadding <em>FX Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Padding</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXPadding
	 * @generated
	 */
	EClass getFXPadding();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXPadding#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXPadding#getTop()
	 * @see #getFXPadding()
	 * @generated
	 */
	EAttribute getFXPadding_Top();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXPadding#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXPadding#getBottom()
	 * @see #getFXPadding()
	 * @generated
	 */
	EAttribute getFXPadding_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXPadding#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXPadding#getRight()
	 * @see #getFXPadding()
	 * @generated
	 */
	EAttribute getFXPadding_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXPadding#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXPadding#getLeft()
	 * @see #getFXPadding()
	 * @generated
	 */
	EAttribute getFXPadding_Left();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXLayout <em>FX Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Layout</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXLayout
	 * @generated
	 */
	EClass getFXLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.renderer.model.FXLayout#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXLayout#getChildren()
	 * @see #getFXLayout()
	 * @generated
	 */
	EReference getFXLayout_Children();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXHBox <em>FXH Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FXH Box</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXHBox
	 * @generated
	 */
	EClass getFXHBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXHBox#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXHBox#getSpacing()
	 * @see #getFXHBox()
	 * @generated
	 */
	EAttribute getFXHBox_Spacing();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXVBox <em>FXV Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FXV Box</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXVBox
	 * @generated
	 */
	EClass getFXVBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXVBox#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXVBox#getSpacing()
	 * @see #getFXVBox()
	 * @generated
	 */
	EAttribute getFXVBox_Spacing();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXBorderPane <em>FX Border Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Border Pane</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane
	 * @generated
	 */
	EClass getFXBorderPane();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXBorderPane#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane#getLeft()
	 * @see #getFXBorderPane()
	 * @generated
	 */
	EReference getFXBorderPane_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXBorderPane#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane#getRight()
	 * @see #getFXBorderPane()
	 * @generated
	 */
	EReference getFXBorderPane_Right();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXBorderPane#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane#getCenter()
	 * @see #getFXBorderPane()
	 * @generated
	 */
	EReference getFXBorderPane_Center();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXBorderPane#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottom</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane#getBottom()
	 * @see #getFXBorderPane()
	 * @generated
	 */
	EReference getFXBorderPane_Bottom();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.renderer.model.FXBorderPane#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXBorderPane#getTop()
	 * @see #getFXBorderPane()
	 * @generated
	 */
	EReference getFXBorderPane_Top();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXButton <em>FX Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Button</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXButton
	 * @generated
	 */
	EClass getFXButton();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXLabel <em>FX Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Label</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXLabel
	 * @generated
	 */
	EClass getFXLabel();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXCheckButton <em>FX Check Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Check Button</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXCheckButton
	 * @generated
	 */
	EClass getFXCheckButton();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXRadioButton <em>FX Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Radio Button</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXRadioButton
	 * @generated
	 */
	EClass getFXRadioButton();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXListView <em>FX List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX List View</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXListView
	 * @generated
	 */
	EClass getFXListView();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXTableView <em>FX Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Table View</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableView
	 * @generated
	 */
	EClass getFXTableView();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.renderer.model.FXTableView#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableView#getColumns()
	 * @see #getFXTableView()
	 * @generated
	 */
	EReference getFXTableView_Columns();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXFilteredTableView <em>FX Filtered Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Filtered Table View</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXFilteredTableView
	 * @generated
	 */
	EClass getFXFilteredTableView();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXSortFilteredTableView <em>FX Sort Filtered Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Sort Filtered Table View</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXSortFilteredTableView
	 * @generated
	 */
	EClass getFXSortFilteredTableView();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.renderer.model.FXTableColumn <em>FX Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Table Column</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn
	 * @generated
	 */
	EClass getFXTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn#getId()
	 * @see #getFXTableColumn()
	 * @generated
	 */
	EAttribute getFXTableColumn_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn#getName()
	 * @see #getFXTableColumn()
	 * @generated
	 */
	EAttribute getFXTableColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn#getWidth()
	 * @see #getFXTableColumn()
	 * @generated
	 */
	EAttribute getFXTableColumn_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getCellValueFactory <em>Cell Value Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Value Factory</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn#getCellValueFactory()
	 * @see #getFXTableColumn()
	 * @generated
	 */
	EAttribute getFXTableColumn_CellValueFactory();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getCellFactory <em>Cell Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Factory</em>'.
	 * @see de.dc.fx.ui.renderer.model.FXTableColumn#getCellFactory()
	 * @see #getFXTableColumn()
	 * @generated
	 */
	EAttribute getFXTableColumn_CellFactory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UIFactory getUIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXRootImpl <em>FX Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXRootImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXRoot()
		 * @generated
		 */
		EClass FX_ROOT = eINSTANCE.getFXRoot();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_ROOT__CHILDREN = eINSTANCE.getFXRoot_Children();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_ROOT__BASE_PACKAGE = eINSTANCE.getFXRoot_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_ROOT__CONTROLLER = eINSTANCE.getFXRoot_Controller();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_ROOT__NAME = eINSTANCE.getFXRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_ROOT__STYLE_CLASS = eINSTANCE.getFXRoot_StyleClass();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXEventImpl <em>FX Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXEventImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXEvent()
		 * @generated
		 */
		EClass FX_EVENT = eINSTANCE.getFXEvent();

		/**
		 * The meta object literal for the '<em><b>On Mouse Clicked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_EVENT__ON_MOUSE_CLICKED = eINSTANCE.getFXEvent_OnMouseClicked();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXNodeImpl <em>FX Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXNodeImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXNode()
		 * @generated
		 */
		EClass FX_NODE = eINSTANCE.getFXNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__ID = eINSTANCE.getFXNode_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__NAME = eINSTANCE.getFXNode_Name();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__OPACITY = eINSTANCE.getFXNode_Opacity();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__VISIBLE = eINSTANCE.getFXNode_Visible();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__DISABLE = eINSTANCE.getFXNode_Disable();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__STYLE = eINSTANCE.getFXNode_Style();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__STYLE_CLASS = eINSTANCE.getFXNode_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Layout X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__LAYOUT_X = eINSTANCE.getFXNode_LayoutX();

		/**
		 * The meta object literal for the '<em><b>Layout Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__LAYOUT_Y = eINSTANCE.getFXNode_LayoutY();

		/**
		 * The meta object literal for the '<em><b>Pref Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__PREF_WIDTH = eINSTANCE.getFXNode_PrefWidth();

		/**
		 * The meta object literal for the '<em><b>Pref Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__PREF_HEIGHT = eINSTANCE.getFXNode_PrefHeight();

		/**
		 * The meta object literal for the '<em><b>Min Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__MIN_WIDTH = eINSTANCE.getFXNode_MinWidth();

		/**
		 * The meta object literal for the '<em><b>Min Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__MIN_HEIGHT = eINSTANCE.getFXNode_MinHeight();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__MAX_WIDTH = eINSTANCE.getFXNode_MaxWidth();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NODE__MAX_HEIGHT = eINSTANCE.getFXNode_MaxHeight();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_NODE__PADDING = eINSTANCE.getFXNode_Padding();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_NODE__MARGIN = eINSTANCE.getFXNode_Margin();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXMarginImpl <em>FX Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXMarginImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXMargin()
		 * @generated
		 */
		EClass FX_MARGIN = eINSTANCE.getFXMargin();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_MARGIN__TOP = eINSTANCE.getFXMargin_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_MARGIN__BOTTOM = eINSTANCE.getFXMargin_Bottom();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_MARGIN__RIGHT = eINSTANCE.getFXMargin_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_MARGIN__LEFT = eINSTANCE.getFXMargin_Left();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXPaddingImpl <em>FX Padding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXPaddingImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXPadding()
		 * @generated
		 */
		EClass FX_PADDING = eINSTANCE.getFXPadding();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_PADDING__TOP = eINSTANCE.getFXPadding_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_PADDING__BOTTOM = eINSTANCE.getFXPadding_Bottom();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_PADDING__RIGHT = eINSTANCE.getFXPadding_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_PADDING__LEFT = eINSTANCE.getFXPadding_Left();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXLayoutImpl <em>FX Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXLayoutImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXLayout()
		 * @generated
		 */
		EClass FX_LAYOUT = eINSTANCE.getFXLayout();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_LAYOUT__CHILDREN = eINSTANCE.getFXLayout_Children();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXHBoxImpl <em>FXH Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXHBoxImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXHBox()
		 * @generated
		 */
		EClass FXH_BOX = eINSTANCE.getFXHBox();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FXH_BOX__SPACING = eINSTANCE.getFXHBox_Spacing();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXVBoxImpl <em>FXV Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXVBoxImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXVBox()
		 * @generated
		 */
		EClass FXV_BOX = eINSTANCE.getFXVBox();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FXV_BOX__SPACING = eINSTANCE.getFXVBox_Spacing();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl <em>FX Border Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXBorderPaneImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXBorderPane()
		 * @generated
		 */
		EClass FX_BORDER_PANE = eINSTANCE.getFXBorderPane();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_BORDER_PANE__LEFT = eINSTANCE.getFXBorderPane_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_BORDER_PANE__RIGHT = eINSTANCE.getFXBorderPane_Right();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_BORDER_PANE__CENTER = eINSTANCE.getFXBorderPane_Center();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_BORDER_PANE__BOTTOM = eINSTANCE.getFXBorderPane_Bottom();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_BORDER_PANE__TOP = eINSTANCE.getFXBorderPane_Top();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXButtonImpl <em>FX Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXButtonImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXButton()
		 * @generated
		 */
		EClass FX_BUTTON = eINSTANCE.getFXButton();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXLabelImpl <em>FX Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXLabelImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXLabel()
		 * @generated
		 */
		EClass FX_LABEL = eINSTANCE.getFXLabel();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXCheckButtonImpl <em>FX Check Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXCheckButtonImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXCheckButton()
		 * @generated
		 */
		EClass FX_CHECK_BUTTON = eINSTANCE.getFXCheckButton();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXRadioButtonImpl <em>FX Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXRadioButtonImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXRadioButton()
		 * @generated
		 */
		EClass FX_RADIO_BUTTON = eINSTANCE.getFXRadioButton();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXListViewImpl <em>FX List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXListViewImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXListView()
		 * @generated
		 */
		EClass FX_LIST_VIEW = eINSTANCE.getFXListView();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXTableViewImpl <em>FX Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXTableViewImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXTableView()
		 * @generated
		 */
		EClass FX_TABLE_VIEW = eINSTANCE.getFXTableView();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_TABLE_VIEW__COLUMNS = eINSTANCE.getFXTableView_Columns();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXFilteredTableViewImpl <em>FX Filtered Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXFilteredTableViewImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXFilteredTableView()
		 * @generated
		 */
		EClass FX_FILTERED_TABLE_VIEW = eINSTANCE.getFXFilteredTableView();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXSortFilteredTableViewImpl <em>FX Sort Filtered Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXSortFilteredTableViewImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXSortFilteredTableView()
		 * @generated
		 */
		EClass FX_SORT_FILTERED_TABLE_VIEW = eINSTANCE.getFXSortFilteredTableView();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.renderer.model.impl.FXTableColumnImpl <em>FX Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.renderer.model.impl.FXTableColumnImpl
		 * @see de.dc.fx.ui.renderer.model.impl.UIPackageImpl#getFXTableColumn()
		 * @generated
		 */
		EClass FX_TABLE_COLUMN = eINSTANCE.getFXTableColumn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_COLUMN__ID = eINSTANCE.getFXTableColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_COLUMN__NAME = eINSTANCE.getFXTableColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_COLUMN__WIDTH = eINSTANCE.getFXTableColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Cell Value Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_COLUMN__CELL_VALUE_FACTORY = eINSTANCE.getFXTableColumn_CellValueFactory();

		/**
		 * The meta object literal for the '<em><b>Cell Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_COLUMN__CELL_FACTORY = eINSTANCE.getFXTableColumn_CellFactory();

	}

} //UIPackage
