// Convert a phrase to its acronym.

class Acr {
    String phrase

    Acr (String phrase) {
        this.phrase = phrase
    }

    String abbreviate() {
        phrase.replaceAll("[-]", " ")
              .split(" ")
              .collect {it[0].toUpperCase()}
              .join()
    }   
}

// print "Enter phrase: "
// def phrase = System.in.newReader().readLine()
String phrase = "Away-From-Keyboard"
def a = new Acr(phrase)
println "Acronym: ${a.abbreviate()}"