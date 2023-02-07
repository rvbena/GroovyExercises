// Translate RNA sequences into proteins.

print "Enter RNA Sequence: "
def codon = System.in.newReader().readLine().toUpperCase().split("(?<=\\G.{3})")
// def codon = "AUGUUUUCUUAAAUG".split("(?<=\\G.{" + 3 + "})")
String translation = ""

for (c in codon) {
    if (translation.contains("STOP")) {
        translation = translation.replace("STOP", "")
        break
    }

    switch(c) {
        case "AUG":
            translation += "Methionine "
            break
            
        case ["UUU", "UUC"]:
            translation += "Phenylalanine "
            break

        case ["UUA", "UUG"]:
            translation += "Leucine "
            break

        case ["UCU", "UCC", "UCA", "UCG"]:
            translation += "Serine "
            break

        case ["UAU", "UAC"]:
            translation += "Tyrosine "
            break

        case ["UGU", "UGC"]:
            translation += "Cysteine "
            break 

        case "UGG":
            translation += "Tryptophan "
            break

        case ["UAA", "UAG", "UGA"]:
            translation += "STOP"
            break
    }
}

println "Codons: ${codon}\nProtein: $translation"