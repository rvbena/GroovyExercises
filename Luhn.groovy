/*
Given a number determine whether or not it is valid per the Luhn formula.

Strings of length 1 or less are not valid. Spaces are allowed in the input, 
but they should be stripped before checking. All other non-digit characters 
are disallowed.

The first step of the Luhn algorithm is to double every second digit, 
starting from the right.

If doubling the number results in a number greater than 9 
then subtract 9 from the product.

Then sum all of the digits.
*/

class LuhnFormula {
    String creditCard

    LuhnFormula(String card) {
        this.creditCard = card.replaceAll(" ", "")
    }

    boolean format() {
        this.creditCard.every { it.matches("[0-9]") } 
            && this.creditCard.length() > 1
    }

    boolean valid() {
        if (!format()) return false
        this.creditCard.collect { it as Integer }
                       .reverse()
                       .withIndex()
                       .collect { val, index -> (index % 2 ? 2 : 1) * val }
                       .collect { it > 9? it - 9: it }
                       .sum() % 10 == 0
    }
}

// print "Enter a credit card number: "
// String creditCard = System.in.newReader().readLine()
def luhn = new LuhnFormula('4539 3195 0343 6867')
String check = luhn.valid() ? "VALID" : "INVALID"
println check