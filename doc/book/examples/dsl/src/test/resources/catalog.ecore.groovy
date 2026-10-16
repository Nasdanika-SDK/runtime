ePackage {
    name 'catalog'
    nsURI 'https://example.org/catalog'
    nsPrefix 'catalog'

    def entry = eClass {                                            // <1>
        name 'Entry'
        eAttribute { name 'title'; eType 'EString'; lowerBound 1 }  // <2>
    }

    eClass {
        name 'Catalog'
        eStructuralFeatures('EReference') {                         // <3>
            name 'entries'
            eType entry
            containment true
            upperBound = -1                                         // <4>
        }
    }
}
