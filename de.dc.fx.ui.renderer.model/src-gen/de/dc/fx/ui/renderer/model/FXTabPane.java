/**
 */
package de.dc.fx.ui.renderer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Tab Pane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.renderer.model.FXTabPane#getTabClosePolicy <em>Tab Close Policy</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTabPane()
 * @model
 * @generated
 */
public interface FXTabPane extends FXLayout {
	/**
	 * Returns the value of the '<em><b>Tab Close Policy</b></em>' attribute.
	 * The default value is <code>"ALL_TABS"</code>.
	 * The literals are from the enumeration {@link de.dc.fx.ui.renderer.model.FXTabClosePolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Close Policy</em>' attribute.
	 * @see de.dc.fx.ui.renderer.model.FXTabClosePolicy
	 * @see #setTabClosePolicy(FXTabClosePolicy)
	 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTabPane_TabClosePolicy()
	 * @model default="ALL_TABS" unique="false"
	 * @generated
	 */
	FXTabClosePolicy getTabClosePolicy();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.renderer.model.FXTabPane#getTabClosePolicy <em>Tab Close Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Close Policy</em>' attribute.
	 * @see de.dc.fx.ui.renderer.model.FXTabClosePolicy
	 * @see #getTabClosePolicy()
	 * @generated
	 */
	void setTabClosePolicy(FXTabClosePolicy value);

} // FXTabPane
