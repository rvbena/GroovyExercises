String rna = ""

print "Give a DNA Strand: "
String dna = System.in.newReader().readLine().toUpperCase()
for (x in dna) {
    switch(x) {
        case 'G':
            rna += 'C'
            break
        case 'C':
            rna += 'G'
            break
        case 'T':
            rna += 'A'
            break
        case 'A':
            rna += 'U'
            break   
    }
}

println "RNA Complement: $rna"