library {
    name 'Reading Group'

    def evans = author { name 'Eric Evans' }         // <1>
    def fowler = author { name 'Martin Fowler' }

    book {                                            // <2>
        name 'Domain-Driven Design'                   // <3>
        year 2003                                     // <4>
        genre 'TECHNOLOGY'
        authors evans                                 // <5>
        cites "../books[name='Patterns of Enterprise Application Architecture']" // <6>
        documentation '''
            Named the *Ubiquitous Language* and the *Published Language*.
            '''                                       // <7>
    }

    book {
        name 'Patterns of Enterprise Application Architecture'
        year 2002
        genre 'TECHNOLOGY'
        authors fowler
    }
}
