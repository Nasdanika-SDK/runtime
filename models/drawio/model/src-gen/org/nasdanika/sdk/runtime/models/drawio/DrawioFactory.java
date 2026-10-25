/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage
 * @generated
 */
public interface DrawioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DrawioFactory eINSTANCE = org.nasdanika.sdk.runtime.models.drawio.impl.DrawioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Simple Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Link</em>'.
	 * @generated
	 */
	SimpleLink createSimpleLink();

	/**
	 * Returns a new object of class '<em>Custom Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Link</em>'.
	 * @generated
	 */
	CustomLink createCustomLink();

	/**
	 * Returns a new object of class '<em>Spel Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spel Link</em>'.
	 * @generated
	 */
	SpelLink createSpelLink();

	/**
	 * Returns a new object of class '<em>Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actions</em>'.
	 * @generated
	 */
	Actions createActions();

	/**
	 * Returns a new object of class '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation</em>'.
	 * @generated
	 */
	Animation createAnimation();

	/**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
	Wait createWait();

	/**
	 * Returns a new object of class '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Show</em>'.
	 * @generated
	 */
	Show createShow();

	/**
	 * Returns a new object of class '<em>Hide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hide</em>'.
	 * @generated
	 */
	Hide createHide();

	/**
	 * Returns a new object of class '<em>Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle</em>'.
	 * @generated
	 */
	Toggle createToggle();

	/**
	 * Returns a new object of class '<em>Set Opacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Opacity</em>'.
	 * @generated
	 */
	SetOpacity createSetOpacity();

	/**
	 * Returns a new object of class '<em>Fade In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade In</em>'.
	 * @generated
	 */
	FadeIn createFadeIn();

	/**
	 * Returns a new object of class '<em>Fade Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade Out</em>'.
	 * @generated
	 */
	FadeOut createFadeOut();

	/**
	 * Returns a new object of class '<em>Fade To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade To</em>'.
	 * @generated
	 */
	FadeTo createFadeTo();

	/**
	 * Returns a new object of class '<em>Wipe In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wipe In</em>'.
	 * @generated
	 */
	WipeIn createWipeIn();

	/**
	 * Returns a new object of class '<em>Wipe Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wipe Out</em>'.
	 * @generated
	 */
	WipeOut createWipeOut();

	/**
	 * Returns a new object of class '<em>Pop In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pop In</em>'.
	 * @generated
	 */
	PopIn createPopIn();

	/**
	 * Returns a new object of class '<em>Pop Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pop Out</em>'.
	 * @generated
	 */
	PopOut createPopOut();

	/**
	 * Returns a new object of class '<em>Set Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Style</em>'.
	 * @generated
	 */
	SetStyle createSetStyle();

	/**
	 * Returns a new object of class '<em>Toggle Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle Style</em>'.
	 * @generated
	 */
	ToggleStyle createToggleStyle();

	/**
	 * Returns a new object of class '<em>Highlight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Highlight</em>'.
	 * @generated
	 */
	Highlight createHighlight();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select</em>'.
	 * @generated
	 */
	Select createSelect();

	/**
	 * Returns a new object of class '<em>Scroll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scroll</em>'.
	 * @generated
	 */
	Scroll createScroll();

	/**
	 * Returns a new object of class '<em>Viewbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewbox</em>'.
	 * @generated
	 */
	Viewbox createViewbox();

	/**
	 * Returns a new object of class '<em>Open</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open</em>'.
	 * @generated
	 */
	Open createOpen();

	/**
	 * Returns a new object of class '<em>Tags Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags Action</em>'.
	 * @generated
	 */
	TagsAction createTagsAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DrawioPackage getDrawioPackage();

} //DrawioFactory
