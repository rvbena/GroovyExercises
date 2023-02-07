/*
Implement the keep and discard operation on collections. Given a collection and 
a predicate on the collection's elements, keep returns a new collection containing 
those elements where the predicate is true, while discard returns a new collection 
containing those elements where the predicate is false.
*/

class Strain {
    Collection keep(Collection numbers, Closure predicate) {
        return numbers.findAll{ n -> predicate(n) } as Collection
    }

    Collection discard(Collection numbers, Closure predicate) {
        return numbers.findAll{ n -> !predicate(n) } as Collection
    }
}

Collection numArr = 1..10 as ArrayList
def predicate = { it % 2 == 0 }

def s = new Strain()
println s.keep(numArr, predicate)
println s.discard(numArr, predicate)