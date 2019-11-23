/**
 */
package de.dc.fx.ui.renderer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FX Tab Close Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.renderer.model.UIPackage#getFXTabClosePolicy()
 * @model
 * @generated
 */
public enum FXTabClosePolicy implements Enumerator {
	/**
	 * The '<em><b>SELECTED TAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTED_TAB_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTED_TAB(0, "SELECTED_TAB", "SELECTED_TAB"),

	/**
	 * The '<em><b>ALL TABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_TABS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_TABS(0, "ALL_TABS", "ALL_TABS"),

	/**
	 * The '<em><b>UNAVAILABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(0, "UNAVAILABLE", "UNAVAILABLE");

	/**
	 * The '<em><b>SELECTED TAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTED_TAB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECTED_TAB_VALUE = 0;

	/**
	 * The '<em><b>ALL TABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_TABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_TABS_VALUE = 0;

	/**
	 * The '<em><b>UNAVAILABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>FX Tab Close Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FXTabClosePolicy[] VALUES_ARRAY = new FXTabClosePolicy[] { SELECTED_TAB, ALL_TABS,
			UNAVAILABLE, };

	/**
	 * A public read-only list of all the '<em><b>FX Tab Close Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FXTabClosePolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FX Tab Close Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FXTabClosePolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FXTabClosePolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FX Tab Close Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FXTabClosePolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FXTabClosePolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FX Tab Close Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FXTabClosePolicy get(int value) {
		switch (value) {
		case SELECTED_TAB_VALUE:
			return SELECTED_TAB;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FXTabClosePolicy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //FXTabClosePolicy
