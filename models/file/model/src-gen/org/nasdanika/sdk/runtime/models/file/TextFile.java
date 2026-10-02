/**
 */
package org.nasdanika.sdk.runtime.models.file;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.TextFile#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.TextFile#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.TextFile#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getTextFile()
 * @model
 * @generated
 */
public interface TextFile extends File {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The default value is <code>"UTF-8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getTextFile_Charset()
	 * @model default="UTF-8" unique="false"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Line Separator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.file.LineSeparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Separator</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.LineSeparator
	 * @see #setLineSeparator(LineSeparator)
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getTextFile_LineSeparator()
	 * @model unique="false"
	 * @generated
	 */
	LineSeparator getLineSeparator();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#getLineSeparator <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Separator</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.LineSeparator
	 * @see #getLineSeparator()
	 * @generated
	 */
	void setLineSeparator(LineSeparator value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The text view. Get decodes the content with the charset; set assigns content that encodes
	 * when read. For large files, use the line operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getTextFile_Text()
	 * @model unique="false" derived="true"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	int lineCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Lines startLine to endLine, one-based and inclusive; endLine -1 means to the end.
	 * <!-- end-model-doc -->
	 * @model unique="false" startLineUnique="false" endLineUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/inference/tool-binding provider='anthropic' type='text_editor_20250728' command='view'"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	String view(int startLine, int endLine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Replaces exactly one occurrence. Fails on zero or several. Preserves the charset and the
	 * line separator, so an edit is a small diff.
	 * <!-- end-model-doc -->
	 * @model oldTextUnique="false" newTextUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/inference/tool-binding provider='anthropic' type='text_editor_20250728' command='str_replace'"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	void replace(String oldText, String newText);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Inserts after a line; 0 inserts at the beginning.
	 * <!-- end-model-doc -->
	 * @model afterLineUnique="false" textDataType="org.nasdanika.sdk.runtime.models.file.CharSequence" textUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/inference/tool-binding provider='anthropic' type='text_editor_20250728' command='insert'"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	void insert(int afterLine, CharSequence text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" regexUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	EList<Match> grep(String regex);

} // TextFile
