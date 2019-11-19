/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.FXBorderPane;
import de.dc.fx.ui.renderer.model.FXButton;
import de.dc.fx.ui.renderer.model.FXCheckButton;
import de.dc.fx.ui.renderer.model.FXHBox;
import de.dc.fx.ui.renderer.model.FXLabel;
import de.dc.fx.ui.renderer.model.FXLayout;
import de.dc.fx.ui.renderer.model.FXNode;
import de.dc.fx.ui.renderer.model.FXRadioButton;
import de.dc.fx.ui.renderer.model.FXRoot;
import de.dc.fx.ui.renderer.model.FXTableColumn;
import de.dc.fx.ui.renderer.model.FXTableView;
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
	private EClass fxNodeEClass = null;

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
	private EClass fxTableViewEClass = null;

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
	public EAttribute getFXRoot_Controller() {
		return (EAttribute) fxRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXRoot_StyleClass() {
		return (EAttribute) fxRootEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getFXNode_PrefWidth() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_PrefHeight() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MinWidth() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MinHeight() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MaxWidth() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXNode_MaxHeight() {
		return (EAttribute) fxNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXNode_Children() {
		return (EReference) fxNodeEClass.getEStructuralFeatures().get(8);
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
	public EClass getFXTableColumn() {
		return fxTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_Name() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXTableColumn_Width() {
		return (EAttribute) fxTableColumnEClass.getEStructuralFeatures().get(1);
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
		createEAttribute(fxRootEClass, FX_ROOT__CONTROLLER);
		createEAttribute(fxRootEClass, FX_ROOT__STYLE_CLASS);

		fxNodeEClass = createEClass(FX_NODE);
		createEAttribute(fxNodeEClass, FX_NODE__ID);
		createEAttribute(fxNodeEClass, FX_NODE__NAME);
		createEAttribute(fxNodeEClass, FX_NODE__PREF_WIDTH);
		createEAttribute(fxNodeEClass, FX_NODE__PREF_HEIGHT);
		createEAttribute(fxNodeEClass, FX_NODE__MIN_WIDTH);
		createEAttribute(fxNodeEClass, FX_NODE__MIN_HEIGHT);
		createEAttribute(fxNodeEClass, FX_NODE__MAX_WIDTH);
		createEAttribute(fxNodeEClass, FX_NODE__MAX_HEIGHT);
		createEReference(fxNodeEClass, FX_NODE__CHILDREN);

		fxLayoutEClass = createEClass(FX_LAYOUT);

		fxhBoxEClass = createEClass(FXH_BOX);
		createEAttribute(fxhBoxEClass, FXH_BOX__SPACING);

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

		fxTableViewEClass = createEClass(FX_TABLE_VIEW);
		createEReference(fxTableViewEClass, FX_TABLE_VIEW__COLUMNS);

		fxTableColumnEClass = createEClass(FX_TABLE_COLUMN);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__NAME);
		createEAttribute(fxTableColumnEClass, FX_TABLE_COLUMN__WIDTH);
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
		fxLayoutEClass.getESuperTypes().add(this.getFXNode());
		fxhBoxEClass.getESuperTypes().add(this.getFXLayout());
		fxBorderPaneEClass.getESuperTypes().add(this.getFXLayout());
		fxButtonEClass.getESuperTypes().add(this.getFXNode());
		fxLabelEClass.getESuperTypes().add(this.getFXNode());
		fxCheckButtonEClass.getESuperTypes().add(this.getFXNode());
		fxRadioButtonEClass.getESuperTypes().add(this.getFXNode());
		fxTableViewEClass.getESuperTypes().add(this.getFXNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(fxRootEClass, FXRoot.class, "FXRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXRoot_Children(), this.getFXNode(), null, "children", null, 0, -1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXRoot_Controller(), theEcorePackage.getEString(), "controller", null, 0, 1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXRoot_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, 1, FXRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxNodeEClass, FXNode.class, "FXNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXNode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, FXNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXNode_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FXNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getFXNode_Children(), this.getFXNode(), null, "children", null, 0, -1, FXNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxLayoutEClass, FXLayout.class, "FXLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxhBoxEClass, FXHBox.class, "FXHBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXHBox_Spacing(), theEcorePackage.getEDouble(), "spacing", null, 0, 1, FXHBox.class,
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

		initEClass(fxTableViewEClass, FXTableView.class, "FXTableView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXTableView_Columns(), this.getFXTableColumn(), null, "columns", null, 0, -1,
				FXTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxTableColumnEClass, FXTableColumn.class, "FXTableColumn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXTableColumn_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FXTableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXTableColumn_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, FXTableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UIPackageImpl
