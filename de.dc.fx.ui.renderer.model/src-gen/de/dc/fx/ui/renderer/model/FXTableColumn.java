/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTableColumn#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTableColumn#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTableColumn#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTableColumn#getCellValueFactory <em>Cell Value Factory</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTableColumn#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableColumn()
 * @model
 * @generated
 */
public interface FXTableColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableColumn_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableColumn_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"150"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableColumn_Width()
	 * @model default="150" unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Cell Value Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Value Factory</em>' attribute.
	 * @see #setCellValueFactory(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableColumn_CellValueFactory()
	 * @model unique="false"
	 * @generated
	 */
	String getCellValueFactory();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getCellValueFactory <em>Cell Value Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Value Factory</em>' attribute.
	 * @see #getCellValueFactory()
	 * @generated
	 */
	void setCellValueFactory(String value);

	/**
	 * Returns the value of the '<em><b>Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Factory</em>' attribute.
	 * @see #setCellFactory(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTableColumn_CellFactory()
	 * @model unique="false"
	 * @generated
	 */
	String getCellFactory();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXTableColumn#getCellFactory <em>Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Factory</em>' attribute.
	 * @see #getCellFactory()
	 * @generated
	 */
	void setCellFactory(String value);

} // FXTableColumn
