/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXCheckButton;
import de.dc.fx.ui.renderer.model.FXEvent;
import de.dc.fx.ui.renderer.model.FXFilteredTableView;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXLabel;
import de.dc.fx.ui.renderer.model.FXLayout;
import de.dc.fx.ui.renderer.model.FXListView;
import de.dc.fx.ui.renderer.model.FXMargin;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXPadding;
import de.dc.fx.ui.renderer.model.FXRadioButton;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXSortFilteredTableView;
import de.dc.fx.ui.renderer.model.FXTableColumn;
import de.dc.fx.ui.renderer.model.FXTableView;
import de.dc.fx.ui.renderer.model.FXVBox;
import de.dc.fx.ui.renderer.model.UIFactory;
import de.dc.fx.ui.renderer.model.UIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIPackageImpl extends EPackageImpl implements UIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxMarginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxPaddingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxhBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxvBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxBorderPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxCheckButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxRadioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxListViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxFilteredTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSortFilteredTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxTableColumnEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.fx.ui.renderer.model.UIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UIPackageImpl() {
		super(eNS_URI, UIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UIPackage init() {
		if (isInited)
			return (UIPackage) EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UIPackageImpl theUIPackage = registeredUIPackage instanceof UIPackageImpl ? (UIPackageImpl) registeredUIPackage
				: new UIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUIPackage.createPackageContents();

		// Initialize created meta-data
		theUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UIPackage.eNS_URI, theUIPackage);
		return theUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXRoot() {
		return fxRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXRoot_Children() {
		return (EReference) fxRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXRoot_BasePackage() {
		return (EAttribute) fxRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXRoot_Controller() {
		return (EAttribute) fxRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXRoot_Name() {
		return (EAttribute) fxRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXRoot_StyleClass() {
		return (EAttribute) fxRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXEvent() {
		return fxEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXEvent_OnMouseClicked() {
		return (EAttribute) fxEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXNode() {
		return fxNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_Id() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_Name() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_Opacity() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_Visible() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_Disable() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_Style() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_StyleClass() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_LayoutX() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_LayoutY() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_PrefWidth() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_PrefHeight() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MinWidth() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MinHeight() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MaxWidth() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MaxHeight() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXNode_Padding() {
		return (EReference) fxNodeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXNode_Margin() {
		return (EReference) fxNodeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXMargin() {
		return fxMarginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXMargin_Top() {
		return (EAttribute) fxMarginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXMargin_Bottom() {
		return (EAttribute) fxMarginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXMargin_Right() {
		return (EAttribute) fxMarginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXMargin_Left() {
		return (EAttribute) fxMarginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXPadding() {
		return fxPaddingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXPadding_Top() {
		return (EAttribute) fxPaddingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXPadding_Bottom() {
		return (EAttribute) fxPaddingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXPadding_Right() {
		return (EAttribute) fxPaddingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXPadding_Left() {
		return (EAttribute) fxPaddingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXLayout() {
		return fxLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXLayout_Children() {
		return (EReference) fxLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXHBox() {
		return fxhBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXHBox_Spacing() {
		return (EAttribute) fxhBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXVBox() {
		return fxvBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXVBox_Spacing() {
		return (EAttribute) fxvBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXBorderPane() {
		return fxBorderPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXBorderPane_Left() {
		return (EReference) fxBorderPaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXBorderPane_Right() {
		return (EReference) fxBorderPaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXBorderPane_Center() {
		return (EReference) fxBorderPaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXBorderPane_Bottom() {
		return (EReference) fxBorderPaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXBorderPane_Top() {
		return (EReference) fxBorderPaneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXButton() {
		return fxButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXLabel() {
		return fxLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXCheckButton() {
		return fxCheckButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXRadioButton() {
		return fxRadioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXListView() {
		return fxListViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXTableView() {
		return fxTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXTableView_Columns() {
		return (EReference) fxTableViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXFilteredTableView() {
		return fxFilteredTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXSortFilteredTableView() {
		return fxSortFilteredTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXTableColumn() {
		return fxTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_Id() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_Name() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_Width() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_CellValueFactory() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_CellFactory() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIFactory getUIFactory() {
		return (UIFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		fxRootEClass = createEClass(FX_ROOT);
		createEReference(fxRootEClass, FX_ROOT__CHILDREN);
		createEAttribute(fxRootEClass, FX_ROOT__BASE_PACKAGE);
		createEAttribute(fxRootEClass, FX_ROOT__CONTROLLER);
		createEAttribute(fxRootEClass, FX_ROOT__NAME);
		createEAttribute(fxRootEClass, FX_ROOT__STYLE_CLASS);

		fxEventEClass = createEClass(FX_EVENT);
		createEAttribute(fxEventEClass, FX_EVENT__ON_MOUSE_CLICKED);

		fxNodeEClass = createEClass(FX_NODE);
		createEAttribute(fxNodeEClass, FX_NODE__ID);
		createEAttribute(fxNodeEClass, FX_NODE__NAME);
		createEAttribute(fxNodeEClass, FX_NODE__OPACITY);
		createEAttribute(fxNodeEClass, FX_NODE__VISIBLE);
		createEAttribute(fxNodeEClass, FX_NODE__DISABLE);
		createEAttribute(fxNodeEClass, FX_NODE__STYLE);
		createEAttribute(fxNodeEClass, FX_NODE__STYLE_CLASS);
		createEAttribute(fxNodeEClass, FX_NODE__LAYOUT_X);
		createEAttribute(fxNodeEClass, FX_NODE__LAYOUT_Y);
		createEAttribute(fxNodeEClass, FX_NODE__PREF_WIDTH);
		createEAttribute(fxNodeEClass, FX_NODE__PREF_HEIGHT);
		createEAttribute(fxNodeEClass, FX_NODE__MIN_WIDTH);
		createEAttribute(fxNodeEClass, FX_NODE__MIN_HEIGHT);
		createEAttribute(fxNodeEClass, FX_NODE__MAX_WIDTH);
		createEAttribute(fxNodeEClass, FX_NODE__MAX_HEIGHT);
		createEReference(fxNodeEClass, FX_NODE__PADDING);
		createEReference(fxNodeEClass, FX_NODE__MARGIN);

		fxMarginEClass = createEClass(FX_MARGIN);
		createEAttribute(fxMarginEClass, FX_MARGIN__TOP);
		createEAttribute(fxMarginEClass, FX_MARGIN__BOTTOM);
		createEAttribute(fxMarginEClass, FX_MARGIN__RIGHT);
		createEAttribute(fxMarginEClass, FX_MARGIN__LEFT);

		fxPaddingEClass = createEClass(FX_PADDING);
		createEAttribute(fxPaddingEClass, FX_PADDING__TOP);
		createEAttribute(fxPaddingEClass, FX_PADDING__BOTTOM);
		createEAttribute(fxPaddingEClass, FX_PADDING__RIGHT);
		createEAttribute(fxPaddingEClass, FX_PADDING__LEFT);

		fxLayoutEClass = createEClass(FX_LAYOUT);
		createEReference(fxLayoutEClass, FX_LAYOUT__CHILDREN);

		fxhBoxEClass = createEClass(FXH_BOX);
		createEAttribute(fxhBoxEClass, FXH_BOX__SPACING);

		fxvBoxEClass = createEClass(FXV_BOX);
		createEAttribute(fxvBoxEClass, FXV_BOX__SPACING);

		fxBorderPaneEClass = createEClass(FX_BORDER_PANE);
		createEReference(fxBorderPaneEClass, FX_BORDER_PANE__LEFT);
		createEReference(fxBorderPaneEClass, FX_BORDER_PANE__RIGHT);
		createEReference(fxBorderPaneEClass, FX_BORDER_PANE__CENTER);
		createEReference(fxBorderPaneEClass, FX_BORDER_PANE__BOTTOM);
		createEReference(fxBorderPaneEClass, FX_BORDER_PANE__TOP);

		fxButtonEClass = createEClass(FX_BUTTON);

		fxLabelEClass = createEClass(FX_LABEL);

		fxCheckButtonEClass = createEClass(FX_CHECK_BUTTON);

		fxRadioButtonEClass = createEClass(FX_RADIO_BUTTON);

		fxListViewEClass = createEClass(FX_LIST_VIEW);

		fxTableViewEClass = createEClass(FX_TABLE_VIEW);
		createEReference(fxTableViewEClass, FX_TABLE_VIEW__COLUMNS);

		fxFilteredTableViewEClass = createEClass(FX_FILTERED_TABLE_VIEW);

		fxSortFilteredTableViewEClass = createEClass(FX_SORT_FILTERED_TABLE_VIEW);

		fxTableColumnEClass = createEClass(FX_TABLE_COLUMN);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__ID);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__NAME);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__WIDTH);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__CELL_VALUE_FACTORY);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__CELL_FACTORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fxNodeEClass.getESuperTypes().add(this.getFXEvent());
		fxLayoutEClass.getESuperTypes().add(this.getFXNode());
		fxhBoxEClass.getESuperTypes().add(this.getFXLayout());
		fxvBoxEClass.getESuperTypes().add(this.getFXLayout());
		fxBorderPaneEClass.getESuperTypes().add(this.getFXLayout());
		fxButtonEClass.getESuperTypes().add(this.getFXNode());
		fxLabelEClass.getESuperTypes().add(this.getFXNode());
		fxCheckButtonEClass.getESuperTypes().add(this.getFXNode());
		fxRadioButtonEClass.getESuperTypes().add(this.getFXNode());
		fxListViewEClass.getESuperTypes().add(this.getFXNode());
		fxTableViewEClass.getESuperTypes().add(this.getFXNode());
		fxFilteredTableViewEClass.getESuperTypes().add(this.getFXTableView());
		fxSortFilteredTableViewEClass.getESuperTypes().add(this.getFXFilteredTableView());

		// Initialize classes, features, and operations; add parameters
		initEClass(fxRootEClass, FXRoot.class, "FXRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXRoot_Children(), this.getFXNode(), null, "children", null, 0, -1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXRoot_BasePackage(), theEcorePackage.getEString(), "basePackage", null, 0, 1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXRoot_Controller(), theEcorePackage.getEString(), "controller", null, 0, 1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXRoot_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FXRoot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXRoot_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, -1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxEventEClass, FXEvent.class, "FXEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXEvent_OnMouseClicked(), theEcorePackage.getEString(), "onMouseClicked", null, 0, 1,
				FXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fxNodeEClass, FXNode.class, "FXNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXNode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, FXNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXNode_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FXNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXNode_Opacity(), theEcorePackage.getEDouble(), "opacity", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_Visible(), theEcorePackage.getEBoolean(), "visible", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_Disable(), theEcorePackage.getEBoolean(), "disable", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_Style(), theEcorePackage.getEString(), "style", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, -1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_LayoutX(), theEcorePackage.getEDouble(), "layoutX", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_LayoutY(), theEcorePackage.getEDouble(), "layoutY", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_PrefWidth(), theEcorePackage.getEDouble(), "prefWidth", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_PrefHeight(), theEcorePackage.getEDouble(), "prefHeight", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_MinWidth(), theEcorePackage.getEDouble(), "minWidth", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_MinHeight(), theEcorePackage.getEDouble(), "minHeight", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_MaxWidth(), theEcorePackage.getEDouble(), "maxWidth", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXNode_MaxHeight(), theEcorePackage.getEDouble(), "maxHeight", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFXNode_Padding(), this.getFXPadding(), null, "padding", null, 0, 1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXNode_Margin(), this.getFXMargin(), null, "margin", null, 0, 1, FXNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxMarginEClass, FXMargin.class, "FXMargin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXMargin_Top(), theEcorePackage.getEDouble(), "top", "0.0", 0, 1, FXMargin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXMargin_Bottom(), theEcorePackage.getEDouble(), "bottom", "0.0", 0, 1, FXMargin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXMargin_Right(), theEcorePackage.getEDouble(), "right", "0.0", 0, 1, FXMargin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXMargin_Left(), theEcorePackage.getEDouble(), "left", "0.0", 0, 1, FXMargin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxPaddingEClass, FXPadding.class, "FXPadding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXPadding_Top(), theEcorePackage.getEDouble(), "top", "0.0", 0, 1, FXPadding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXPadding_Bottom(), theEcorePackage.getEDouble(), "bottom", "0.0", 0, 1, FXPadding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXPadding_Right(), theEcorePackage.getEDouble(), "right", "0.0", 0, 1, FXPadding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXPadding_Left(), theEcorePackage.getEDouble(), "left", "0.0", 0, 1, FXPadding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxLayoutEClass, FXLayout.class, "FXLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXLayout_Children(), this.getFXNode(), null, "children", null, 0, -1, FXLayout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxhBoxEClass, FXHBox.class, "FXHBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXHBox_Spacing(), theEcorePackage.getEDouble(), "spacing", null, 0, 1, FXHBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxvBoxEClass, FXVBox.class, "FXVBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXVBox_Spacing(), theEcorePackage.getEDouble(), "spacing", null, 0, 1, FXVBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxBorderPaneEClass, FXBorderPane.class, "FXBorderPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXBorderPane_Left(), this.getFXNode(), null, "left", null, 0, 1, FXBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXBorderPane_Right(), this.getFXNode(), null, "right", null, 0, 1, FXBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXBorderPane_Center(), this.getFXNode(), null, "center", null, 0, 1, FXBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXBorderPane_Bottom(), this.getFXNode(), null, "bottom", null, 0, 1, FXBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXBorderPane_Top(), this.getFXNode(), null, "top", null, 0, 1, FXBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxButtonEClass, FXButton.class, "FXButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxLabelEClass, FXLabel.class, "FXLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxCheckButtonEClass, FXCheckButton.class, "FXCheckButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxRadioButtonEClass, FXRadioButton.class, "FXRadioButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxListViewEClass, FXListView.class, "FXListView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxTableViewEClass, FXTableView.class, "FXTableView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXTableView_Columns(), this.getFXTableColumn(), null, "columns", null, 0, -1,
				FXTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxFilteredTableViewEClass, FXFilteredTableView.class, "FXFilteredTableView", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxSortFilteredTableViewEClass, FXSortFilteredTableView.class, "FXSortFilteredTableView",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxTableColumnEClass, FXTableColumn.class, "FXTableColumn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXTableColumn_Id(), theEcorePackage.getEString(), "id", null, 0, 1, FXTableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXTableColumn_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FXTableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXTableColumn_Width(), theEcorePackage.getEDouble(), "width", "150", 0, 1,
				FXTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXTableColumn_CellValueFactory(), theEcorePackage.getEString(), "cellValueFactory", null, 0,
				1, FXTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXTableColumn_CellFactory(), theEcorePackage.getEString(), "cellFactory", null, 0, 1,
				FXTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UIPackageImpl
