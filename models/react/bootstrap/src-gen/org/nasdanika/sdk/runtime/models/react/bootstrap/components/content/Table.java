/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableFoot;
import org.nasdanika.sdk.runtime.models.html.TableHead;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Table with HTML sections. Dynamic rows: an Intrinsic TableBody with a JSX iterator as
 * a child of the table.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isBordered <em>Bordered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isBorderless <em>Borderless</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isHover <em>Hover</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isResponsive <em>Responsive</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getResponsiveBelow <em>Responsive Below</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getFoot <em>Foot</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable()
 * @model annotation="urn:org.nasdanika:react component='Table'"
 * @generated
 */
public interface Table extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Striped</em>' attribute.
	 * @see #setStriped(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Striped()
	 * @model unique="false"
	 * @generated
	 */
	boolean isStriped();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isStriped <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Striped</em>' attribute.
	 * @see #isStriped()
	 * @generated
	 */
	void setStriped(boolean value);

	/**
	 * Returns the value of the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bordered</em>' attribute.
	 * @see #setBordered(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Bordered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBordered();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isBordered <em>Bordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bordered</em>' attribute.
	 * @see #isBordered()
	 * @generated
	 */
	void setBordered(boolean value);

	/**
	 * Returns the value of the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borderless</em>' attribute.
	 * @see #setBorderless(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Borderless()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBorderless();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isBorderless <em>Borderless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borderless</em>' attribute.
	 * @see #isBorderless()
	 * @generated
	 */
	void setBorderless(boolean value);

	/**
	 * Returns the value of the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hover</em>' attribute.
	 * @see #setHover(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Hover()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHover();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isHover <em>Hover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hover</em>' attribute.
	 * @see #isHover()
	 * @generated
	 */
	void setHover(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(Size)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Size()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(Variant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Responsive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsive</em>' attribute.
	 * @see #setResponsive(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Responsive()
	 * @model unique="false"
	 * @generated
	 */
	boolean isResponsive();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#isResponsive <em>Responsive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsive</em>' attribute.
	 * @see #isResponsive()
	 * @generated
	 */
	void setResponsive(boolean value);

	/**
	 * Returns the value of the '<em><b>Responsive Below</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Responsive below the breakpoint. Wins over responsive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsive Below</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #isSetResponsiveBelow()
	 * @see #unsetResponsiveBelow()
	 * @see #setResponsiveBelow(Breakpoint)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_ResponsiveBelow()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='responsive'"
	 * @generated
	 */
	Breakpoint getResponsiveBelow();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getResponsiveBelow <em>Responsive Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsive Below</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #isSetResponsiveBelow()
	 * @see #unsetResponsiveBelow()
	 * @see #getResponsiveBelow()
	 * @generated
	 */
	void setResponsiveBelow(Breakpoint value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getResponsiveBelow <em>Responsive Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponsiveBelow()
	 * @see #getResponsiveBelow()
	 * @see #setResponsiveBelow(Breakpoint)
	 * @generated
	 */
	void unsetResponsiveBelow();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getResponsiveBelow <em>Responsive Below</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Responsive Below</em>' attribute is set.
	 * @see #unsetResponsiveBelow()
	 * @see #getResponsiveBelow()
	 * @see #setResponsiveBelow(Breakpoint)
	 * @generated
	 */
	boolean isSetResponsiveBelow();

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(TableHead)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Head()
	 * @model containment="true"
	 * @generated
	 */
	TableHead getHead();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(TableHead value);

	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.TableBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodies</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Bodies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableBody> getBodies();

	/**
	 * Returns the value of the '<em><b>Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foot</em>' containment reference.
	 * @see #setFoot(TableFoot)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getTable_Foot()
	 * @model containment="true"
	 * @generated
	 */
	TableFoot getFoot();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Table#getFoot <em>Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foot</em>' containment reference.
	 * @see #getFoot()
	 * @generated
	 */
	void setFoot(TableFoot value);

} // Table
