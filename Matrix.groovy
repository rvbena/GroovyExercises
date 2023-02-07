class Matrix {
    private final int[][] matrix

    Matrix(String str) {
        this.matrix = str.split('\n')
                         .collect { a -> a.split(' ')
                         .collect { b -> b as int } }
    }

    int[] rows(int rowNum) {
        matrix[rowNum]
    }

    int[] columns(int colNum) {
        matrix.collect { row ->
            row[colNum]
        }
    }

    int size() {
        matrix.size()
    }
}

String matrix = "9 8 7\n5 3 2\n6 6 7"
def m = new Matrix(matrix)

println "Rows"
for (int x = 0; x < m.size(); x++) {
    println m.rows(x)
}

println "\nColumns"
for (int x = 0; x < m.size(); x++) {
    println m.columns(x)
}