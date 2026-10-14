/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;

import org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapDocumentImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapDocumentImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapDocumentImpl#getBootstrapVersion <em>Bootstrap Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapDocumentImpl#getBootswatchVersion <em>Bootswatch Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapDocumentImpl#isJavaScript <em>Java Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootstrapDocumentImpl extends DocumentImpl implements BootstrapDocument {
	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final Theme THEME_EDEFAULT = Theme.BOOTSTRAP;

	/**
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorMode COLOR_MODE_EDEFAULT = ColorMode.LIGHT;

	/**
	 * The default value of the '{@link #getBootstrapVersion() <em>Bootstrap Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootstrapVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOTSTRAP_VERSION_EDEFAULT = "5.3.8";

	/**
	 * The default value of the '{@link #getBootswatchVersion() <em>Bootswatch Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootswatchVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOTSWATCH_VERSION_EDEFAULT = "5.3.8";

	/**
	 * The default value of the '{@link #isJavaScript() <em>Java Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJavaScript()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JAVA_SCRIPT_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme getTheme() {
		return (Theme)eDynamicGet(BootstrapPackage.BOOTSTRAP_DOCUMENT__THEME, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__THEME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(Theme newTheme) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_DOCUMENT__THEME, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__THEME, newTheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorMode() {
		eDynamicUnset(BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__COLOR_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorMode() {
		return eDynamicIsSet(BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__COLOR_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBootstrapVersion() {
		return (String)eDynamicGet(BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBootstrapVersion(String newBootstrapVersion) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION, newBootstrapVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBootswatchVersion() {
		return (String)eDynamicGet(BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBootswatchVersion(String newBootswatchVersion) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION, newBootswatchVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJavaScript() {
		return (Boolean)eDynamicGet(BootstrapPackage.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaScript(boolean newJavaScript) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT, BootstrapPackage.Literals.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT, newJavaScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__THEME:
				return getTheme();
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE:
				return getColorMode();
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION:
				return getBootstrapVersion();
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION:
				return getBootswatchVersion();
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT:
				return isJavaScript();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__THEME:
				setTheme((Theme)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION:
				setBootstrapVersion((String)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION:
				setBootswatchVersion((String)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT:
				setJavaScript((Boolean)newValue);
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
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE:
				unsetColorMode();
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION:
				setBootstrapVersion(BOOTSTRAP_VERSION_EDEFAULT);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION:
				setBootswatchVersion(BOOTSWATCH_VERSION_EDEFAULT);
				return;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT:
				setJavaScript(JAVA_SCRIPT_EDEFAULT);
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
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__THEME:
				return getTheme() != THEME_EDEFAULT;
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__COLOR_MODE:
				return isSetColorMode();
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION:
				return BOOTSTRAP_VERSION_EDEFAULT == null ? getBootstrapVersion() != null : !BOOTSTRAP_VERSION_EDEFAULT.equals(getBootstrapVersion());
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION:
				return BOOTSWATCH_VERSION_EDEFAULT == null ? getBootswatchVersion() != null : !BOOTSWATCH_VERSION_EDEFAULT.equals(getBootswatchVersion());
			case BootstrapPackage.BOOTSTRAP_DOCUMENT__JAVA_SCRIPT:
				return isJavaScript() != JAVA_SCRIPT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BootstrapDocumentImpl
