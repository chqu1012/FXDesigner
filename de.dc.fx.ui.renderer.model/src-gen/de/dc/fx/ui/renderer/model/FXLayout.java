/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXLayout#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXLayout()
 * @model abstract="true"
 * @generated
 */
public interface FXLayout extends FXNode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.renderer.model.FXNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXLayout_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXNode> getChildren();

} // FXLayout
