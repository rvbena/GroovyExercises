/* Determine if a number is perfect, abundant, or deficient based on 
Nicomachus' (60 - 120 CE) classification scheme for positive integers.
*/

int num = 28
def factors = []
int total_num = 0

for (int x = 1; x < num; x++) {
    if (num % x == 0) {
        factors << x
        total_num += x
    }
}

println "$factors = $total_num"

if (total_num == num)
    println "Perfect Number"

else if (total_num > num)
    println "Abundant Number"

else
    println "Deficient Number"