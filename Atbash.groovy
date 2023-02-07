// Create an implementation of the atbash cipher, an ancient encryption system created in the Middle East.

static String encode(String word, char[] characters) {
    def plain = "abcdefghijklmnopqrstuvwxyz"
    def cipher = plain.reverse()
    
    String newWord = ""
    int index = 0

    for (int x = 0; x < word.size(); x++) {
        if (characters[x].isLetter()) {
            index = plain.findIndexOf{ element -> element == characters[x] }
            newWord += cipher[index]
        }

        else
            newWord += characters[x]
    }

    return newWord
}

String word = "gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt".toLowerCase()
char[] characters = word.chars

println encode(word, characters)