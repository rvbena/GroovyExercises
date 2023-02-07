// Convert a number, represented as a sequence of digits in one base, to any other base.

class Base {
    String numConvert
    int base
    ArrayList<String> baseConvert = []
    ArrayList<Integer> numArr = []

    Base (int num, int base) {
        this.numConvert = num
        this.base = base
    }

    String convert() {
        for (ch in numConvert) {
            numArr << ch
        }

        int ctr = numArr.size() - 1

        for (element in numArr) {
            baseConvert << "($element * $base^$ctr)"
            ctr--
        }

        return baseConvert.join(" + ")
    }
}

// print "Enter a number: "
// int num = System.in.newReader().readLine() as Integer

// print "Enter base: "
// int base = System.in.newReader().readLine() as Integer

int num = 1011010
int base = 2

def b = new Base(num, base)
println b.convert()