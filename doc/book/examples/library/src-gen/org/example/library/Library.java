/**
 */
package org.example.library;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of books and the people who wrote them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.library.Library#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.example.library.Library#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @see org.example.library.LibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.library.Author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see org.example.library.LibraryPackage#getLibrary_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Author> getAuthors();

	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.library.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see org.example.library.LibraryPackage#getLibrary_Books()
	 * @model containment="true"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Books published before the year.
	 * <!-- end-model-doc -->
	 * @model unique="false" yearUnique="false"
	 * @generated
	 */
	EList<Book> publishedBefore(int year);

} // Library
