/* 
In this exercise you are going to create a helpful program so that you don't have to remember the values of the bands.
These colors are encoded as follows:
Black: 0
Brown: 1
Red: 2
Orange: 3
Yellow: 4
Green: 5
Blue: 6
Violet: 7
Grey: 8
White: 9
*/

def colorBands = [
    black: 0,
    brown: 1,
    red: 2,
    orange: 3,
    yellow: 4,
    green: 5,
    blue: 6,
    violet: 7,
    grey: 8,
    white: 9
]

print "Enter color: "
String color = System.in.newReader().readLine().toLowerCase()

if (!colorBands.containsKey(color))
    println "No numerical value associated with the color band."

else {
    println "Numerical Value of $color: ${colorBands[color]}"
}