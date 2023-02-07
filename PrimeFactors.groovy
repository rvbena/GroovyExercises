class Prime {
    int divisor = 2
    def factors = []

    String getFactors(int num) {
        while (num > 1) {
            while (num % divisor == 0) {
                factors << divisor
                num /= divisor
            }

            divisor++
        }

        factors.join(", ")
    }
}

int num = 60

def p = new Prime()
println p.getFactors(num)