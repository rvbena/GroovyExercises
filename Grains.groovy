// Calculate the number of grains of wheat on a chessboard given that the number on each square doubles.

int squares = 64
int grainsPerSquare = 0
int totalGrains = 0
int ctr = 1

(1..squares).each{
    grainsPerSquare = it*it
    totalGrains += grainsPerSquare
    println "Square $ctr\t$grainsPerSquare"
    ctr++
    
}

println "Total number of grains: $totalGrains"