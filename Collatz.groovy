print "Enter number: "
int num = System.in.newReader().readLine() as Integer
int new_num = num
int ctr = 0

println "${ctr+1}. $new_num"

while (new_num != 1) {
    if (new_num % 2 == 0)
        new_num /= 2

    else
        new_num = 3 * new_num + 1

    println "${ctr+2}. $new_num"
    ctr++
}

println "\nIt took $ctr steps to reach 1."