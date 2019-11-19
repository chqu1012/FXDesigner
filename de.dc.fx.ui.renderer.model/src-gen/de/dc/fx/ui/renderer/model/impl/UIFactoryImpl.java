/**
 */
package de.dc.fx.ui.renderer.model.impl;

import de.dc.fx.ui.renderer.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIFactoryImpl extends EFactoryImpl implements UIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UIFactory init() {
		try {
			UIFactory theUIFactory = (UIFactory) EPackage.Registry.INSTANCE.getEFactory(UIPackage.eNS_URI);
			if (theUIFactory != null) {
				return theUIFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UIPackage.FX_ROOT:
			return createFXRoot();
		case UIPackage.FXH_BOX:
			return createFXHBox();
		case UIPackage.FX_BORDER_PANE:
			return createFXBorderPane();
		case UIPackage.FX_BUTTON:
			return createFXButton();
		case UIPackage.FX_LABEL:
			return createFXLabel();
		case UIPackage.FX_CHECK_BUTTON:
			return createFXCheckButton();
		case UIPackage.FX_RADIO_BUTTON:
			return createFXRadioButton();
		case UIPackage.FX_TABLE_VIEW:
			return createFXTableView();
		case UIPackage.FX_TABLE_COLUMN:
			return createFXTableColumn();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXRoot createFXRoot() {
		FXRootImpl fxRoot = new FXRootImpl();
		return fxRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXHBox createFXHBox() {
		FXHBoxImpl fxhBox = new FXHBoxImpl();
		return fxhBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXBorderPane createFXBorderPane() {
		FXBorderPaneImpl fxBorderPane = new FXBorderPaneImpl();
		return fxBorderPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXButton createFXButton() {
		FXButtonImpl fxButton = new FXButtonImpl();
		return fxButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXLabel createFXLabel() {
		FXLabelImpl fxLabel = new FXLabelImpl();
		return fxLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXCheckButton createFXCheckButton() {
		FXCheckButtonImpl fxCheckButton = new FXCheckButtonImpl();
		return fxCheckButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXRadioButton createFXRadioButton() {
		FXRadioButtonImpl fxRadioButton = new FXRadioButtonImpl();
		return fxRadioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXTableView createFXTableView() {
		FXTableViewImpl fxTableView = new FXTableViewImpl();
		return fxTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXTableColumn createFXTableColumn() {
		FXTableColumnImpl fxTableColumn = new FXTableColumnImpl();
		return fxTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIPackage getUIPackage() {
		return (UIPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UIPackage getPackage() {
		return UIPackage.eINSTANCE;
	}

} //UIFactoryImpl
