// tag::copy[]
ePackage {
    name 'branch'
    nsURI 'urn:example:branch'
    nsPrefix 'branch'

    copy('library.ecore.groovy#//Library') {   // <1>
        name 'Branch'                           // <2>
        eAttribute { name 'address'; eType 'EString' }
    }
}
// end::copy[]
