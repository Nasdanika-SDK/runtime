/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aspect Ratio</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getAspectRatio()
 * @model
 * @generated
 */
public enum AspectRatio implements Enumerator {
	/**
	 * The '<em><b>R1x1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R1X1_VALUE
	 * @generated
	 * @ordered
	 */
	R1X1(0, "r1x1", "1x1"),

	/**
	 * The '<em><b>R4x3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R4X3_VALUE
	 * @generated
	 * @ordered
	 */
	R4X3(0, "r4x3", "4x3"),

	/**
	 * The '<em><b>R1 6x9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R16X9_VALUE
	 * @generated
	 * @ordered
	 */
	R16X9(0, "r16x9", "16x9"),

	/**
	 * The '<em><b>R2 1x9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R21X9_VALUE
	 * @generated
	 * @ordered
	 */
	R21X9(0, "r21x9", "21x9");

	/**
	 * The '<em><b>R1x1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R1X1
	 * @model name="r1x1" literal="1x1"
	 * @generated
	 * @ordered
	 */
	public static final int R1X1_VALUE = 0;

	/**
	 * The '<em><b>R4x3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R4X3
	 * @model name="r4x3" literal="4x3"
	 * @generated
	 * @ordered
	 */
	public static final int R4X3_VALUE = 0;

	/**
	 * The '<em><b>R1 6x9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R16X9
	 * @model name="r16x9" literal="16x9"
	 * @generated
	 * @ordered
	 */
	public static final int R16X9_VALUE = 0;

	/**
	 * The '<em><b>R2 1x9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R21X9
	 * @model name="r21x9" literal="21x9"
	 * @generated
	 * @ordered
	 */
	public static final int R21X9_VALUE = 0;

	/**
	 * An array of all the '<em><b>Aspect Ratio</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AspectRatio[] VALUES_ARRAY =
		new AspectRatio[] {
			R1X1,
			R4X3,
			R16X9,
			R21X9,
		};

	/**
	 * A public read-only list of all the '<em><b>Aspect Ratio</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AspectRatio> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aspect Ratio</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AspectRatio get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AspectRatio result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect Ratio</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AspectRatio getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AspectRatio result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect Ratio</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AspectRatio get(int value) {
		switch (value) {
			case R1X1_VALUE: return R1X1;
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
	private AspectRatio(int value, String name, String literal) {
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
	
} //AspectRatio
