// tag::rules[]
ePackage {
    name 'rules'
    nsURI 'urn:example:rules'
    nsPrefix 'rules'

    eClass {
        name 'RuleSet'
        eAttribute { name 'name'; eType 'EString' }
        eReference {
            name 'rules'
            eType "../../eClassifiers[name='Rule']"
            containment true
            upperBound = -1
        }
    }

    eClass {
        name 'Rule'
        eAttribute { name 'name'; eType 'EString' }
        eReference {
            name 'evaluator'
            eType "../../eClassifiers[name='Evaluator']"   // <1>
            containment true
        }
    }

    def evaluator = eClass {
        name 'Evaluator'
        'abstract'(true)
        eAttribute { name 'documentation'; eType 'EString' }
    }

    eClass {
        name 'SpelEvaluator'                               // <2>
        eSuperTypes evaluator
        eAttribute { name 'expression'; eType 'EString' }
    }

    eClass {
        name 'GroovyEvaluator'
        eSuperTypes evaluator
        eAttribute { name 'script'; eType 'EString' }
    }
}
// end::rules[]
