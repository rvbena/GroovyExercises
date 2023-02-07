// Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

int squareSum = 0
int sumOfSquares = 0

(1..10).each{
    squareSum += it
    sumOfSquares += it**2
}

squareSum = squareSum**2

println "Square of the sum of the first 10 natural numbers: $squareSum"
println "Sum of the squares of the first 10 natural numbers: $sumOfSquares"
println "Difference: ${squareSum-sumOfSquares}"