class Cipher {
    private int key
    String plain = 'abcdefghijklmnopqrstuvwxyz'
    ArrayList<Character> characters = []
    String word

    Cipher(int key, String word) {
        this.key = key
        this.word = word
        this.characters = word.toLowerCase().chars
    }

    String rotate() {
        String cipher = plain.substring(this.key) + plain.substring(0, this.key)
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
}

String word = "Gur dhvpx oebja sbk whzcf bire gur ynml qbt."
int key = 13
def c = new Cipher(key, word)
println c.rotate()