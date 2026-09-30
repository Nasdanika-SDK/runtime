/**
 */
package org.nasdanika.sdk.runtime.models.core.kind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kinded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.kind.Kinded#getToTest <em>To Test</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.kind.KindPackage#getKinded()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Kinded extends EObject {
	/**
	 * Returns the value of the '<em><b>To Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Test</em>' attribute.
	 * @see #setToTest(int)
	 * @see org.nasdanika.sdk.runtime.models.core.kind.KindPackage#getKinded_ToTest()
	 * @model unique="false"
	 * @generated
	 */
	int getToTest();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.kind.Kinded#getToTest <em>To Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Test</em>' attribute.
	 * @see #getToTest()
	 * @generated
	 */
	void setToTest(int value);

} // Kinded
