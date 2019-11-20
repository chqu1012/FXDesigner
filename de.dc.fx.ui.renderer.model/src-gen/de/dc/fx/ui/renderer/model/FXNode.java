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
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getLayoutY <em>Layout Y</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getStyle <em>Style</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#isDisable <em>Disable</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getPrefWidth <em>Pref Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getPrefHeight <em>Pref Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getPadding <em>Padding</em>}</li>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXNode#getMargin <em>Margin</em>}</li>
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
	 * Returns the value of the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout X</em>' attribute.
	 * @see #setLayoutX(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_LayoutX()
	 * @model unique="false"
	 * @generated
	 */
	double getLayoutX();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getLayoutX <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout X</em>' attribute.
	 * @see #getLayoutX()
	 * @generated
	 */
	void setLayoutX(double value);

	/**
	 * Returns the value of the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Y</em>' attribute.
	 * @see #setLayoutY(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_LayoutY()
	 * @model unique="false"
	 * @generated
	 */
	double getLayoutY();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getLayoutY <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Y</em>' attribute.
	 * @see #getLayoutY()
	 * @generated
	 */
	void setLayoutY(double value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(double)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Opacity()
	 * @model unique="false"
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute list.
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStyleClass();

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Visible()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Disable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

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
	 * Returns the value of the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' containment reference.
	 * @see #setPadding(FXInsets)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Padding()
	 * @model containment="true"
	 * @generated
	 */
	FXInsets getPadding();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getPadding <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' containment reference.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(FXInsets value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' containment reference.
	 * @see #setMargin(FXInsets)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXNode_Margin()
	 * @model containment="true"
	 * @generated
	 */
	FXInsets getMargin();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXNode#getMargin <em>Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' containment reference.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(FXInsets value);

} // FXNode
