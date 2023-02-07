/*
In this exercise you are going to create a helpful program so that you don't have to remember the values 
of the bands. The program will take color names as input and output a two digit number, even if the input is 
more than two colors!

The band colors are encoded as follows:

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
From the example above: brown-green should return 15 brown-green-violet should return 15 too, ignoring the third color.
*/

class ResistorColor {
    Map<String, Integer> colorBands = [
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

    String[] color

    ResistorColor(String color) {
        this.color = color.toLowerCase().split("-")
    }

    String value() {
        color.take(2).collect { colorBands[it] }.join()
    }
}

// print "Enter a set of color (separated by -): "
// String color = System.in.newReader().readLine()
def rs = new ResistorColor('white-red-orange')
println rs.value()

// white-red