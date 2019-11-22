/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.renderer.model.UIPackage
 * @generated
 */
public interface UIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UIFactory eINSTANCE = de.dc.fx.ui.renderer.model.impl.UIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FX Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Root</em>'.
	 * @generated
	 */
	FXRoot createFXRoot();

	/**
	 * Returns a new object of class '<em>FX Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Event</em>'.
	 * @generated
	 */
	FXEvent createFXEvent();

	/**
	 * Returns a new object of class '<em>FX Margin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Margin</em>'.
	 * @generated
	 */
	FXMargin createFXMargin();

	/**
	 * Returns a new object of class '<em>FX Padding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Padding</em>'.
	 * @generated
	 */
	FXPadding createFXPadding();

	/**
	 * Returns a new object of class '<em>FXH Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FXH Box</em>'.
	 * @generated
	 */
	FXHBox createFXHBox();

	/**
	 * Returns a new object of class '<em>FX Border Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Border Pane</em>'.
	 * @generated
	 */
	FXBorderPane createFXBorderPane();

	/**
	 * Returns a new object of class '<em>FX Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Button</em>'.
	 * @generated
	 */
	FXButton createFXButton();

	/**
	 * Returns a new object of class '<em>FX Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Label</em>'.
	 * @generated
	 */
	FXLabel createFXLabel();

	/**
	 * Returns a new object of class '<em>FX Check Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Check Button</em>'.
	 * @generated
	 */
	FXCheckButton createFXCheckButton();

	/**
	 * Returns a new object of class '<em>FX Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Radio Button</em>'.
	 * @generated
	 */
	FXRadioButton createFXRadioButton();

	/**
	 * Returns a new object of class '<em>FX Table View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Table View</em>'.
	 * @generated
	 */
	FXTableView createFXTableView();

	/**
	 * Returns a new object of class '<em>FX Filtered Table View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Filtered Table View</em>'.
	 * @generated
	 */
	FXFilteredTableView createFXFilteredTableView();

	/**
	 * Returns a new object of class '<em>FX Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Table Column</em>'.
	 * @generated
	 */
	FXTableColumn createFXTableColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UIPackage getUIPackage();

} //UIFactory
