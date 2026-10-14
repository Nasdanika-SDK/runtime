/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accordion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Items collapse into the accordion unless it is always open. The id of the accordion
 * and of its items is generated if not set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getDefaultActiveKey <em>Default Active Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isFlush <em>Flush</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isAlwaysOpen <em>Always Open</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getAccordion()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='accordion'"
 * @generated
 */
public interface Accordion extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Default Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Event key of the item open initially, the first if not set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Active Key</em>' attribute.
	 * @see #setDefaultActiveKey(String)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getAccordion_DefaultActiveKey()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getDefaultActiveKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getDefaultActiveKey <em>Default Active Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Active Key</em>' attribute.
	 * @see #getDefaultActiveKey()
	 * @generated
	 */
	void setDefaultActiveKey(String value);

	/**
	 * Returns the value of the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush</em>' attribute.
	 * @see #setFlush(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getAccordion_Flush()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html classes='accordion-flush'"
	 * @generated
	 */
	boolean isFlush();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isFlush <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush</em>' attribute.
	 * @see #isFlush()
	 * @generated
	 */
	void setFlush(boolean value);

	/**
	 * Returns the value of the '<em><b>Always Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Open</em>' attribute.
	 * @see #setAlwaysOpen(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getAccordion_AlwaysOpen()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isAlwaysOpen();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isAlwaysOpen <em>Always Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Open</em>' attribute.
	 * @see #isAlwaysOpen()
	 * @generated
	 */
	void setAlwaysOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getAccordion_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccordionItem> getItems();

} // Accordion
