/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Import Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImportKind()
 * @model
 * @generated
 */
public enum ImportKind implements Enumerator {
	/**
	 * The '<em><b>NAMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import { X } from "..."
	 * <!-- end-model-doc -->
	 * @see #NAMED_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED(0, "NAMED", "NAMED"),

	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import X from "..."
	 * <!-- end-model-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>NAMESPACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import * as X from "..."
	 * <!-- end-model-doc -->
	 * @see #NAMESPACE_VALUE
	 * @generated
	 * @ordered
	 */
	NAMESPACE(0, "NAMESPACE", "NAMESPACE"),

	/**
	 * The '<em><b>SIDE EFFECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import "..." - side effect only, no bindings
	 * <!-- end-model-doc -->
	 * @see #SIDE_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	SIDE_EFFECT(0, "SIDE_EFFECT", "SIDE_EFFECT");

	/**
	 * The '<em><b>NAMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import { X } from "..."
	 * <!-- end-model-doc -->
	 * @see #NAMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_VALUE = 0;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import X from "..."
	 * <!-- end-model-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>NAMESPACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import * as X from "..."
	 * <!-- end-model-doc -->
	 * @see #NAMESPACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAMESPACE_VALUE = 0;

	/**
	 * The '<em><b>SIDE EFFECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  import "..." - side effect only, no bindings
	 * <!-- end-model-doc -->
	 * @see #SIDE_EFFECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIDE_EFFECT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Import Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImportKind[] VALUES_ARRAY =
		new ImportKind[] {
			NAMED,
			DEFAULT,
			NAMESPACE,
			SIDE_EFFECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Import Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImportKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Import Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImportKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImportKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Import Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImportKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImportKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Import Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImportKind get(int value) {
		switch (value) {
			case NAMED_VALUE: return NAMED;
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
	private ImportKind(int value, String name, String literal) {
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
	
} //ImportKind
