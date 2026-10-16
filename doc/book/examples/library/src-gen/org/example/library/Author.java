/**
 */
package org.example.library;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person who wrote books.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.library.Author#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @see org.example.library.LibraryPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link org.example.library.Book}.
	 * It is bidirectional and its opposite is '{@link org.example.library.Book#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see org.example.library.LibraryPackage#getAuthor_Books()
	 * @see org.example.library.Book#getAuthors
	 * @model opposite="authors"
	 * @generated
	 */
	EList<Book> getBooks();

} // Author
