ePackage {
    name 'broken'

    eClass {
        name 'Loan'
        eReference {
            name 'book'
            eType "/eClassifiers[name='Book']"
        }
    }
}
