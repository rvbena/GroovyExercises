// Calculate the Hamming Distance between two DNA strands.

// String str1 = "GAGCCTACTAACGGGAT"
// String str2 = "CATCGTAATGACGGCCT"

String str1, str2
int distance = 0
int ctr = 0

print "Enter DNA Strand #1: "
str1 = System.in.newReader().readLine()

// To make sure that both strings have the same length
while (true) {
    print "Enter DNA Strand #2: "
    str2 = System.in.newReader().readLine()

    if (str2.length() != str1.length())
        println "Should be the same length as String 1 (length: ${str1.length()})"
    
    else
        break
}

for (chara in str1) {
    if (chara != str2[ctr]) {
        distance += 1
    }

    ctr++ 
}

println "The Hamming Distance is $distance"