/*
In this exercise, you are going to create a helpful program so that you don't 
have to remember the values of the bands. The program will take 3 colors as 
input, and outputs the correct value, in ohms.
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
        int colorValue = this.color.take(2).collect { this.colorBands[it] }.join() as Integer
        String zeros = '0'.multiply(this.colorBands[this.color[2]])
        int ohms = "${colorValue}${zeros}" as Integer

        ohms > 1_000 ? "${ohms/1000} kiloohms" 
                     : "${colorValue} ohms"
    }
}

def rs = new ResistorColor('orange-orange-orange')
println rs.value()