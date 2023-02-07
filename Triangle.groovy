/*
Determine if a triangle is equilateral, isosceles, or scalene.

An equilateral triangle has all three sides the same length.

An isosceles triangle has at least two sides the same length. (It is sometimes 
specified as having exactly two sides the same length, but for the purposes of this 
exercise we'll say at least two.)

A scalene triangle has all sides of different lengths.

For a shape to be a triangle at all, all sides have to be of length > 0, and the 
sum of the lengths of any two sides must be greater than or equal to the length of the 
third side.

*/

// float length_a = 0, length_b = 0, length_c = 0
float length_a = 3
float length_b = 1
float length_c = 2
boolean is_num_positive = ((length_a & length_b & length_c) > 0)
boolean sum_a =  length_a + length_b >= length_c
boolean sum_b = length_a + length_c >= length_b
boolean sum_c = length_b + length_c >= length_a
boolean is_sum_greater = sum_a || sum_b || sum_c

// print "Enter length 1: "
// length_a = System.in.newReader().readLine() as Float

// print "Enter length 2: "
// length_b = System.in.newReader().readLine() as Float

// print "Enter length 3: "
// length_c = System.in.newReader().readLine() as Float

if (is_num_positive && is_sum_greater) {
    if ((length_a == length_b) && (length_a == length_c) && (length_b == length_c))
        println "Equilateral Triangle"

    else if ((length_a == length_b) || (length_a == length_c) || (length_b == length_c))
        println "Isosceles Triangle"

    else
        println "Scalene Triangle"
}

else
    println "Not a triangle."