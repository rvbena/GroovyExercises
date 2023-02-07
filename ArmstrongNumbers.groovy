/*
An Armstrong number is a number that is the sum of its own digits each raised 
to the power of the number of digits.

Write some code to determine whether a number is an Armstrong number.
*/

class Armstrong {
    boolean isArmstrong(int num) {
        int size = num.toString().size()

        num.toString().collect { 
            (it as Integer) ** size 
        }.sum() == num
    }
}

int num = 9
def a = new Armstrong()
println "Is $num an armstrong number? ${a.isArmstrong(num)}"