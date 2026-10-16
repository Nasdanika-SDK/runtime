/**
 */
package org.example.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Genre;
import org.example.library.LibraryPackage;

import org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.library.impl.BookImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.example.library.impl.BookImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.example.library.impl.BookImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link org.example.library.impl.BookImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.example.library.impl.BookImpl#getCites <em>Cites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookImpl extends NamedElementImpl implements Book {
	/**
	 * The default value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected static final String ISBN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected static final Genre GENRE_EDEFAULT = Genre.FICTION;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsbn() {
		return (String)eDynamicGet(LibraryPackage.BOOK__ISBN, LibraryPackage.Literals.BOOK__ISBN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsbn(String newIsbn) {
		eDynamicSet(LibraryPackage.BOOK__ISBN, LibraryPackage.Literals.BOOK__ISBN, newIsbn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return (Integer)eDynamicGet(LibraryPackage.BOOK__YEAR, LibraryPackage.Literals.BOOK__YEAR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		eDynamicSet(LibraryPackage.BOOK__YEAR, LibraryPackage.Literals.BOOK__YEAR, newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genre getGenre() {
		return (Genre)eDynamicGet(LibraryPackage.BOOK__GENRE, LibraryPackage.Literals.BOOK__GENRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenre(Genre newGenre) {
		eDynamicSet(LibraryPackage.BOOK__GENRE, LibraryPackage.Literals.BOOK__GENRE, newGenre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Author> getAuthors() {
		return (EList<Author>)eDynamicGet(LibraryPackage.BOOK__AUTHORS, LibraryPackage.Literals.BOOK__AUTHORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Book> getCites() {
		return (EList<Book>)eDynamicGet(LibraryPackage.BOOK__CITES, LibraryPackage.Literals.BOOK__CITES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BOOK__AUTHORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuthors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BOOK__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.BOOK__ISBN:
				return getIsbn();
			case LibraryPackage.BOOK__YEAR:
				return getYear();
			case LibraryPackage.BOOK__GENRE:
				return getGenre();
			case LibraryPackage.BOOK__AUTHORS:
				return getAuthors();
			case LibraryPackage.BOOK__CITES:
				return getCites();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.BOOK__ISBN:
				setIsbn((String)newValue);
				return;
			case LibraryPackage.BOOK__YEAR:
				setYear((Integer)newValue);
				return;
			case LibraryPackage.BOOK__GENRE:
				setGenre((Genre)newValue);
				return;
			case LibraryPackage.BOOK__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>)newValue);
				return;
			case LibraryPackage.BOOK__CITES:
				getCites().clear();
				getCites().addAll((Collection<? extends Book>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.BOOK__ISBN:
				setIsbn(ISBN_EDEFAULT);
				return;
			case LibraryPackage.BOOK__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case LibraryPackage.BOOK__GENRE:
				setGenre(GENRE_EDEFAULT);
				return;
			case LibraryPackage.BOOK__AUTHORS:
				getAuthors().clear();
				return;
			case LibraryPackage.BOOK__CITES:
				getCites().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.BOOK__ISBN:
				return ISBN_EDEFAULT == null ? getIsbn() != null : !ISBN_EDEFAULT.equals(getIsbn());
			case LibraryPackage.BOOK__YEAR:
				return getYear() != YEAR_EDEFAULT;
			case LibraryPackage.BOOK__GENRE:
				return getGenre() != GENRE_EDEFAULT;
			case LibraryPackage.BOOK__AUTHORS:
				return !getAuthors().isEmpty();
			case LibraryPackage.BOOK__CITES:
				return !getCites().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BookImpl
