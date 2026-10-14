/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Align;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Breadcrumb;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.BreadcrumbItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownDivider;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownItemText;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownMenu;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownToggle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.MenuVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Nav;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavDropdown;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavLink;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarBrand;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarCollapse;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarText;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarToggle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Pagination;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationEllipsis;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationFirst;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationLast;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationLink;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationNext;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationPrev;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.SplitButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Tab;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Tabs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationPackageImpl extends EPackageImpl implements NavigationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navDropdownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navbarBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navbarToggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navbarCollapseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navbarTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breadcrumbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breadcrumbItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationPrevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationEllipsisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationNextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationLastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownToggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownDividerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownItemTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum navVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fixedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dropEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum menuVariantEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NavigationPackageImpl() {
		super(eNS_URI, NavigationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NavigationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NavigationPackage init() {
		if (isInited) return (NavigationPackage)EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNavigationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NavigationPackageImpl theNavigationPackage = registeredNavigationPackage instanceof NavigationPackageImpl ? (NavigationPackageImpl)registeredNavigationPackage : new NavigationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BootstrapPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNavigationPackage.createPackageContents();

		// Initialize created meta-data
		theNavigationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNavigationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NavigationPackage.eNS_URI, theNavigationPackage);
		return theNavigationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavEntry() {
		return navEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNav() {
		return navEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNav_Variant() {
		return (EAttribute)navEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNav_Fill() {
		return (EAttribute)navEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNav_Justify() {
		return (EAttribute)navEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNav_Entries() {
		return (EReference)navEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavItem() {
		return navItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavItem_Link() {
		return (EReference)navItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavLink() {
		return navLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavLink_Href() {
		return (EAttribute)navLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavLink_Active() {
		return (EAttribute)navLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavLink_Disabled() {
		return (EAttribute)navLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavDropdown() {
		return navDropdownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavDropdown_Title() {
		return (EAttribute)navDropdownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavDropdown_TitleNode() {
		return (EReference)navDropdownEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavDropdown_MenuEnd() {
		return (EAttribute)navDropdownEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavDropdown_Entries() {
		return (EReference)navDropdownEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavbar() {
		return navbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbar_Bg() {
		return (EAttribute)navbarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbar_Theme() {
		return (EAttribute)navbarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbar_AlwaysExpanded() {
		return (EAttribute)navbarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbar_Expand() {
		return (EAttribute)navbarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbar_Fixed() {
		return (EAttribute)navbarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbar_Sticky() {
		return (EAttribute)navbarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavbar_Content() {
		return (EReference)navbarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavbarBrand() {
		return navbarBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbarBrand_Href() {
		return (EAttribute)navbarBrandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavbarToggle() {
		return navbarToggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavbarToggle_Controls() {
		return (EAttribute)navbarToggleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavbarCollapse() {
		return navbarCollapseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavbarCollapse_Content() {
		return (EReference)navbarCollapseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavbarText() {
		return navbarTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabs() {
		return tabsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabs_DefaultActiveKey() {
		return (EAttribute)tabsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabs_Variant() {
		return (EAttribute)tabsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabs_Fill() {
		return (EAttribute)tabsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabs_Justify() {
		return (EAttribute)tabsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabs_Tabs() {
		return (EReference)tabsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_EventKey() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_Title() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTab_TitleNode() {
		return (EReference)tabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_Disabled() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreadcrumb() {
		return breadcrumbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreadcrumb_Items() {
		return (EReference)breadcrumbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreadcrumbItem() {
		return breadcrumbItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreadcrumbItem_Href() {
		return (EAttribute)breadcrumbItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreadcrumbItem_Active() {
		return (EAttribute)breadcrumbItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationEntry() {
		return paginationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagination() {
		return paginationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagination_Size() {
		return (EAttribute)paginationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagination_Entries() {
		return (EReference)paginationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationLink() {
		return paginationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginationLink_Href() {
		return (EAttribute)paginationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginationLink_Active() {
		return (EAttribute)paginationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginationLink_Disabled() {
		return (EAttribute)paginationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationItem() {
		return paginationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationFirst() {
		return paginationFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationPrev() {
		return paginationPrevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationEllipsis() {
		return paginationEllipsisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationNext() {
		return paginationNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginationLast() {
		return paginationLastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownEntry() {
		return dropdownEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdown() {
		return dropdownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdown_Drop() {
		return (EAttribute)dropdownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdown_Align() {
		return (EAttribute)dropdownEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropdown_Toggle() {
		return (EReference)dropdownEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropdown_Menu() {
		return (EReference)dropdownEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownToggle() {
		return dropdownToggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownToggle_Variant() {
		return (EAttribute)dropdownToggleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownToggle_Size() {
		return (EAttribute)dropdownToggleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownMenu() {
		return dropdownMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownMenu_Variant() {
		return (EAttribute)dropdownMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownMenu_Align() {
		return (EAttribute)dropdownMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropdownMenu_Entries() {
		return (EReference)dropdownMenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownItem() {
		return dropdownItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownItem_Href() {
		return (EAttribute)dropdownItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownItem_Active() {
		return (EAttribute)dropdownItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownItem_Disabled() {
		return (EAttribute)dropdownItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownHeader() {
		return dropdownHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownDivider() {
		return dropdownDividerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownItemText() {
		return dropdownItemTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropdownButton() {
		return dropdownButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownButton_Title() {
		return (EAttribute)dropdownButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropdownButton_TitleNode() {
		return (EReference)dropdownButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownButton_Variant() {
		return (EAttribute)dropdownButtonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownButton_Size() {
		return (EAttribute)dropdownButtonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropdownButton_Drop() {
		return (EAttribute)dropdownButtonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropdownButton_Entries() {
		return (EReference)dropdownButtonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitButton() {
		return splitButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplitButton_Href() {
		return (EAttribute)splitButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNavVariant() {
		return navVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFixed() {
		return fixedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrop() {
		return dropEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMenuVariant() {
		return menuVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFactory getNavigationFactory() {
		return (NavigationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		navEntryEClass = createEClass(NAV_ENTRY);

		navEClass = createEClass(NAV);
		createEAttribute(navEClass, NAV__VARIANT);
		createEAttribute(navEClass, NAV__FILL);
		createEAttribute(navEClass, NAV__JUSTIFY);
		createEReference(navEClass, NAV__ENTRIES);

		navItemEClass = createEClass(NAV_ITEM);
		createEReference(navItemEClass, NAV_ITEM__LINK);

		navLinkEClass = createEClass(NAV_LINK);
		createEAttribute(navLinkEClass, NAV_LINK__HREF);
		createEAttribute(navLinkEClass, NAV_LINK__ACTIVE);
		createEAttribute(navLinkEClass, NAV_LINK__DISABLED);

		navDropdownEClass = createEClass(NAV_DROPDOWN);
		createEAttribute(navDropdownEClass, NAV_DROPDOWN__TITLE);
		createEReference(navDropdownEClass, NAV_DROPDOWN__TITLE_NODE);
		createEAttribute(navDropdownEClass, NAV_DROPDOWN__MENU_END);
		createEReference(navDropdownEClass, NAV_DROPDOWN__ENTRIES);

		navbarEClass = createEClass(NAVBAR);
		createEAttribute(navbarEClass, NAVBAR__BG);
		createEAttribute(navbarEClass, NAVBAR__THEME);
		createEAttribute(navbarEClass, NAVBAR__ALWAYS_EXPANDED);
		createEAttribute(navbarEClass, NAVBAR__EXPAND);
		createEAttribute(navbarEClass, NAVBAR__FIXED);
		createEAttribute(navbarEClass, NAVBAR__STICKY);
		createEReference(navbarEClass, NAVBAR__CONTENT);

		navbarBrandEClass = createEClass(NAVBAR_BRAND);
		createEAttribute(navbarBrandEClass, NAVBAR_BRAND__HREF);

		navbarToggleEClass = createEClass(NAVBAR_TOGGLE);
		createEAttribute(navbarToggleEClass, NAVBAR_TOGGLE__CONTROLS);

		navbarCollapseEClass = createEClass(NAVBAR_COLLAPSE);
		createEReference(navbarCollapseEClass, NAVBAR_COLLAPSE__CONTENT);

		navbarTextEClass = createEClass(NAVBAR_TEXT);

		tabsEClass = createEClass(TABS);
		createEAttribute(tabsEClass, TABS__DEFAULT_ACTIVE_KEY);
		createEAttribute(tabsEClass, TABS__VARIANT);
		createEAttribute(tabsEClass, TABS__FILL);
		createEAttribute(tabsEClass, TABS__JUSTIFY);
		createEReference(tabsEClass, TABS__TABS);

		tabEClass = createEClass(TAB);
		createEAttribute(tabEClass, TAB__EVENT_KEY);
		createEAttribute(tabEClass, TAB__TITLE);
		createEReference(tabEClass, TAB__TITLE_NODE);
		createEAttribute(tabEClass, TAB__DISABLED);

		breadcrumbEClass = createEClass(BREADCRUMB);
		createEReference(breadcrumbEClass, BREADCRUMB__ITEMS);

		breadcrumbItemEClass = createEClass(BREADCRUMB_ITEM);
		createEAttribute(breadcrumbItemEClass, BREADCRUMB_ITEM__HREF);
		createEAttribute(breadcrumbItemEClass, BREADCRUMB_ITEM__ACTIVE);

		paginationEntryEClass = createEClass(PAGINATION_ENTRY);

		paginationEClass = createEClass(PAGINATION);
		createEAttribute(paginationEClass, PAGINATION__SIZE);
		createEReference(paginationEClass, PAGINATION__ENTRIES);

		paginationLinkEClass = createEClass(PAGINATION_LINK);
		createEAttribute(paginationLinkEClass, PAGINATION_LINK__HREF);
		createEAttribute(paginationLinkEClass, PAGINATION_LINK__ACTIVE);
		createEAttribute(paginationLinkEClass, PAGINATION_LINK__DISABLED);

		paginationItemEClass = createEClass(PAGINATION_ITEM);

		paginationFirstEClass = createEClass(PAGINATION_FIRST);

		paginationPrevEClass = createEClass(PAGINATION_PREV);

		paginationEllipsisEClass = createEClass(PAGINATION_ELLIPSIS);

		paginationNextEClass = createEClass(PAGINATION_NEXT);

		paginationLastEClass = createEClass(PAGINATION_LAST);

		dropdownEntryEClass = createEClass(DROPDOWN_ENTRY);

		dropdownEClass = createEClass(DROPDOWN);
		createEAttribute(dropdownEClass, DROPDOWN__DROP);
		createEAttribute(dropdownEClass, DROPDOWN__ALIGN);
		createEReference(dropdownEClass, DROPDOWN__TOGGLE);
		createEReference(dropdownEClass, DROPDOWN__MENU);

		dropdownToggleEClass = createEClass(DROPDOWN_TOGGLE);
		createEAttribute(dropdownToggleEClass, DROPDOWN_TOGGLE__VARIANT);
		createEAttribute(dropdownToggleEClass, DROPDOWN_TOGGLE__SIZE);

		dropdownMenuEClass = createEClass(DROPDOWN_MENU);
		createEAttribute(dropdownMenuEClass, DROPDOWN_MENU__VARIANT);
		createEAttribute(dropdownMenuEClass, DROPDOWN_MENU__ALIGN);
		createEReference(dropdownMenuEClass, DROPDOWN_MENU__ENTRIES);

		dropdownItemEClass = createEClass(DROPDOWN_ITEM);
		createEAttribute(dropdownItemEClass, DROPDOWN_ITEM__HREF);
		createEAttribute(dropdownItemEClass, DROPDOWN_ITEM__ACTIVE);
		createEAttribute(dropdownItemEClass, DROPDOWN_ITEM__DISABLED);

		dropdownHeaderEClass = createEClass(DROPDOWN_HEADER);

		dropdownDividerEClass = createEClass(DROPDOWN_DIVIDER);

		dropdownItemTextEClass = createEClass(DROPDOWN_ITEM_TEXT);

		dropdownButtonEClass = createEClass(DROPDOWN_BUTTON);
		createEAttribute(dropdownButtonEClass, DROPDOWN_BUTTON__TITLE);
		createEReference(dropdownButtonEClass, DROPDOWN_BUTTON__TITLE_NODE);
		createEAttribute(dropdownButtonEClass, DROPDOWN_BUTTON__VARIANT);
		createEAttribute(dropdownButtonEClass, DROPDOWN_BUTTON__SIZE);
		createEAttribute(dropdownButtonEClass, DROPDOWN_BUTTON__DROP);
		createEReference(dropdownButtonEClass, DROPDOWN_BUTTON__ENTRIES);

		splitButtonEClass = createEClass(SPLIT_BUTTON);
		createEAttribute(splitButtonEClass, SPLIT_BUTTON__HREF);

		// Create enums
		navVariantEEnum = createEEnum(NAV_VARIANT);
		fixedEEnum = createEEnum(FIXED);
		dropEEnum = createEEnum(DROP);
		alignEEnum = createEEnum(ALIGN);
		menuVariantEEnum = createEEnum(MENU_VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		navEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navItemEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navItemEClass.getESuperTypes().add(this.getNavEntry());
		navLinkEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navLinkEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		navLinkEClass.getESuperTypes().add(this.getNavEntry());
		navDropdownEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navDropdownEClass.getESuperTypes().add(this.getNavEntry());
		navbarEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navbarBrandEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navbarBrandEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		navbarToggleEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navbarCollapseEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navbarTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		navbarTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		tabsEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		tabEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		tabEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		breadcrumbEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		breadcrumbItemEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		breadcrumbItemEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		paginationEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		paginationLinkEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		paginationLinkEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		paginationLinkEClass.getESuperTypes().add(this.getPaginationEntry());
		paginationItemEClass.getESuperTypes().add(this.getPaginationLink());
		paginationFirstEClass.getESuperTypes().add(this.getPaginationLink());
		paginationPrevEClass.getESuperTypes().add(this.getPaginationLink());
		paginationEllipsisEClass.getESuperTypes().add(this.getPaginationLink());
		paginationNextEClass.getESuperTypes().add(this.getPaginationLink());
		paginationLastEClass.getESuperTypes().add(this.getPaginationLink());
		dropdownEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownToggleEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownToggleEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		dropdownMenuEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownItemEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownItemEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		dropdownItemEClass.getESuperTypes().add(this.getDropdownEntry());
		dropdownHeaderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownHeaderEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		dropdownHeaderEClass.getESuperTypes().add(this.getDropdownEntry());
		dropdownDividerEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownDividerEClass.getESuperTypes().add(this.getDropdownEntry());
		dropdownItemTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		dropdownItemTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		dropdownItemTextEClass.getESuperTypes().add(this.getDropdownEntry());
		dropdownButtonEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		splitButtonEClass.getESuperTypes().add(this.getDropdownButton());

		// Initialize classes, features, and operations; add parameters
		initEClass(navEntryEClass, NavEntry.class, "NavEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navEClass, Nav.class, "Nav", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNav_Variant(), this.getNavVariant(), "variant", null, 0, 1, Nav.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNav_Fill(), theEcorePackage.getEBoolean(), "fill", null, 0, 1, Nav.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNav_Justify(), theEcorePackage.getEBoolean(), "justify", null, 0, 1, Nav.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNav_Entries(), this.getNavEntry(), null, "entries", null, 0, -1, Nav.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navItemEClass, NavItem.class, "NavItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavItem_Link(), this.getNavLink(), null, "link", null, 0, 1, NavItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navLinkEClass, NavLink.class, "NavLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, NavLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavLink_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, NavLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavLink_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, NavLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navDropdownEClass, NavDropdown.class, "NavDropdown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavDropdown_Title(), theEcorePackage.getEString(), "title", null, 0, 1, NavDropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavDropdown_TitleNode(), theHtmlPackage.getNode(), null, "titleNode", null, 0, 1, NavDropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavDropdown_MenuEnd(), theEcorePackage.getEBoolean(), "menuEnd", null, 0, 1, NavDropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavDropdown_Entries(), this.getDropdownEntry(), null, "entries", null, 0, -1, NavDropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navbarEClass, Navbar.class, "Navbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavbar_Bg(), theBootstrapPackage.getVariant(), "bg", null, 0, 1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavbar_Theme(), theBootstrapPackage.getColorMode(), "theme", null, 0, 1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavbar_AlwaysExpanded(), theEcorePackage.getEBoolean(), "alwaysExpanded", null, 0, 1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavbar_Expand(), theBootstrapPackage.getBreakpoint(), "expand", null, 0, 1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavbar_Fixed(), this.getFixed(), "fixed", null, 0, 1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavbar_Sticky(), this.getFixed(), "sticky", null, 0, 1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavbar_Content(), theHtmlPackage.getNode(), null, "content", null, 0, -1, Navbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navbarBrandEClass, NavbarBrand.class, "NavbarBrand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavbarBrand_Href(), theEcorePackage.getEString(), "href", null, 0, 1, NavbarBrand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navbarToggleEClass, NavbarToggle.class, "NavbarToggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavbarToggle_Controls(), theEcorePackage.getEString(), "controls", null, 0, 1, NavbarToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navbarCollapseEClass, NavbarCollapse.class, "NavbarCollapse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavbarCollapse_Content(), theHtmlPackage.getNode(), null, "content", null, 0, -1, NavbarCollapse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navbarTextEClass, NavbarText.class, "NavbarText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabsEClass, Tabs.class, "Tabs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabs_DefaultActiveKey(), theEcorePackage.getEString(), "defaultActiveKey", null, 0, 1, Tabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabs_Variant(), this.getNavVariant(), "variant", null, 0, 1, Tabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabs_Fill(), theEcorePackage.getEBoolean(), "fill", null, 0, 1, Tabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabs_Justify(), theEcorePackage.getEBoolean(), "justify", null, 0, 1, Tabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabs_Tabs(), this.getTab(), null, "tabs", null, 0, -1, Tabs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_EventKey(), theEcorePackage.getEString(), "eventKey", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTab_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTab_TitleNode(), theHtmlPackage.getNode(), null, "titleNode", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTab_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breadcrumbEClass, Breadcrumb.class, "Breadcrumb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreadcrumb_Items(), this.getBreadcrumbItem(), null, "items", null, 0, -1, Breadcrumb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breadcrumbItemEClass, BreadcrumbItem.class, "BreadcrumbItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreadcrumbItem_Href(), theEcorePackage.getEString(), "href", null, 0, 1, BreadcrumbItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreadcrumbItem_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, BreadcrumbItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationEntryEClass, PaginationEntry.class, "PaginationEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paginationEClass, Pagination.class, "Pagination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagination_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagination_Entries(), this.getPaginationEntry(), null, "entries", null, 0, -1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationLinkEClass, PaginationLink.class, "PaginationLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaginationLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, PaginationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationLink_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, PaginationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationLink_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, PaginationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationItemEClass, PaginationItem.class, "PaginationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paginationFirstEClass, PaginationFirst.class, "PaginationFirst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paginationPrevEClass, PaginationPrev.class, "PaginationPrev", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paginationEllipsisEClass, PaginationEllipsis.class, "PaginationEllipsis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paginationNextEClass, PaginationNext.class, "PaginationNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paginationLastEClass, PaginationLast.class, "PaginationLast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropdownEntryEClass, DropdownEntry.class, "DropdownEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropdownEClass, Dropdown.class, "Dropdown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropdown_Drop(), this.getDrop(), "drop", null, 0, 1, Dropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdown_Align(), this.getAlign(), "align", null, 0, 1, Dropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropdown_Toggle(), this.getDropdownToggle(), null, "toggle", null, 0, 1, Dropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropdown_Menu(), this.getDropdownMenu(), null, "menu", null, 0, 1, Dropdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropdownToggleEClass, DropdownToggle.class, "DropdownToggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropdownToggle_Variant(), theBootstrapPackage.getButtonVariant(), "variant", null, 0, 1, DropdownToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownToggle_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, DropdownToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropdownMenuEClass, DropdownMenu.class, "DropdownMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropdownMenu_Variant(), this.getMenuVariant(), "variant", null, 0, 1, DropdownMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownMenu_Align(), this.getAlign(), "align", null, 0, 1, DropdownMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropdownMenu_Entries(), this.getDropdownEntry(), null, "entries", null, 0, -1, DropdownMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropdownItemEClass, DropdownItem.class, "DropdownItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropdownItem_Href(), theEcorePackage.getEString(), "href", null, 0, 1, DropdownItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownItem_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, DropdownItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownItem_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, DropdownItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropdownHeaderEClass, DropdownHeader.class, "DropdownHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropdownDividerEClass, DropdownDivider.class, "DropdownDivider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropdownItemTextEClass, DropdownItemText.class, "DropdownItemText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropdownButtonEClass, DropdownButton.class, "DropdownButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropdownButton_Title(), theEcorePackage.getEString(), "title", null, 0, 1, DropdownButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropdownButton_TitleNode(), theHtmlPackage.getNode(), null, "titleNode", null, 0, 1, DropdownButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownButton_Variant(), theBootstrapPackage.getButtonVariant(), "variant", null, 0, 1, DropdownButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownButton_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, DropdownButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropdownButton_Drop(), this.getDrop(), "drop", null, 0, 1, DropdownButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropdownButton_Entries(), this.getDropdownEntry(), null, "entries", null, 0, -1, DropdownButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitButtonEClass, SplitButton.class, "SplitButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSplitButton_Href(), theEcorePackage.getEString(), "href", null, 0, 1, SplitButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(navVariantEEnum, NavVariant.class, "NavVariant");
		addEEnumLiteral(navVariantEEnum, NavVariant.TABS);
		addEEnumLiteral(navVariantEEnum, NavVariant.PILLS);
		addEEnumLiteral(navVariantEEnum, NavVariant.UNDERLINE);

		initEEnum(fixedEEnum, Fixed.class, "Fixed");
		addEEnumLiteral(fixedEEnum, Fixed.TOP);
		addEEnumLiteral(fixedEEnum, Fixed.BOTTOM);

		initEEnum(dropEEnum, Drop.class, "Drop");
		addEEnumLiteral(dropEEnum, Drop.DOWN);
		addEEnumLiteral(dropEEnum, Drop.DOWN_CENTERED);
		addEEnumLiteral(dropEEnum, Drop.UP);
		addEEnumLiteral(dropEEnum, Drop.UP_CENTERED);
		addEEnumLiteral(dropEEnum, Drop.START);
		addEEnumLiteral(dropEEnum, Drop.END);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.START);
		addEEnumLiteral(alignEEnum, Align.END);

		initEEnum(menuVariantEEnum, MenuVariant.class, "MenuVariant");
		addEEnumLiteral(menuVariantEEnum, MenuVariant.DARK);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika:html
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/bootstrap/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.html.bootstrap.components"
		   });
		addAnnotation
		  (navEntryEClass,
		   source,
		   new String[] {
			   "documentation", "Nav.Item, Nav.Link or NavDropdown in a Nav."
		   });
		addAnnotation
		  (navEClass,
		   source,
		   new String[] {
			   "documentation", "ul.nav, or ul.navbar-nav in a navbar. Links which are entries are wrapped in nav items.\nVertical nav: classes flex-column."
		   });
		addAnnotation
		  (navDropdownEClass,
		   source,
		   new String[] {
			   "documentation", "Nav item with a dropdown menu."
		   });
		addAnnotation
		  (getNavDropdown_TitleNode(),
		   source,
		   new String[] {
			   "documentation", " Title with markup. Wins over title."
		   });
		addAnnotation
		  (getNavbar_Theme(),
		   source,
		   new String[] {
			   "documentation", " Color scheme of the content"
		   });
		addAnnotation
		  (getNavbar_AlwaysExpanded(),
		   source,
		   new String[] {
			   "documentation", " Always expanded"
		   });
		addAnnotation
		  (getNavbar_Expand(),
		   source,
		   new String[] {
			   "documentation", " Expanded from the breakpoint up"
		   });
		addAnnotation
		  (getNavbar_Content(),
		   source,
		   new String[] {
			   "documentation", " Usually a Container with brand, toggle and collapse"
		   });
		addAnnotation
		  (navbarToggleEClass,
		   source,
		   new String[] {
			   "documentation", "Button toggling the collapse of a navbar."
		   });
		addAnnotation
		  (getNavbarToggle_Controls(),
		   source,
		   new String[] {
			   "documentation", " Id of the collapse"
		   });
		addAnnotation
		  (tabsEClass,
		   source,
		   new String[] {
			   "documentation", "Nav with tab buttons followed by tab panes. The id of the tabs is generated if not set."
		   });
		addAnnotation
		  (getTabs_DefaultActiveKey(),
		   source,
		   new String[] {
			   "documentation", " Event key of the tab active initially, the first if not set"
		   });
		addAnnotation
		  (tabEClass,
		   source,
		   new String[] {
			   "documentation", "A tab and its pane. The pane content is the text content and contents."
		   });
		addAnnotation
		  (getTab_EventKey(),
		   source,
		   new String[] {
			   "documentation", " The index of the tab if not set"
		   });
		addAnnotation
		  (breadcrumbItemEClass,
		   source,
		   new String[] {
			   "documentation", "A link, or text if active or without href."
		   });
		addAnnotation
		  (paginationEntryEClass,
		   source,
		   new String[] {
			   "documentation", "Pagination.Item or one of the navigation items."
		   });
		addAnnotation
		  (paginationEClass,
		   source,
		   new String[] {
			   "documentation", " aria-label is Pagination unless set with attributes"
		   });
		addAnnotation
		  (paginationLinkEClass,
		   source,
		   new String[] {
			   "documentation", "li.page-item with a page link. Navigation items have default content and labels."
		   });
		addAnnotation
		  (dropdownEntryEClass,
		   source,
		   new String[] {
			   "documentation", "Item, header, divider or item text of a dropdown menu, wrapped in li."
		   });
		addAnnotation
		  (dropEEnum,
		   source,
		   new String[] {
			   "documentation", "Literals are the classes of the dropdown element."
		   });
		addAnnotation
		  (getDropdown_Align(),
		   source,
		   new String[] {
			   "documentation", " Alignment of the menu"
		   });
		addAnnotation
		  (dropdownButtonEClass,
		   source,
		   new String[] {
			   "documentation", "Dropdown with a button toggle in one element."
		   });
		addAnnotation
		  (splitButtonEClass,
		   source,
		   new String[] {
			   "documentation", "Button with a separate dropdown toggle. A link if href is set."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Html", "urn:org.nasdanika:html"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:html</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:html";
		addAnnotation
		  (navEClass,
		   source,
		   new String[] {
			   "tag", "ul"
		   });
		addAnnotation
		  (getNav_Variant(),
		   source,
		   new String[] {
			   "classes", "nav-{}"
		   });
		addAnnotation
		  (getNav_Fill(),
		   source,
		   new String[] {
			   "classes", "nav-fill"
		   });
		addAnnotation
		  (getNav_Justify(),
		   source,
		   new String[] {
			   "classes", "nav-justified"
		   });
		addAnnotation
		  (navItemEClass,
		   source,
		   new String[] {
			   "tag", "li",
			   "classes", "nav-item"
		   });
		addAnnotation
		  (navLinkEClass,
		   source,
		   new String[] {
			   "tag", "a",
			   "classes", "nav-link"
		   });
		addAnnotation
		  (getNavLink_Active(),
		   source,
		   new String[] {
			   "classes", "active"
		   });
		addAnnotation
		  (getNavLink_Disabled(),
		   source,
		   new String[] {
			   "classes", "disabled"
		   });
		addAnnotation
		  (navDropdownEClass,
		   source,
		   new String[] {
			   "tag", "li",
			   "classes", "nav-item dropdown"
		   });
		addAnnotation
		  (getNavDropdown_Title(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getNavDropdown_TitleNode(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getNavDropdown_MenuEnd(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getNavDropdown_Entries(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (navbarEClass,
		   source,
		   new String[] {
			   "tag", "nav",
			   "classes", "navbar"
		   });
		addAnnotation
		  (getNavbar_Bg(),
		   source,
		   new String[] {
			   "classes", "bg-{}"
		   });
		addAnnotation
		  (getNavbar_Theme(),
		   source,
		   new String[] {
			   "attribute", "data-bs-theme"
		   });
		addAnnotation
		  (getNavbar_AlwaysExpanded(),
		   source,
		   new String[] {
			   "classes", "navbar-expand"
		   });
		addAnnotation
		  (getNavbar_Expand(),
		   source,
		   new String[] {
			   "classes", "navbar-expand-{}"
		   });
		addAnnotation
		  (getNavbar_Fixed(),
		   source,
		   new String[] {
			   "classes", "fixed-{}"
		   });
		addAnnotation
		  (getNavbar_Sticky(),
		   source,
		   new String[] {
			   "classes", "sticky-{}"
		   });
		addAnnotation
		  (navbarBrandEClass,
		   source,
		   new String[] {
			   "tag", "a",
			   "classes", "navbar-brand"
		   });
		addAnnotation
		  (navbarToggleEClass,
		   source,
		   new String[] {
			   "tag", "button",
			   "classes", "navbar-toggler",
			   "attributes", "type=button;data-bs-toggle=collapse;aria-expanded=false;aria-label=Toggle navigation"
		   });
		addAnnotation
		  (getNavbarToggle_Controls(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (navbarCollapseEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "collapse navbar-collapse"
		   });
		addAnnotation
		  (navbarTextEClass,
		   source,
		   new String[] {
			   "tag", "span",
			   "classes", "navbar-text"
		   });
		addAnnotation
		  (tabsEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getTabs_DefaultActiveKey(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTabs_Variant(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTabs_Fill(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTabs_Justify(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTabs_Tabs(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (tabEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getTab_EventKey(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTab_Title(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTab_TitleNode(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTab_Disabled(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (breadcrumbEClass,
		   source,
		   new String[] {
			   "tag", "nav",
			   "attributes", "aria-label=breadcrumb"
		   });
		addAnnotation
		  (getBreadcrumb_Items(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (breadcrumbItemEClass,
		   source,
		   new String[] {
			   "tag", "li",
			   "classes", "breadcrumb-item"
		   });
		addAnnotation
		  (getBreadcrumbItem_Href(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getBreadcrumbItem_Active(),
		   source,
		   new String[] {
			   "classes", "active"
		   });
		addAnnotation
		  (paginationEClass,
		   source,
		   new String[] {
			   "tag", "nav",
			   "attributes", "aria-label=Pagination"
		   });
		addAnnotation
		  (getPagination_Size(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getPagination_Entries(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (paginationLinkEClass,
		   source,
		   new String[] {
			   "tag", "li",
			   "classes", "page-item"
		   });
		addAnnotation
		  (getPaginationLink_Href(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getPaginationLink_Active(),
		   source,
		   new String[] {
			   "classes", "active"
		   });
		addAnnotation
		  (getPaginationLink_Disabled(),
		   source,
		   new String[] {
			   "classes", "disabled"
		   });
		addAnnotation
		  (dropdownEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getDropdown_Drop(),
		   source,
		   new String[] {
			   "classes", "{}",
			   "default", "dropdown"
		   });
		addAnnotation
		  (getDropdown_Align(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (dropdownToggleEClass,
		   source,
		   new String[] {
			   "tag", "button",
			   "classes", "btn dropdown-toggle",
			   "attributes", "type=button;data-bs-toggle=dropdown;aria-expanded=false"
		   });
		addAnnotation
		  (getDropdownToggle_Variant(),
		   source,
		   new String[] {
			   "classes", "btn-{}",
			   "default", "primary"
		   });
		addAnnotation
		  (getDropdownToggle_Size(),
		   source,
		   new String[] {
			   "classes", "btn-{}"
		   });
		addAnnotation
		  (dropdownMenuEClass,
		   source,
		   new String[] {
			   "tag", "ul",
			   "classes", "dropdown-menu"
		   });
		addAnnotation
		  (getDropdownMenu_Variant(),
		   source,
		   new String[] {
			   "classes", "dropdown-menu-{}"
		   });
		addAnnotation
		  (getDropdownMenu_Align(),
		   source,
		   new String[] {
			   "classes", "dropdown-menu-{}"
		   });
		addAnnotation
		  (dropdownItemEClass,
		   source,
		   new String[] {
			   "tag", "a",
			   "classes", "dropdown-item"
		   });
		addAnnotation
		  (getDropdownItem_Active(),
		   source,
		   new String[] {
			   "classes", "active"
		   });
		addAnnotation
		  (getDropdownItem_Disabled(),
		   source,
		   new String[] {
			   "classes", "disabled"
		   });
		addAnnotation
		  (dropdownHeaderEClass,
		   source,
		   new String[] {
			   "tag", "h6",
			   "classes", "dropdown-header"
		   });
		addAnnotation
		  (dropdownDividerEClass,
		   source,
		   new String[] {
			   "tag", "hr",
			   "classes", "dropdown-divider",
			   "voidElement", "true"
		   });
		addAnnotation
		  (dropdownItemTextEClass,
		   source,
		   new String[] {
			   "tag", "span",
			   "classes", "dropdown-item-text"
		   });
		addAnnotation
		  (dropdownButtonEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getDropdownButton_Title(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getDropdownButton_TitleNode(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getDropdownButton_Variant(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getDropdownButton_Size(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getDropdownButton_Drop(),
		   source,
		   new String[] {
			   "classes", "{}",
			   "default", "dropdown"
		   });
		addAnnotation
		  (getDropdownButton_Entries(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (splitButtonEClass,
		   source,
		   new String[] {
			   "classes", "btn-group"
		   });
		addAnnotation
		  (getSplitButton_Href(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
	}

} //NavigationPackageImpl
