/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.ReactElement;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.*;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage
 * @generated
 */
public class NavigationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NavigationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationSwitch<Adapter> modelSwitch =
		new NavigationSwitch<Adapter>() {
			@Override
			public Adapter caseNavEntry(NavEntry object) {
				return createNavEntryAdapter();
			}
			@Override
			public Adapter caseNav(Nav object) {
				return createNavAdapter();
			}
			@Override
			public Adapter caseNavItem(NavItem object) {
				return createNavItemAdapter();
			}
			@Override
			public Adapter caseNavLink(NavLink object) {
				return createNavLinkAdapter();
			}
			@Override
			public Adapter caseNavDropdown(NavDropdown object) {
				return createNavDropdownAdapter();
			}
			@Override
			public Adapter caseNavbar(Navbar object) {
				return createNavbarAdapter();
			}
			@Override
			public Adapter caseNavbarBrand(NavbarBrand object) {
				return createNavbarBrandAdapter();
			}
			@Override
			public Adapter caseNavbarToggle(NavbarToggle object) {
				return createNavbarToggleAdapter();
			}
			@Override
			public Adapter caseNavbarCollapse(NavbarCollapse object) {
				return createNavbarCollapseAdapter();
			}
			@Override
			public Adapter caseNavbarText(NavbarText object) {
				return createNavbarTextAdapter();
			}
			@Override
			public Adapter caseTabs(Tabs object) {
				return createTabsAdapter();
			}
			@Override
			public Adapter caseTab(Tab object) {
				return createTabAdapter();
			}
			@Override
			public Adapter caseBreadcrumb(Breadcrumb object) {
				return createBreadcrumbAdapter();
			}
			@Override
			public Adapter caseBreadcrumbItem(BreadcrumbItem object) {
				return createBreadcrumbItemAdapter();
			}
			@Override
			public Adapter casePaginationEntry(PaginationEntry object) {
				return createPaginationEntryAdapter();
			}
			@Override
			public Adapter casePagination(Pagination object) {
				return createPaginationAdapter();
			}
			@Override
			public Adapter casePaginationLink(PaginationLink object) {
				return createPaginationLinkAdapter();
			}
			@Override
			public Adapter casePaginationItem(PaginationItem object) {
				return createPaginationItemAdapter();
			}
			@Override
			public Adapter casePaginationFirst(PaginationFirst object) {
				return createPaginationFirstAdapter();
			}
			@Override
			public Adapter casePaginationPrev(PaginationPrev object) {
				return createPaginationPrevAdapter();
			}
			@Override
			public Adapter casePaginationEllipsis(PaginationEllipsis object) {
				return createPaginationEllipsisAdapter();
			}
			@Override
			public Adapter casePaginationNext(PaginationNext object) {
				return createPaginationNextAdapter();
			}
			@Override
			public Adapter casePaginationLast(PaginationLast object) {
				return createPaginationLastAdapter();
			}
			@Override
			public Adapter caseDropdownEntry(DropdownEntry object) {
				return createDropdownEntryAdapter();
			}
			@Override
			public Adapter caseDropdown(Dropdown object) {
				return createDropdownAdapter();
			}
			@Override
			public Adapter caseDropdownToggle(DropdownToggle object) {
				return createDropdownToggleAdapter();
			}
			@Override
			public Adapter caseDropdownMenu(DropdownMenu object) {
				return createDropdownMenuAdapter();
			}
			@Override
			public Adapter caseDropdownItem(DropdownItem object) {
				return createDropdownItemAdapter();
			}
			@Override
			public Adapter caseDropdownHeader(DropdownHeader object) {
				return createDropdownHeaderAdapter();
			}
			@Override
			public Adapter caseDropdownDivider(DropdownDivider object) {
				return createDropdownDividerAdapter();
			}
			@Override
			public Adapter caseDropdownItemText(DropdownItemText object) {
				return createDropdownItemTextAdapter();
			}
			@Override
			public Adapter caseDropdownButton(DropdownButton object) {
				return createDropdownButtonAdapter();
			}
			@Override
			public Adapter caseSplitButton(SplitButton object) {
				return createSplitButtonAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseStringIdentity(StringIdentity object) {
				return createStringIdentityAdapter();
			}
			@Override
			public Adapter caseDocumented(Documented object) {
				return createDocumentedAdapter();
			}
			@Override
			public Adapter caseMarked(Marked object) {
				return createMarkedAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTypeScriptElement(TypeScriptElement object) {
				return createTypeScriptElementAdapter();
			}
			@Override
			public Adapter caseReactElement(ReactElement object) {
				return createReactElementAdapter();
			}
			@Override
			public Adapter caseJsxNode(JsxNode object) {
				return createJsxNodeAdapter();
			}
			@Override
			public Adapter caseJsxContainer(JsxContainer object) {
				return createJsxContainerAdapter();
			}
			@Override
			public Adapter caseLibraryComponent(LibraryComponent object) {
				return createLibraryComponentAdapter();
			}
			@Override
			public Adapter caseBootstrapComponent(BootstrapComponent object) {
				return createBootstrapComponentAdapter();
			}
			@Override
			public Adapter caseTextContent(TextContent object) {
				return createTextContentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry <em>Nav Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry
	 * @generated
	 */
	public Adapter createNavEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav <em>Nav</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav
	 * @generated
	 */
	public Adapter createNavAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavItem <em>Nav Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavItem
	 * @generated
	 */
	public Adapter createNavItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink <em>Nav Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink
	 * @generated
	 */
	public Adapter createNavLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown <em>Nav Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown
	 * @generated
	 */
	public Adapter createNavDropdownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar
	 * @generated
	 */
	public Adapter createNavbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarBrand <em>Navbar Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarBrand
	 * @generated
	 */
	public Adapter createNavbarBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle <em>Navbar Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle
	 * @generated
	 */
	public Adapter createNavbarToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarCollapse <em>Navbar Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarCollapse
	 * @generated
	 */
	public Adapter createNavbarCollapseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarText <em>Navbar Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarText
	 * @generated
	 */
	public Adapter createNavbarTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs
	 * @generated
	 */
	public Adapter createTabsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb <em>Breadcrumb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb
	 * @generated
	 */
	public Adapter createBreadcrumbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem <em>Breadcrumb Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem
	 * @generated
	 */
	public Adapter createBreadcrumbItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry <em>Pagination Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry
	 * @generated
	 */
	public Adapter createPaginationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination
	 * @generated
	 */
	public Adapter createPaginationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink <em>Pagination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink
	 * @generated
	 */
	public Adapter createPaginationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationItem <em>Pagination Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationItem
	 * @generated
	 */
	public Adapter createPaginationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationFirst <em>Pagination First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationFirst
	 * @generated
	 */
	public Adapter createPaginationFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationPrev <em>Pagination Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationPrev
	 * @generated
	 */
	public Adapter createPaginationPrevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEllipsis <em>Pagination Ellipsis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEllipsis
	 * @generated
	 */
	public Adapter createPaginationEllipsisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationNext <em>Pagination Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationNext
	 * @generated
	 */
	public Adapter createPaginationNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLast <em>Pagination Last</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLast
	 * @generated
	 */
	public Adapter createPaginationLastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry <em>Dropdown Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry
	 * @generated
	 */
	public Adapter createDropdownEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown
	 * @generated
	 */
	public Adapter createDropdownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle <em>Dropdown Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle
	 * @generated
	 */
	public Adapter createDropdownToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu <em>Dropdown Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu
	 * @generated
	 */
	public Adapter createDropdownMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem <em>Dropdown Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem
	 * @generated
	 */
	public Adapter createDropdownItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownHeader <em>Dropdown Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownHeader
	 * @generated
	 */
	public Adapter createDropdownHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownDivider <em>Dropdown Divider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownDivider
	 * @generated
	 */
	public Adapter createDropdownDividerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItemText <em>Dropdown Item Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItemText
	 * @generated
	 */
	public Adapter createDropdownItemTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton <em>Dropdown Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton
	 * @generated
	 */
	public Adapter createDropdownButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.SplitButton <em>Split Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.SplitButton
	 * @generated
	 */
	public Adapter createSplitButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity <em>String Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.StringIdentity
	 * @generated
	 */
	public Adapter createStringIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented
	 * @generated
	 */
	public Adapter createDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.Marked
	 * @generated
	 */
	public Adapter createMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement <em>Type Script Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement
	 * @generated
	 */
	public Adapter createTypeScriptElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.ReactElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactElement
	 * @generated
	 */
	public Adapter createReactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.JsxNode <em>Jsx Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxNode
	 * @generated
	 */
	public Adapter createJsxNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.JsxContainer <em>Jsx Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxContainer
	 * @generated
	 */
	public Adapter createJsxContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.LibraryComponent <em>Library Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.LibraryComponent
	 * @generated
	 */
	public Adapter createLibraryComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent
	 * @generated
	 */
	public Adapter createBootstrapComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent
	 * @generated
	 */
	public Adapter createTextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NavigationAdapterFactory
