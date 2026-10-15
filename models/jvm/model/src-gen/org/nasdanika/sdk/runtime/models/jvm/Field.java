/**
 */
package org.nasdanika.sdk.runtime.models.jvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#isEnumConstant <em>Enum Constant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#getConstantValue <em>Constant Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member {
	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_Transient()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_Volatile()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Enum Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Constant</em>' attribute.
	 * @see #setEnumConstant(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_EnumConstant()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnumConstant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isEnumConstant <em>Enum Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Constant</em>' attribute.
	 * @see #isEnumConstant()
	 * @generated
	 */
	void setEnumConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class file ConstantValue attribute, as text. Unset when there is none;
	 * an empty string is the empty String constant.
	 * 
	 * API, not detail: javac copies a constant's value into every class that
	 * reads it, so client code carries the value it was compiled against. A stub
	 * or a spec that gets it wrong compiles silently and is wrong at run time,
	 * and changing it is a break no descriptor diff shows. That holds for
	 * instance fields too - javac emits the attribute for any final field with a
	 * constant initializer, and the JVM ignores it only for non-static ones.
	 * 
	 * The text is the value as the class file stores it, read with the field's
	 * descriptor:
	 *   - boolean, byte, char, short, int: a decimal integer, since all five are
	 *     stored as int - so true is 1 and 'A' is 65;
	 *   - long: a decimal integer;
	 *   - float, double: Float.toString and Double.toString, which round trip
	 *     exactly and spell NaN, Infinity and -0.0;
	 *   - String: the content with Java string escapes - backslash, quote,
	 *     newline, tab and the like, and a Unicode escape (backslash, u, four hex
	 *     digits) for any other control character and for unpaired surrogates -
	 *     so it survives XML 1.0, which cannot carry U+0000, and a source
	 *     generator only has to add the quotes.
	 * 
	 * Reflection cannot populate this: a static final field initialized by a
	 * constant and one initialized in a static initializer look the same through
	 * java.lang.reflect. It comes from the class file, which a live loader can
	 * read too, through the class loader's resource for the type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant Value</em>' attribute.
	 * @see #setConstantValue(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_ConstantValue()
	 * @model unique="false"
	 * @generated
	 */
	String getConstantValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#getConstantValue <em>Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Value</em>' attribute.
	 * @see #getConstantValue()
	 * @generated
	 */
	void setConstantValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Field
