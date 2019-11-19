/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXRoot#getChildren <em>Children</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXRoot#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXRoot#getController <em>Controller</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXRoot#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXRoot#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXRoot()
 * @model
 * @generated
 */
public interface FXRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.renderer.model.FXNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXRoot_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXRoot_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXRoot#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXRoot_Controller()
	 * @model unique="false"
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXRoot#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXRoot_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute list.
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXRoot_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStyleClass();

} // FXRoot
