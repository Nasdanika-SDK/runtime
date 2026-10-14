/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variant</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  Theme colors - variant, bg, text and border props
 * <!-- end-model-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getVariant()
 * @model
 * @generated
 */
public enum Variant implements Enumerator {
	/**
	 * The '<em><b>Primary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY(0, "primary", "primary"),

	/**
	 * The '<em><b>Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY(0, "secondary", "secondary"),

	/**
	 * The '<em><b>Success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESS(0, "success", "success"),

	/**
	 * The '<em><b>Danger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANGER_VALUE
	 * @generated
	 * @ordered
	 */
	DANGER(0, "danger", "danger"),

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(0, "warning", "warning"),

	/**
	 * The '<em><b>Info</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_VALUE
	 * @generated
	 * @ordered
	 */
	INFO(0, "info", "info"),

	/**
	 * The '<em><b>Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT(0, "light", "light"),

	/**
	 * The '<em><b>Dark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_VALUE
	 * @generated
	 * @ordered
	 */
	DARK(0, "dark", "dark");

	/**
	 * The '<em><b>Primary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY
	 * @model name="primary"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_VALUE = 0;

	/**
	 * The '<em><b>Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY
	 * @model name="secondary"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_VALUE = 0;

	/**
	 * The '<em><b>Success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS
	 * @model name="success"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS_VALUE = 0;

	/**
	 * The '<em><b>Danger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANGER
	 * @model name="danger"
	 * @generated
	 * @ordered
	 */
	public static final int DANGER_VALUE = 0;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model name="warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 0;

	/**
	 * The '<em><b>Info</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO
	 * @model name="info"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_VALUE = 0;

	/**
	 * The '<em><b>Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT
	 * @model name="light"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_VALUE = 0;

	/**
	 * The '<em><b>Dark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK
	 * @model name="dark"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_VALUE = 0;

	/**
	 * An array of all the '<em><b>Variant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Variant[] VALUES_ARRAY =
		new Variant[] {
			PRIMARY,
			SECONDARY,
			SUCCESS,
			DANGER,
			WARNING,
			INFO,
			LIGHT,
			DARK,
		};

	/**
	 * A public read-only list of all the '<em><b>Variant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Variant> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Variant</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Variant get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Variant result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variant</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Variant getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Variant result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variant</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Variant get(int value) {
		switch (value) {
			case PRIMARY_VALUE: return PRIMARY;
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
	private Variant(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Variant
