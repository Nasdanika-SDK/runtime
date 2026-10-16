/**
 */
package org.example.library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Genre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.library.LibraryPackage#getGenre()
 * @model
 * @generated
 */
public enum Genre implements Enumerator {
	/**
	 * The '<em><b>FICTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FICTION_VALUE
	 * @generated
	 * @ordered
	 */
	FICTION(0, "FICTION", "FICTION"),

	/**
	 * The '<em><b>SCIENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SCIENCE(0, "SCIENCE", "SCIENCE"),

	/**
	 * The '<em><b>HISTORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY(0, "HISTORY", "HISTORY"),

	/**
	 * The '<em><b>TECHNOLOGY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNOLOGY(0, "TECHNOLOGY", "TECHNOLOGY");

	/**
	 * The '<em><b>FICTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FICTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FICTION_VALUE = 0;

	/**
	 * The '<em><b>SCIENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCIENCE_VALUE = 0;

	/**
	 * The '<em><b>HISTORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_VALUE = 0;

	/**
	 * The '<em><b>TECHNOLOGY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECHNOLOGY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Genre[] VALUES_ARRAY =
		new Genre[] {
			FICTION,
			SCIENCE,
			HISTORY,
			TECHNOLOGY,
		};

	/**
	 * A public read-only list of all the '<em><b>Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Genre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Genre</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Genre get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Genre result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Genre</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Genre getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Genre result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Genre</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Genre get(int value) {
		switch (value) {
			case FICTION_VALUE: return FICTION;
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
	private Genre(int value, String name, String literal) {
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
	
} //Genre
