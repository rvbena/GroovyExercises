class Pan {
    char[] word
    char[] alpha = "a".."z" as ArrayList

    Pan (String word) {
        this.word = word.toLowerCase().replaceAll("[^a-z]", "")
    }

    boolean isPangram() {
        alpha.every { word.contains(it) }
    }
}

def p = new Pan("The quick brown fox jumps over the lazy dog.")
println "PANGRAM? ${p.isPangram()}"