/**
 */
package org.example.library;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A book. The name is the title.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.library.Book#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.example.library.Book#getYear <em>Year</em>}</li>
 *   <li>{@link org.example.library.Book#getGenre <em>Genre</em>}</li>
 *   <li>{@link org.example.library.Book#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.example.library.Book#getCites <em>Cites</em>}</li>
 * </ul>
 *
 * @see org.example.library.LibraryPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isbn</em>' attribute.
	 * @see #setIsbn(String)
	 * @see org.example.library.LibraryPackage#getBook_Isbn()
	 * @model unique="false"
	 * @generated
	 */
	String getIsbn();

	/**
	 * Sets the value of the '{@link org.example.library.Book#getIsbn <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' attribute.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see org.example.library.LibraryPackage#getBook_Year()
	 * @model unique="false"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link org.example.library.Book#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Genre</b></em>' attribute.
	 * The literals are from the enumeration {@link org.example.library.Genre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre</em>' attribute.
	 * @see org.example.library.Genre
	 * @see #setGenre(Genre)
	 * @see org.example.library.LibraryPackage#getBook_Genre()
	 * @model unique="false"
	 * @generated
	 */
	Genre getGenre();

	/**
	 * Sets the value of the '{@link org.example.library.Book#getGenre <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre</em>' attribute.
	 * @see org.example.library.Genre
	 * @see #getGenre()
	 * @generated
	 */
	void setGenre(Genre value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' reference list.
	 * The list contents are of type {@link org.example.library.Author}.
	 * It is bidirectional and its opposite is '{@link org.example.library.Author#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' reference list.
	 * @see org.example.library.LibraryPackage#getBook_Authors()
	 * @see org.example.library.Author#getBooks
	 * @model opposite="books"
	 * @generated
	 */
	EList<Author> getAuthors();

	/**
	 * Returns the value of the '<em><b>Cites</b></em>' reference list.
	 * The list contents are of type {@link org.example.library.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cited books. No opposite: getReferrers() finds who cites a book.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cites</em>' reference list.
	 * @see org.example.library.LibraryPackage#getBook_Cites()
	 * @model
	 * @generated
	 */
	EList<Book> getCites();

} // Book
