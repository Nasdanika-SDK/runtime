// tag::journal[]
ePackage {
    name 'journal'
    nsURI 'urn:example:journal'
    nsPrefix 'journal'

    eClass { name 'Entry' }
}

onSave { source, outputStream, options ->                       // <1>
    outputStream.write(source.getBytes('UTF-8'))                // <2>
    int classes = dsl.roots[0].getEClassifiers().size()
    outputStream.write("// Saved with ${classes} class\n".getBytes('UTF-8'))  // <3>
}
// end::journal[]
