int num = 20
int mult1 = 3
int mult2 = 5
int total_mult = 0

println "Multiples: "

for (int x = 1; x < num; x++) {
    if (x % 3 == 0 || x % 5 == 0) {
        print "$x "
        total_mult += x
    }
}

println "Sum of these multiples: $total_mult"