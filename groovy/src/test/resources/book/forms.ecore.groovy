// tag::forms[]
ePackage {
    name 'forms'

    eClass {
        name 'Shelf'
        eAttribute { name 'assigned'; eType 'EString'; upperBound = -1 }  // Sets -1
        eAttribute { name 'called'; eType 'EString'; upperBound(-1) }     // Sets -1
        eAttribute { name 'subtracted'; eType 'EString'; upperBound -1 }  // Sets nothing
    }
}
// end::forms[]
