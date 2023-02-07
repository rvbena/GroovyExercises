/*
Implement the accumulate operation, which, given a collection and an operation to 
perform on each element of the collection, returns a new collection containing 
the result of applying that operation to each element of the input collection.
*/

class Acc {
    int[] num
    ArrayList<Integer> accumulate = []

    Acc(int[] num) {
        this.num = num
    }

    int[] operation() {
        for (x in num) {
            accumulate << x*x
        }

        return accumulate
    }
}

int[] num = [1, 2, 3, 4, 5]
def a = new Acc(num)
println a.operation()