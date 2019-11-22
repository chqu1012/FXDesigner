/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Padding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXPadding#getTop <em>Top</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXPadding#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXPadding#getRight <em>Right</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXPadding#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXPadding()
 * @model
 * @generated
 */
public interface FXPadding extends EObject {
	/**
	 * Returns the value of the '<em><b>Top</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' attribute.
	 * @see #setTop(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXPadding_Top()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getTop();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXPadding#getTop <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' attribute.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(double value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' attribute.
	 * @see #setBottom(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXPadding_Bottom()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getBottom();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXPadding#getBottom <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' attribute.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(double value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXPadding_Right()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getRight();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXPadding#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(double value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXPadding_Left()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getLeft();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXPadding#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(double value);

} // FXPadding
