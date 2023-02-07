/* 
Given a string representing a DNA sequence, count how many of each 
nucleotide is present. If the string contains characters that aren't 
A, C, G, or T then it is invalid and you should signal an error.
*/
class Nucleotide {
    String strand
    Map<String, Integer> nucleotideCount = [
        A: 0,
        C: 0, 
        G: 0, 
        T: 0
    ]

    Nucleotide(String strand) {
        this.strand = strand.toUpperCase().chars
    }

    String count() {
        if (this.strand.every { nucleotideCount.containsKey(it) }) {
            strand.each { nucleotideCount[it] += 1 }
            nucleotideCount
        }

        else {
            "ERROR!"
        }
    }
}

print "Enter a DNA sequence: "
String strand = System.in.newReader().readLine()

def n = new Nucleotide(strand)
println n.count()