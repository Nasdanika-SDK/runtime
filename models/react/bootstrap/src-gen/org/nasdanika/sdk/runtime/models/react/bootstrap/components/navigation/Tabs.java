/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getDefaultActiveKey <em>Default Active Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getActiveKey <em>Active Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isFill <em>Fill</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isJustify <em>Justify</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isMountOnEnter <em>Mount On Enter</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isUnmountOnExit <em>Unmount On Exit</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs()
 * @model annotation="urn:org.nasdanika:react component='Tabs'"
 * @generated
 */
public interface Tabs extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Default Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Active Key</em>' attribute.
	 * @see #setDefaultActiveKey(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_DefaultActiveKey()
	 * @model unique="false"
	 * @generated
	 */
	String getDefaultActiveKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getDefaultActiveKey <em>Default Active Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Active Key</em>' attribute.
	 * @see #getDefaultActiveKey()
	 * @generated
	 */
	void setDefaultActiveKey(String value);

	/**
	 * Returns the value of the '<em><b>Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Key</em>' attribute.
	 * @see #setActiveKey(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_ActiveKey()
	 * @model unique="false"
	 * @generated
	 */
	String getActiveKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getActiveKey <em>Active Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Key</em>' attribute.
	 * @see #getActiveKey()
	 * @generated
	 */
	void setActiveKey(String value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(NavVariant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	NavVariant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(NavVariant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(NavVariant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(NavVariant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_Fill()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify</em>' attribute.
	 * @see #setJustify(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_Justify()
	 * @model unique="false"
	 * @generated
	 */
	boolean isJustify();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isJustify <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify</em>' attribute.
	 * @see #isJustify()
	 * @generated
	 */
	void setJustify(boolean value);

	/**
	 * Returns the value of the '<em><b>Mount On Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount On Enter</em>' attribute.
	 * @see #setMountOnEnter(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_MountOnEnter()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMountOnEnter();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isMountOnEnter <em>Mount On Enter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount On Enter</em>' attribute.
	 * @see #isMountOnEnter()
	 * @generated
	 */
	void setMountOnEnter(boolean value);

	/**
	 * Returns the value of the '<em><b>Unmount On Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmount On Exit</em>' attribute.
	 * @see #setUnmountOnExit(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_UnmountOnExit()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUnmountOnExit();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isUnmountOnExit <em>Unmount On Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmount On Exit</em>' attribute.
	 * @see #isUnmountOnExit()
	 * @generated
	 */
	void setUnmountOnExit(boolean value);

	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTabs_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tab> getTabs();

} // Tabs
