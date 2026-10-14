/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#isAlwaysExpanded <em>Always Expanded</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getExpand <em>Expand</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getSticky <em>Sticky</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar()
 * @model annotation="urn:org.nasdanika:html tag='nav' classes='navbar'"
 * @generated
 */
public interface Navbar extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Bg</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetBg()
	 * @see #unsetBg()
	 * @see #setBg(Variant)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_Bg()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='bg-{}'"
	 * @generated
	 */
	Variant getBg();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetBg()
	 * @see #unsetBg()
	 * @see #getBg()
	 * @generated
	 */
	void setBg(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBg()
	 * @see #getBg()
	 * @see #setBg(Variant)
	 * @generated
	 */
	void unsetBg();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getBg <em>Bg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bg</em>' attribute is set.
	 * @see #unsetBg()
	 * @see #getBg()
	 * @see #setBg(Variant)
	 * @generated
	 */
	boolean isSetBg();

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Color scheme of the content
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode
	 * @see #isSetTheme()
	 * @see #unsetTheme()
	 * @see #setTheme(ColorMode)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_Theme()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html attribute='data-bs-theme'"
	 * @generated
	 */
	ColorMode getTheme();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode
	 * @see #isSetTheme()
	 * @see #unsetTheme()
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(ColorMode value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheme()
	 * @see #getTheme()
	 * @see #setTheme(ColorMode)
	 * @generated
	 */
	void unsetTheme();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getTheme <em>Theme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Theme</em>' attribute is set.
	 * @see #unsetTheme()
	 * @see #getTheme()
	 * @see #setTheme(ColorMode)
	 * @generated
	 */
	boolean isSetTheme();

	/**
	 * Returns the value of the '<em><b>Always Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Always expanded
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Always Expanded</em>' attribute.
	 * @see #setAlwaysExpanded(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_AlwaysExpanded()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html classes='navbar-expand'"
	 * @generated
	 */
	boolean isAlwaysExpanded();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#isAlwaysExpanded <em>Always Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Expanded</em>' attribute.
	 * @see #isAlwaysExpanded()
	 * @generated
	 */
	void setAlwaysExpanded(boolean value);

	/**
	 * Returns the value of the '<em><b>Expand</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Expanded from the breakpoint up
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expand</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint
	 * @see #isSetExpand()
	 * @see #unsetExpand()
	 * @see #setExpand(Breakpoint)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_Expand()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='navbar-expand-{}'"
	 * @generated
	 */
	Breakpoint getExpand();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getExpand <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint
	 * @see #isSetExpand()
	 * @see #unsetExpand()
	 * @see #getExpand()
	 * @generated
	 */
	void setExpand(Breakpoint value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getExpand <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpand()
	 * @see #getExpand()
	 * @see #setExpand(Breakpoint)
	 * @generated
	 */
	void unsetExpand();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getExpand <em>Expand</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expand</em>' attribute is set.
	 * @see #unsetExpand()
	 * @see #getExpand()
	 * @see #setExpand(Breakpoint)
	 * @generated
	 */
	boolean isSetExpand();

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed
	 * @see #isSetFixed()
	 * @see #unsetFixed()
	 * @see #setFixed(Fixed)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_Fixed()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='fixed-{}'"
	 * @generated
	 */
	Fixed getFixed();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed
	 * @see #isSetFixed()
	 * @see #unsetFixed()
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(Fixed value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixed()
	 * @see #getFixed()
	 * @see #setFixed(Fixed)
	 * @generated
	 */
	void unsetFixed();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getFixed <em>Fixed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed</em>' attribute is set.
	 * @see #unsetFixed()
	 * @see #getFixed()
	 * @see #setFixed(Fixed)
	 * @generated
	 */
	boolean isSetFixed();

	/**
	 * Returns the value of the '<em><b>Sticky</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sticky</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed
	 * @see #isSetSticky()
	 * @see #unsetSticky()
	 * @see #setSticky(Fixed)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_Sticky()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='sticky-{}'"
	 * @generated
	 */
	Fixed getSticky();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getSticky <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sticky</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed
	 * @see #isSetSticky()
	 * @see #unsetSticky()
	 * @see #getSticky()
	 * @generated
	 */
	void setSticky(Fixed value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getSticky <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSticky()
	 * @see #getSticky()
	 * @see #setSticky(Fixed)
	 * @generated
	 */
	void unsetSticky();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar#getSticky <em>Sticky</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sticky</em>' attribute is set.
	 * @see #unsetSticky()
	 * @see #getSticky()
	 * @see #setSticky(Fixed)
	 * @generated
	 */
	boolean isSetSticky();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Usually a Container with brand, toggle and collapse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbar_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getContent();

} // Navbar
