// Given a phrase, count the occurrences of each word in that phrase.

int count = 0
def removeDup = []
def wordCount = []
def phrase = "That's the password: PASSWORD 123!, cried the Special Agent. So I fled."
phrase = phrase.toLowerCase().replaceAll("[^\\w' ]*", "").split(" ") 

for (element : phrase) {
    if (!removeDup.contains(element))
        removeDup << element
}

for (int x = 0; x < removeDup.size(); x++) {
    count = 0

    for (int y = 0; y < phrase.size(); y++) {
        if (removeDup[x].equals(phrase[y]))
            count += 1
    }

    wordCount << count
}

println "**WORD COUNT**"

for (int x = 0; x < removeDup.size(); x++) {
    println "${removeDup[x]}: ${wordCount[x]}"
}