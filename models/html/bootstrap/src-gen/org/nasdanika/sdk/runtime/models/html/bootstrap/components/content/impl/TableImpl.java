/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableFoot;
import org.nasdanika.sdk.runtime.models.html.TableHead;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#isBordered <em>Bordered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#isBorderless <em>Borderless</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#isHover <em>Hover</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#isResponsive <em>Responsive</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#getResponsiveBelow <em>Responsive Below</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl#getFoot <em>Foot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends BootstrapElementImpl implements Table {
	/**
	 * The default value of the '{@link #isStriped() <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStriped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIPED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isBordered() <em>Bordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBordered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isBorderless() <em>Borderless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderless()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERLESS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isHover() <em>Hover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHover()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOVER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SM;

	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final Variant VARIANT_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #isResponsive() <em>Responsive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESPONSIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getResponsiveBelow() <em>Responsive Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiveBelow()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint RESPONSIVE_BELOW_EDEFAULT = Breakpoint.XS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStriped() {
		return (Boolean)eDynamicGet(ContentPackage.TABLE__STRIPED, ContentPackage.Literals.TABLE__STRIPED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStriped(boolean newStriped) {
		eDynamicSet(ContentPackage.TABLE__STRIPED, ContentPackage.Literals.TABLE__STRIPED, newStriped);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBordered() {
		return (Boolean)eDynamicGet(ContentPackage.TABLE__BORDERED, ContentPackage.Literals.TABLE__BORDERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBordered(boolean newBordered) {
		eDynamicSet(ContentPackage.TABLE__BORDERED, ContentPackage.Literals.TABLE__BORDERED, newBordered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorderless() {
		return (Boolean)eDynamicGet(ContentPackage.TABLE__BORDERLESS, ContentPackage.Literals.TABLE__BORDERLESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderless(boolean newBorderless) {
		eDynamicSet(ContentPackage.TABLE__BORDERLESS, ContentPackage.Literals.TABLE__BORDERLESS, newBorderless);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHover() {
		return (Boolean)eDynamicGet(ContentPackage.TABLE__HOVER, ContentPackage.Literals.TABLE__HOVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHover(boolean newHover) {
		eDynamicSet(ContentPackage.TABLE__HOVER, ContentPackage.Literals.TABLE__HOVER, newHover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(ContentPackage.TABLE__SIZE, ContentPackage.Literals.TABLE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(ContentPackage.TABLE__SIZE, ContentPackage.Literals.TABLE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(ContentPackage.TABLE__SIZE, ContentPackage.Literals.TABLE__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(ContentPackage.TABLE__SIZE, ContentPackage.Literals.TABLE__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getVariant() {
		return (Variant)eDynamicGet(ContentPackage.TABLE__VARIANT, ContentPackage.Literals.TABLE__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Variant newVariant) {
		eDynamicSet(ContentPackage.TABLE__VARIANT, ContentPackage.Literals.TABLE__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.TABLE__VARIANT, ContentPackage.Literals.TABLE__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.TABLE__VARIANT, ContentPackage.Literals.TABLE__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResponsive() {
		return (Boolean)eDynamicGet(ContentPackage.TABLE__RESPONSIVE, ContentPackage.Literals.TABLE__RESPONSIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsive(boolean newResponsive) {
		eDynamicSet(ContentPackage.TABLE__RESPONSIVE, ContentPackage.Literals.TABLE__RESPONSIVE, newResponsive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint getResponsiveBelow() {
		return (Breakpoint)eDynamicGet(ContentPackage.TABLE__RESPONSIVE_BELOW, ContentPackage.Literals.TABLE__RESPONSIVE_BELOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiveBelow(Breakpoint newResponsiveBelow) {
		eDynamicSet(ContentPackage.TABLE__RESPONSIVE_BELOW, ContentPackage.Literals.TABLE__RESPONSIVE_BELOW, newResponsiveBelow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponsiveBelow() {
		eDynamicUnset(ContentPackage.TABLE__RESPONSIVE_BELOW, ContentPackage.Literals.TABLE__RESPONSIVE_BELOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponsiveBelow() {
		return eDynamicIsSet(ContentPackage.TABLE__RESPONSIVE_BELOW, ContentPackage.Literals.TABLE__RESPONSIVE_BELOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHead getHead() {
		return (TableHead)eDynamicGet(ContentPackage.TABLE__HEAD, ContentPackage.Literals.TABLE__HEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(TableHead newHead, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHead, ContentPackage.TABLE__HEAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(TableHead newHead) {
		eDynamicSet(ContentPackage.TABLE__HEAD, ContentPackage.Literals.TABLE__HEAD, newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TableBody> getBodies() {
		return (EList<TableBody>)eDynamicGet(ContentPackage.TABLE__BODIES, ContentPackage.Literals.TABLE__BODIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFoot getFoot() {
		return (TableFoot)eDynamicGet(ContentPackage.TABLE__FOOT, ContentPackage.Literals.TABLE__FOOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoot(TableFoot newFoot, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFoot, ContentPackage.TABLE__FOOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoot(TableFoot newFoot) {
		eDynamicSet(ContentPackage.TABLE__FOOT, ContentPackage.Literals.TABLE__FOOT, newFoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.TABLE__HEAD:
				return basicSetHead(null, msgs);
			case ContentPackage.TABLE__BODIES:
				return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
			case ContentPackage.TABLE__FOOT:
				return basicSetFoot(null, msgs);
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
			case ContentPackage.TABLE__STRIPED:
				return isStriped();
			case ContentPackage.TABLE__BORDERED:
				return isBordered();
			case ContentPackage.TABLE__BORDERLESS:
				return isBorderless();
			case ContentPackage.TABLE__HOVER:
				return isHover();
			case ContentPackage.TABLE__SIZE:
				return getSize();
			case ContentPackage.TABLE__VARIANT:
				return getVariant();
			case ContentPackage.TABLE__RESPONSIVE:
				return isResponsive();
			case ContentPackage.TABLE__RESPONSIVE_BELOW:
				return getResponsiveBelow();
			case ContentPackage.TABLE__HEAD:
				return getHead();
			case ContentPackage.TABLE__BODIES:
				return getBodies();
			case ContentPackage.TABLE__FOOT:
				return getFoot();
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
			case ContentPackage.TABLE__STRIPED:
				setStriped((Boolean)newValue);
				return;
			case ContentPackage.TABLE__BORDERED:
				setBordered((Boolean)newValue);
				return;
			case ContentPackage.TABLE__BORDERLESS:
				setBorderless((Boolean)newValue);
				return;
			case ContentPackage.TABLE__HOVER:
				setHover((Boolean)newValue);
				return;
			case ContentPackage.TABLE__SIZE:
				setSize((Size)newValue);
				return;
			case ContentPackage.TABLE__VARIANT:
				setVariant((Variant)newValue);
				return;
			case ContentPackage.TABLE__RESPONSIVE:
				setResponsive((Boolean)newValue);
				return;
			case ContentPackage.TABLE__RESPONSIVE_BELOW:
				setResponsiveBelow((Breakpoint)newValue);
				return;
			case ContentPackage.TABLE__HEAD:
				setHead((TableHead)newValue);
				return;
			case ContentPackage.TABLE__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends TableBody>)newValue);
				return;
			case ContentPackage.TABLE__FOOT:
				setFoot((TableFoot)newValue);
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
			case ContentPackage.TABLE__STRIPED:
				setStriped(STRIPED_EDEFAULT);
				return;
			case ContentPackage.TABLE__BORDERED:
				setBordered(BORDERED_EDEFAULT);
				return;
			case ContentPackage.TABLE__BORDERLESS:
				setBorderless(BORDERLESS_EDEFAULT);
				return;
			case ContentPackage.TABLE__HOVER:
				setHover(HOVER_EDEFAULT);
				return;
			case ContentPackage.TABLE__SIZE:
				unsetSize();
				return;
			case ContentPackage.TABLE__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.TABLE__RESPONSIVE:
				setResponsive(RESPONSIVE_EDEFAULT);
				return;
			case ContentPackage.TABLE__RESPONSIVE_BELOW:
				unsetResponsiveBelow();
				return;
			case ContentPackage.TABLE__HEAD:
				setHead((TableHead)null);
				return;
			case ContentPackage.TABLE__BODIES:
				getBodies().clear();
				return;
			case ContentPackage.TABLE__FOOT:
				setFoot((TableFoot)null);
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
			case ContentPackage.TABLE__STRIPED:
				return isStriped() != STRIPED_EDEFAULT;
			case ContentPackage.TABLE__BORDERED:
				return isBordered() != BORDERED_EDEFAULT;
			case ContentPackage.TABLE__BORDERLESS:
				return isBorderless() != BORDERLESS_EDEFAULT;
			case ContentPackage.TABLE__HOVER:
				return isHover() != HOVER_EDEFAULT;
			case ContentPackage.TABLE__SIZE:
				return isSetSize();
			case ContentPackage.TABLE__VARIANT:
				return isSetVariant();
			case ContentPackage.TABLE__RESPONSIVE:
				return isResponsive() != RESPONSIVE_EDEFAULT;
			case ContentPackage.TABLE__RESPONSIVE_BELOW:
				return isSetResponsiveBelow();
			case ContentPackage.TABLE__HEAD:
				return getHead() != null;
			case ContentPackage.TABLE__BODIES:
				return !getBodies().isEmpty();
			case ContentPackage.TABLE__FOOT:
				return getFoot() != null;
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
