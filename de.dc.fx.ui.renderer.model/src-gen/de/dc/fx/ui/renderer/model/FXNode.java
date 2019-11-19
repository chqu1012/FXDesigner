/**
 */
package de.dc.fx.ui.renderer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getPrefWidth <em>Pref Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getPrefHeight <em>Pref Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode()
 * @model abstract="true"
 * @generated
 */
public interface FXNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getId <em>Id</em>}' attribute.
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
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref Width</em>' attribute.
	 * @see #setPrefWidth(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_PrefWidth()
	 * @model unique="false"
	 * @generated
	 */
	double getPrefWidth();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getPrefWidth <em>Pref Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pref Width</em>' attribute.
	 * @see #getPrefWidth()
	 * @generated
	 */
	void setPrefWidth(double value);

	/**
	 * Returns the value of the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref Height</em>' attribute.
	 * @see #setPrefHeight(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_PrefHeight()
	 * @model unique="false"
	 * @generated
	 */
	double getPrefHeight();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getPrefHeight <em>Pref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pref Height</em>' attribute.
	 * @see #getPrefHeight()
	 * @generated
	 */
	void setPrefHeight(double value);

	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Width</em>' attribute.
	 * @see #setMinWidth(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_MinWidth()
	 * @model unique="false"
	 * @generated
	 */
	double getMinWidth();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getMinWidth <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' attribute.
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(double value);

	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Height</em>' attribute.
	 * @see #setMinHeight(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_MinHeight()
	 * @model unique="false"
	 * @generated
	 */
	double getMinHeight();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getMinHeight <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' attribute.
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(double value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_MaxWidth()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxWidth();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(double value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_MaxHeight()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxHeight();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(double value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.renderer.model.FXNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXNode> getChildren();

} // FXNode
