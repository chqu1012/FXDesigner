/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTableView#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableView()
 * @model
 * @generated
 */
public interface FXTableView extends FXNode {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.renderer.model.FXTableColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableView_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXTableColumn> getColumns();

} // FXTableView
