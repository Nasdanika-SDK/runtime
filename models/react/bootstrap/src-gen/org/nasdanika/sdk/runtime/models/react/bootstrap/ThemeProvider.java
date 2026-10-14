/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getBreakpoints <em>Breakpoints</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getMinBreakpoint <em>Min Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getDir <em>Dir</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getThemeProvider()
 * @model annotation="urn:org.nasdanika:react component='ThemeProvider'"
 * @generated
 */
public interface ThemeProvider extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Breakpoints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Breakpoint names, largest first
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breakpoints</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getThemeProvider_Breakpoints()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getBreakpoints();

	/**
	 * Returns the value of the '<em><b>Min Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Breakpoint</em>' attribute.
	 * @see #setMinBreakpoint(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getThemeProvider_MinBreakpoint()
	 * @model unique="false"
	 * @generated
	 */
	String getMinBreakpoint();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getMinBreakpoint <em>Min Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Breakpoint</em>' attribute.
	 * @see #getMinBreakpoint()
	 * @generated
	 */
	void setMinBreakpoint(String value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  "rtl" for right to left layouts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see #setDir(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getThemeProvider_Dir()
	 * @model unique="false"
	 * @generated
	 */
	String getDir();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(String value);

} // ThemeProvider
