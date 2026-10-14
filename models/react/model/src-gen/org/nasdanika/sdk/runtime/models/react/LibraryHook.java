/**
 */
package org.nasdanika.sdk.runtime.models.react;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * More feature rules of library components, value objects, hooks and value blocks:
 * - Many-valued containments of value objects without a key are arrays.
 * - Containments of code blocks are expressions, e.g. a typed event handler.
 * - Non-containment references to declarations render the local name of the declaration,
 *   which is imported if it is in another module, e.g. nodeTypes={nodeTypes}. Other
 *   non-containment references need a ref annotation - the name of the attribute of the
 *   target to render, e.g. ref="id" for source="a".
 * - enum and module on an enum attribute: the value is a member of an exported TypeScript
 *   enum named by the enum literal name, e.g. position={Position.Top}. The enum is imported.
 * - required="true": an unset feature renders as an empty array or undefined.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getLibraryHook()
 * @model abstract="true"
 * @generated
 */
public interface LibraryHook extends Hook {
} // LibraryHook
