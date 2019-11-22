/**
 */
package de.dc.fx.ui.renderer.model.util;

import de.dc.fx.ui.renderer.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.renderer.model.UIPackage
 * @generated
 */
public class UISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISwitch() {
		if (modelPackage == null) {
			modelPackage = UIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UIPackage.FX_ROOT: {
			FXRoot fxRoot = (FXRoot) theEObject;
			T result = caseFXRoot(fxRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_EVENT: {
			FXEvent fxEvent = (FXEvent) theEObject;
			T result = caseFXEvent(fxEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_NODE: {
			FXNode fxNode = (FXNode) theEObject;
			T result = caseFXNode(fxNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_MARGIN: {
			FXMargin fxMargin = (FXMargin) theEObject;
			T result = caseFXMargin(fxMargin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_PADDING: {
			FXPadding fxPadding = (FXPadding) theEObject;
			T result = caseFXPadding(fxPadding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_LAYOUT: {
			FXLayout fxLayout = (FXLayout) theEObject;
			T result = caseFXLayout(fxLayout);
			if (result == null)
				result = caseFXNode(fxLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FXH_BOX: {
			FXHBox fxhBox = (FXHBox) theEObject;
			T result = caseFXHBox(fxhBox);
			if (result == null)
				result = caseFXLayout(fxhBox);
			if (result == null)
				result = caseFXNode(fxhBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_BORDER_PANE: {
			FXBorderPane fxBorderPane = (FXBorderPane) theEObject;
			T result = caseFXBorderPane(fxBorderPane);
			if (result == null)
				result = caseFXLayout(fxBorderPane);
			if (result == null)
				result = caseFXNode(fxBorderPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_BUTTON: {
			FXButton fxButton = (FXButton) theEObject;
			T result = caseFXButton(fxButton);
			if (result == null)
				result = caseFXNode(fxButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_LABEL: {
			FXLabel fxLabel = (FXLabel) theEObject;
			T result = caseFXLabel(fxLabel);
			if (result == null)
				result = caseFXNode(fxLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_CHECK_BUTTON: {
			FXCheckButton fxCheckButton = (FXCheckButton) theEObject;
			T result = caseFXCheckButton(fxCheckButton);
			if (result == null)
				result = caseFXNode(fxCheckButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_RADIO_BUTTON: {
			FXRadioButton fxRadioButton = (FXRadioButton) theEObject;
			T result = caseFXRadioButton(fxRadioButton);
			if (result == null)
				result = caseFXNode(fxRadioButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_TABLE_VIEW: {
			FXTableView fxTableView = (FXTableView) theEObject;
			T result = caseFXTableView(fxTableView);
			if (result == null)
				result = caseFXNode(fxTableView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UIPackage.FX_TABLE_COLUMN: {
			FXTableColumn fxTableColumn = (FXTableColumn) theEObject;
			T result = caseFXTableColumn(fxTableColumn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXRoot(FXRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXEvent(FXEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXNode(FXNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Margin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Margin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXMargin(FXMargin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Padding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Padding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXPadding(FXPadding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXLayout(FXLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FXH Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FXH Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXHBox(FXHBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Border Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Border Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXBorderPane(FXBorderPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXButton(FXButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXLabel(FXLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Check Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Check Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXCheckButton(FXCheckButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXRadioButton(FXRadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Table View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Table View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXTableView(FXTableView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXTableColumn(FXTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UISwitch
