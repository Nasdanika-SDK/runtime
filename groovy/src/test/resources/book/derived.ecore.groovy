// tag::derived[]
import org.eclipse.emf.ecore.EClass

def library = loadResource 'library.ecore.groovy'               // <1>
def classes = []
library.allContents.forEachRemaining {                         // <2>
    if (it instanceof EClass && !it.isAbstract()) {
        classes << it
    }
}

ePackage {
    name 'dto'
    nsURI 'urn:example:dto'
    nsPrefix 'dto'

    for (EClass source in classes) {                            // <3>
        eClass {
            name source.name + 'Dto'
            for (attribute in source.getEAllAttributes()) {
                eAttribute {
                    name attribute.name
                    eType attribute.getEType()                  // <4>
                }
            }
        }
    }
}
// end::derived[]
