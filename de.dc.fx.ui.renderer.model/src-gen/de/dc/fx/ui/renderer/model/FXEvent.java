/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXEvent#getOnMouseClicked <em>On Mouse Clicked</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXEvent()
 * @model
 * @generated
 */
public interface FXEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>On Mouse Clicked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Mouse Clicked</em>' attribute.
	 * @see #setOnMouseClicked(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXEvent_OnMouseClicked()
	 * @model unique="false"
	 * @generated
	 */
	String getOnMouseClicked();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXEvent#getOnMouseClicked <em>On Mouse Clicked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Mouse Clicked</em>' attribute.
	 * @see #getOnMouseClicked()
	 * @generated
	 */
	void setOnMouseClicked(String value);

} // FXEvent
