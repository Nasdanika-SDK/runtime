/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fullscreen</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getFullscreen()
 * @model
 * @generated
 */
public enum Fullscreen implements Enumerator {
	/**
	 * The '<em><b>Sm Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	SM_DOWN(0, "smDown", "sm-down"),

	/**
	 * The '<em><b>Md Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MD_DOWN(0, "mdDown", "md-down"),

	/**
	 * The '<em><b>Lg Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LG_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	LG_DOWN(0, "lgDown", "lg-down"),

	/**
	 * The '<em><b>Xl Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XL_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	XL_DOWN(0, "xlDown", "xl-down"),

	/**
	 * The '<em><b>Xxl Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XXL_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	XXL_DOWN(0, "xxlDown", "xxl-down");

	/**
	 * The '<em><b>Sm Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM_DOWN
	 * @model name="smDown" literal="sm-down"
	 * @generated
	 * @ordered
	 */
	public static final int SM_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Md Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD_DOWN
	 * @model name="mdDown" literal="md-down"
	 * @generated
	 * @ordered
	 */
	public static final int MD_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Lg Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LG_DOWN
	 * @model name="lgDown" literal="lg-down"
	 * @generated
	 * @ordered
	 */
	public static final int LG_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Xl Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XL_DOWN
	 * @model name="xlDown" literal="xl-down"
	 * @generated
	 * @ordered
	 */
	public static final int XL_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Xxl Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XXL_DOWN
	 * @model name="xxlDown" literal="xxl-down"
	 * @generated
	 * @ordered
	 */
	public static final int XXL_DOWN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Fullscreen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Fullscreen[] VALUES_ARRAY =
		new Fullscreen[] {
			SM_DOWN,
			MD_DOWN,
			LG_DOWN,
			XL_DOWN,
			XXL_DOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Fullscreen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Fullscreen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fullscreen</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Fullscreen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Fullscreen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fullscreen</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Fullscreen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Fullscreen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fullscreen</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Fullscreen get(int value) {
		switch (value) {
			case SM_DOWN_VALUE: return SM_DOWN;
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
	private Fullscreen(int value, String name, String literal) {
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
	
} //Fullscreen
