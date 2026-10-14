/**
 */
package org.nasdanika.sdk.runtime.models.html.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Marked;

import org.nasdanika.sdk.runtime.models.html.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage
 * @generated
 */
public class HtmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HtmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlSwitch() {
		if (modelPackage == null) {
			modelPackage = HtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HtmlPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseMarked(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseNode(text);
				if (result == null) result = caseMarked(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.MARKUP: {
				Markup markup = (Markup)theEObject;
				T result = caseMarkup(markup);
				if (result == null) result = caseNode(markup);
				if (result == null) result = caseMarked(markup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseNode(comment);
				if (result == null) result = caseMarked(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.NODE_REFERENCE: {
				NodeReference nodeReference = (NodeReference)theEObject;
				T result = caseNodeReference(nodeReference);
				if (result == null) result = caseNode(nodeReference);
				if (result == null) result = caseMarked(nodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseNode(element);
				if (result == null) result = caseMarked(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.VOID_ELEMENT: {
				VoidElement voidElement = (VoidElement)theEObject;
				T result = caseVoidElement(voidElement);
				if (result == null) result = caseElement(voidElement);
				if (result == null) result = caseNode(voidElement);
				if (result == null) result = caseMarked(voidElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.GENERIC_ELEMENT: {
				GenericElement genericElement = (GenericElement)theEObject;
				T result = caseGenericElement(genericElement);
				if (result == null) result = caseElement(genericElement);
				if (result == null) result = caseContainer(genericElement);
				if (result == null) result = caseNode(genericElement);
				if (result == null) result = caseMarked(genericElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.GENERIC_VOID_ELEMENT: {
				GenericVoidElement genericVoidElement = (GenericVoidElement)theEObject;
				T result = caseGenericVoidElement(genericVoidElement);
				if (result == null) result = caseVoidElement(genericVoidElement);
				if (result == null) result = caseElement(genericVoidElement);
				if (result == null) result = caseNode(genericVoidElement);
				if (result == null) result = caseMarked(genericVoidElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LIBRARY_ELEMENT: {
				LibraryElement libraryElement = (LibraryElement)theEObject;
				T result = caseLibraryElement(libraryElement);
				if (result == null) result = caseElement(libraryElement);
				if (result == null) result = caseContainer(libraryElement);
				if (result == null) result = caseNode(libraryElement);
				if (result == null) result = caseMarked(libraryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseElement(document);
				if (result == null) result = caseNode(document);
				if (result == null) result = caseMarked(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HEAD: {
				Head head = (Head)theEObject;
				T result = caseHead(head);
				if (result == null) result = caseElement(head);
				if (result == null) result = caseContainer(head);
				if (result == null) result = caseNode(head);
				if (result == null) result = caseMarked(head);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BODY: {
				Body body = (Body)theEObject;
				T result = caseBody(body);
				if (result == null) result = caseElement(body);
				if (result == null) result = caseContainer(body);
				if (result == null) result = caseNode(body);
				if (result == null) result = caseMarked(body);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = caseVoidElement(meta);
				if (result == null) result = caseElement(meta);
				if (result == null) result = caseNode(meta);
				if (result == null) result = caseMarked(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseVoidElement(link);
				if (result == null) result = caseElement(link);
				if (result == null) result = caseNode(link);
				if (result == null) result = caseMarked(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.STYLESHEET: {
				Stylesheet stylesheet = (Stylesheet)theEObject;
				T result = caseStylesheet(stylesheet);
				if (result == null) result = caseElement(stylesheet);
				if (result == null) result = caseNode(stylesheet);
				if (result == null) result = caseMarked(stylesheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = caseElement(script);
				if (result == null) result = caseNode(script);
				if (result == null) result = caseMarked(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.IMPORT_MAP: {
				ImportMap importMap = (ImportMap)theEObject;
				T result = caseImportMap(importMap);
				if (result == null) result = caseElement(importMap);
				if (result == null) result = caseNode(importMap);
				if (result == null) result = caseMarked(importMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.IMPORT_MAP_SCOPE: {
				ImportMapScope importMapScope = (ImportMapScope)theEObject;
				T result = caseImportMapScope(importMapScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DIV: {
				Div div = (Div)theEObject;
				T result = caseDiv(div);
				if (result == null) result = caseElement(div);
				if (result == null) result = caseContainer(div);
				if (result == null) result = caseNode(div);
				if (result == null) result = caseMarked(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SPAN: {
				Span span = (Span)theEObject;
				T result = caseSpan(span);
				if (result == null) result = caseElement(span);
				if (result == null) result = caseContainer(span);
				if (result == null) result = caseNode(span);
				if (result == null) result = caseMarked(span);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseElement(paragraph);
				if (result == null) result = caseContainer(paragraph);
				if (result == null) result = caseNode(paragraph);
				if (result == null) result = caseMarked(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HEADING: {
				Heading heading = (Heading)theEObject;
				T result = caseHeading(heading);
				if (result == null) result = caseElement(heading);
				if (result == null) result = caseContainer(heading);
				if (result == null) result = caseNode(heading);
				if (result == null) result = caseMarked(heading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseElement(header);
				if (result == null) result = caseContainer(header);
				if (result == null) result = caseNode(header);
				if (result == null) result = caseMarked(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FOOTER: {
				Footer footer = (Footer)theEObject;
				T result = caseFooter(footer);
				if (result == null) result = caseElement(footer);
				if (result == null) result = caseContainer(footer);
				if (result == null) result = caseNode(footer);
				if (result == null) result = caseMarked(footer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.MAIN: {
				Main main = (Main)theEObject;
				T result = caseMain(main);
				if (result == null) result = caseElement(main);
				if (result == null) result = caseContainer(main);
				if (result == null) result = caseNode(main);
				if (result == null) result = caseMarked(main);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.NAV: {
				Nav nav = (Nav)theEObject;
				T result = caseNav(nav);
				if (result == null) result = caseElement(nav);
				if (result == null) result = caseContainer(nav);
				if (result == null) result = caseNode(nav);
				if (result == null) result = caseMarked(nav);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseElement(section);
				if (result == null) result = caseContainer(section);
				if (result == null) result = caseNode(section);
				if (result == null) result = caseMarked(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.ARTICLE: {
				Article article = (Article)theEObject;
				T result = caseArticle(article);
				if (result == null) result = caseElement(article);
				if (result == null) result = caseContainer(article);
				if (result == null) result = caseNode(article);
				if (result == null) result = caseMarked(article);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.ASIDE: {
				Aside aside = (Aside)theEObject;
				T result = caseAside(aside);
				if (result == null) result = caseElement(aside);
				if (result == null) result = caseContainer(aside);
				if (result == null) result = caseNode(aside);
				if (result == null) result = caseMarked(aside);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BLOCKQUOTE: {
				Blockquote blockquote = (Blockquote)theEObject;
				T result = caseBlockquote(blockquote);
				if (result == null) result = caseElement(blockquote);
				if (result == null) result = caseContainer(blockquote);
				if (result == null) result = caseNode(blockquote);
				if (result == null) result = caseMarked(blockquote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.PRE: {
				Pre pre = (Pre)theEObject;
				T result = casePre(pre);
				if (result == null) result = caseElement(pre);
				if (result == null) result = caseContainer(pre);
				if (result == null) result = caseNode(pre);
				if (result == null) result = caseMarked(pre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FIGURE: {
				Figure figure = (Figure)theEObject;
				T result = caseFigure(figure);
				if (result == null) result = caseElement(figure);
				if (result == null) result = caseContainer(figure);
				if (result == null) result = caseNode(figure);
				if (result == null) result = caseMarked(figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FIGURE_CAPTION: {
				FigureCaption figureCaption = (FigureCaption)theEObject;
				T result = caseFigureCaption(figureCaption);
				if (result == null) result = caseElement(figureCaption);
				if (result == null) result = caseContainer(figureCaption);
				if (result == null) result = caseNode(figureCaption);
				if (result == null) result = caseMarked(figureCaption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DETAILS: {
				Details details = (Details)theEObject;
				T result = caseDetails(details);
				if (result == null) result = caseElement(details);
				if (result == null) result = caseContainer(details);
				if (result == null) result = caseNode(details);
				if (result == null) result = caseMarked(details);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SUMMARY: {
				Summary summary = (Summary)theEObject;
				T result = caseSummary(summary);
				if (result == null) result = caseElement(summary);
				if (result == null) result = caseContainer(summary);
				if (result == null) result = caseNode(summary);
				if (result == null) result = caseMarked(summary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HORIZONTAL_RULE: {
				HorizontalRule horizontalRule = (HorizontalRule)theEObject;
				T result = caseHorizontalRule(horizontalRule);
				if (result == null) result = caseVoidElement(horizontalRule);
				if (result == null) result = caseElement(horizontalRule);
				if (result == null) result = caseNode(horizontalRule);
				if (result == null) result = caseMarked(horizontalRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LINE_BREAK: {
				LineBreak lineBreak = (LineBreak)theEObject;
				T result = caseLineBreak(lineBreak);
				if (result == null) result = caseVoidElement(lineBreak);
				if (result == null) result = caseElement(lineBreak);
				if (result == null) result = caseNode(lineBreak);
				if (result == null) result = caseMarked(lineBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.ANCHOR: {
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = caseElement(anchor);
				if (result == null) result = caseContainer(anchor);
				if (result == null) result = caseNode(anchor);
				if (result == null) result = caseMarked(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.STRONG: {
				Strong strong = (Strong)theEObject;
				T result = caseStrong(strong);
				if (result == null) result = caseElement(strong);
				if (result == null) result = caseContainer(strong);
				if (result == null) result = caseNode(strong);
				if (result == null) result = caseMarked(strong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.EMPHASIS: {
				Emphasis emphasis = (Emphasis)theEObject;
				T result = caseEmphasis(emphasis);
				if (result == null) result = caseElement(emphasis);
				if (result == null) result = caseContainer(emphasis);
				if (result == null) result = caseNode(emphasis);
				if (result == null) result = caseMarked(emphasis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseElement(code);
				if (result == null) result = caseContainer(code);
				if (result == null) result = caseNode(code);
				if (result == null) result = caseMarked(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseVoidElement(image);
				if (result == null) result = caseElement(image);
				if (result == null) result = caseNode(image);
				if (result == null) result = caseMarked(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.INLINE_FRAME: {
				InlineFrame inlineFrame = (InlineFrame)theEObject;
				T result = caseInlineFrame(inlineFrame);
				if (result == null) result = caseElement(inlineFrame);
				if (result == null) result = caseNode(inlineFrame);
				if (result == null) result = caseMarked(inlineFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.ITEM_LIST: {
				ItemList itemList = (ItemList)theEObject;
				T result = caseItemList(itemList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.UNORDERED_LIST: {
				UnorderedList unorderedList = (UnorderedList)theEObject;
				T result = caseUnorderedList(unorderedList);
				if (result == null) result = caseElement(unorderedList);
				if (result == null) result = caseItemList(unorderedList);
				if (result == null) result = caseNode(unorderedList);
				if (result == null) result = caseMarked(unorderedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.ORDERED_LIST: {
				OrderedList orderedList = (OrderedList)theEObject;
				T result = caseOrderedList(orderedList);
				if (result == null) result = caseElement(orderedList);
				if (result == null) result = caseItemList(orderedList);
				if (result == null) result = caseNode(orderedList);
				if (result == null) result = caseMarked(orderedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = caseElement(listItem);
				if (result == null) result = caseContainer(listItem);
				if (result == null) result = caseNode(listItem);
				if (result == null) result = caseMarked(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DESCRIPTION_LIST_ITEM: {
				DescriptionListItem descriptionListItem = (DescriptionListItem)theEObject;
				T result = caseDescriptionListItem(descriptionListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DESCRIPTION_LIST: {
				DescriptionList descriptionList = (DescriptionList)theEObject;
				T result = caseDescriptionList(descriptionList);
				if (result == null) result = caseElement(descriptionList);
				if (result == null) result = caseNode(descriptionList);
				if (result == null) result = caseMarked(descriptionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DESCRIPTION_TERM: {
				DescriptionTerm descriptionTerm = (DescriptionTerm)theEObject;
				T result = caseDescriptionTerm(descriptionTerm);
				if (result == null) result = caseElement(descriptionTerm);
				if (result == null) result = caseContainer(descriptionTerm);
				if (result == null) result = caseDescriptionListItem(descriptionTerm);
				if (result == null) result = caseNode(descriptionTerm);
				if (result == null) result = caseMarked(descriptionTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DESCRIPTION_DETAILS: {
				DescriptionDetails descriptionDetails = (DescriptionDetails)theEObject;
				T result = caseDescriptionDetails(descriptionDetails);
				if (result == null) result = caseElement(descriptionDetails);
				if (result == null) result = caseContainer(descriptionDetails);
				if (result == null) result = caseDescriptionListItem(descriptionDetails);
				if (result == null) result = caseNode(descriptionDetails);
				if (result == null) result = caseMarked(descriptionDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseElement(table);
				if (result == null) result = caseNode(table);
				if (result == null) result = caseMarked(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.CAPTION: {
				Caption caption = (Caption)theEObject;
				T result = caseCaption(caption);
				if (result == null) result = caseElement(caption);
				if (result == null) result = caseContainer(caption);
				if (result == null) result = caseNode(caption);
				if (result == null) result = caseMarked(caption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.COLUMN_GROUP: {
				ColumnGroup columnGroup = (ColumnGroup)theEObject;
				T result = caseColumnGroup(columnGroup);
				if (result == null) result = caseElement(columnGroup);
				if (result == null) result = caseNode(columnGroup);
				if (result == null) result = caseMarked(columnGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseVoidElement(column);
				if (result == null) result = caseElement(column);
				if (result == null) result = caseNode(column);
				if (result == null) result = caseMarked(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_SECTION: {
				TableSection tableSection = (TableSection)theEObject;
				T result = caseTableSection(tableSection);
				if (result == null) result = caseElement(tableSection);
				if (result == null) result = caseNode(tableSection);
				if (result == null) result = caseMarked(tableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_HEAD: {
				TableHead tableHead = (TableHead)theEObject;
				T result = caseTableHead(tableHead);
				if (result == null) result = caseTableSection(tableHead);
				if (result == null) result = caseElement(tableHead);
				if (result == null) result = caseNode(tableHead);
				if (result == null) result = caseMarked(tableHead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_BODY: {
				TableBody tableBody = (TableBody)theEObject;
				T result = caseTableBody(tableBody);
				if (result == null) result = caseTableSection(tableBody);
				if (result == null) result = caseElement(tableBody);
				if (result == null) result = caseNode(tableBody);
				if (result == null) result = caseMarked(tableBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_FOOT: {
				TableFoot tableFoot = (TableFoot)theEObject;
				T result = caseTableFoot(tableFoot);
				if (result == null) result = caseTableSection(tableFoot);
				if (result == null) result = caseElement(tableFoot);
				if (result == null) result = caseNode(tableFoot);
				if (result == null) result = caseMarked(tableFoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = caseElement(tableRow);
				if (result == null) result = caseNode(tableRow);
				if (result == null) result = caseMarked(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_CELL: {
				TableCell tableCell = (TableCell)theEObject;
				T result = caseTableCell(tableCell);
				if (result == null) result = caseElement(tableCell);
				if (result == null) result = caseContainer(tableCell);
				if (result == null) result = caseNode(tableCell);
				if (result == null) result = caseMarked(tableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseElement(form);
				if (result == null) result = caseContainer(form);
				if (result == null) result = caseNode(form);
				if (result == null) result = caseMarked(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FIELDSET: {
				Fieldset fieldset = (Fieldset)theEObject;
				T result = caseFieldset(fieldset);
				if (result == null) result = caseElement(fieldset);
				if (result == null) result = caseContainer(fieldset);
				if (result == null) result = caseNode(fieldset);
				if (result == null) result = caseMarked(fieldset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LEGEND: {
				Legend legend = (Legend)theEObject;
				T result = caseLegend(legend);
				if (result == null) result = caseElement(legend);
				if (result == null) result = caseContainer(legend);
				if (result == null) result = caseNode(legend);
				if (result == null) result = caseMarked(legend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseElement(label);
				if (result == null) result = caseContainer(label);
				if (result == null) result = caseNode(label);
				if (result == null) result = caseMarked(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseVoidElement(input);
				if (result == null) result = caseElement(input);
				if (result == null) result = caseNode(input);
				if (result == null) result = caseMarked(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseElement(button);
				if (result == null) result = caseContainer(button);
				if (result == null) result = caseNode(button);
				if (result == null) result = caseMarked(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseElement(textArea);
				if (result == null) result = caseNode(textArea);
				if (result == null) result = caseMarked(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SELECT_ITEM: {
				SelectItem selectItem = (SelectItem)theEObject;
				T result = caseSelectItem(selectItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseElement(select);
				if (result == null) result = caseNode(select);
				if (result == null) result = caseMarked(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseElement(option);
				if (result == null) result = caseSelectItem(option);
				if (result == null) result = caseNode(option);
				if (result == null) result = caseMarked(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.OPTION_GROUP: {
				OptionGroup optionGroup = (OptionGroup)theEObject;
				T result = caseOptionGroup(optionGroup);
				if (result == null) result = caseElement(optionGroup);
				if (result == null) result = caseSelectItem(optionGroup);
				if (result == null) result = caseNode(optionGroup);
				if (result == null) result = caseMarked(optionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkup(Markup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeReference(NodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidElement(VoidElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement(GenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Void Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Void Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericVoidElement(GenericVoidElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHead(Head object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stylesheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stylesheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStylesheet(Stylesheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportMap(ImportMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Map Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Map Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportMapScope(ImportMapScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpan(Span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeading(Heading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooter(Footer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMain(Main object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNav(Nav object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aside</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aside</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAside(Aside object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockquote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockquote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockquote(Blockquote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePre(Pre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Caption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Caption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureCaption(FigureCaption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetails(Details object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummary(Summary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalRule(HorizontalRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreak(LineBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrong(Strong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasis(Emphasis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineFrame(InlineFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemList(ItemList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedList(UnorderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedList(OrderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionListItem(DescriptionListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionList(DescriptionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionTerm(DescriptionTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionDetails(DescriptionDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaption(Caption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnGroup(ColumnGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableSection(TableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHead(TableHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBody(TableBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableFoot(TableFoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCell(TableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fieldset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fieldset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldset(Fieldset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegend(Legend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectItem(SelectItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionGroup(OptionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HtmlSwitch
