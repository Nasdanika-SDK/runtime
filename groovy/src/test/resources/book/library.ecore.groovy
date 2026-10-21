// tag::package[]
ePackage {                                          // <1>
    name 'library'                                  // <2>
    nsURI 'urn:example:library'
    nsPrefix 'library'
    global 'urn:example:library'                    // <3>

    def namedElement = eClass {                     // <4>
        name 'NamedElement'
        'abstract'(true)                            // <5>
        eAttribute { name 'name'; eType 'EString' }
    }
    // end::package[]

    // tag::classes[]
    eClass {
        name 'Library'
        eSuperTypes namedElement                    // <1>

        eReference {
            name 'books'
            eType "/eClassifiers[name='Book']"     // <2>
            containment true
            upperBound = -1                         // <3>
        }

        eReference {
            name 'authors'
            eType { eContainer().eContainer().getEClassifier('Author') } // <4>
            containment true
            upperBound(-1)
        }
    }

    eClass {
        name 'Book'
        eAttribute { name 'title'; eType 'EString' }
        eAttribute { name 'year'; eType 'EInt' }

        eReference {
            name 'authors'
            eType "../../eClassifiers[name='Author']"  // <5>
            upperBound = -1
            eOpposite "../../eClassifiers[name='Author']/eStructuralFeatures[name='books']"
        }
    }

    eClass {
        name 'Author'
        eSuperTypes namedElement

        eReference {
            name 'books'
            eType "../../eClassifiers[name='Book']"
            upperBound = -1
            eOpposite "../../eClassifiers[name='Book']/eStructuralFeatures[name='authors']"
        }
    }
    // end::classes[]
}
