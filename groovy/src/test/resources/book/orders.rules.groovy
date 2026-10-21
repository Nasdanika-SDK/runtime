// tag::orders[]
ruleSet {                                              // <1>
    name 'orders'

    rule {
        name 'positive-total'
        evaluator 'order.total > 0'                    // <2>
    }

    rule {
        name 'in-window'
        evaluator('order.date > start') {              // <3>
            documentation 'Orders inside the promotion window'
        }
    }

    rule {
        name 'priced'
        evaluator { expression 'order.items.?[price == null].isEmpty()' } // <4>
    }

    rule {
        name 'scripted'
        evaluator('GroovyEvaluator') {                 // <5>
            script 'order.items.every { it.quantity > 0 }'
        }
    }
}
// end::orders[]
