/*
* Detect saddle points in a matrix.
* It's called a "saddle point" because it is greater than or equal to every 
* element in its row and less than or equal to every element in its column.
* A matrix may have zero or more saddle points.
* Your code should be able to provide the (possibly empty) list of all the 
* saddle points for any given matrix.
*/

class Saddle {
    private final int[][] matrix
    ArrayList<Integer> maxList = []
    ArrayList<Integer> minList = []
    ArrayList<Integer> saddle = []

    Saddle(String m) {
        this.matrix = m.split('\n')
                       .collect { a -> a.split(' ')
                       .collect { b -> b as int } }
    }

    ArrayList<Integer> getMax() {
        this.maxList = matrix.collect { it.max() }
    }

    ArrayList<Integer> getMin() {
        this.minList = matrix.transpose().collect { it.min() }
    }

    ArrayList<Integer> getSaddlePoints() {
        int rowIndex = this.maxList.findIndexOf { x -> x in minList }
        int colIndex = this.minList.findIndexOf  {y -> y in maxList }

        saddle << rowIndex 
               << colIndex 
               << this.matrix[rowIndex][colIndex]
    }
}

String matrix = "9 8 7\n5 3 2\n6 6 7"
def s = new Saddle(matrix)
println s.getMax()
println s.getMin()
def saddle = s.getSaddlePoints()
println "Saddle Point Located at Row ${saddle[0]+1}, Column ${saddle[1]+1}, with value ${saddle[2]}"