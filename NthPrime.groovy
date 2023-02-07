// Given a number n, determine what the nth prime is.

class Nth {
    int NthPrime(int n) {
        int candidate = 3
        int maxFactor = 0
        boolean isPrime = false
        def primeList = [2]

        while (primeList.size() < n) {
            maxFactor = Math.sqrt(candidate)
            isPrime = true

            println maxFactor

            for (p in primeList) {
                if (p > maxFactor) {
                    break
                }

                else if (candidate % p == 0) {
                    isPrime = false
                    break
                }
            }

            if (isPrime)
                primeList << candidate

            candidate += 2
        }

        return primeList[-1]
    }
}


print "Enter a number to determine the nth prime: "
int num = System.in.newReader().readLine() as Integer

println "NTH PRIME: ${NthPrime(num)}"
