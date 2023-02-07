/* 
Given a word, compute the Scrabble score for that word.
Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
*/

score = 0

print "Enter a word: "
String word = System.in.newReader().readLine().toUpperCase()

for (x in word) {
    switch (x) {
        case ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T']:
            score += 1
            break

        case ['D', 'G']:
            score += 2
            break

        case ['B', 'C', 'M', 'P']:
            score += 3
            break

        case ['F', 'H', 'V', 'W', 'Y']:
            score += 4
            break

        case 'K':
            score += 5
            break

        case ['J', 'X']:
            score += 8
            break

        case ['Q', 'Z']:
            score += 10
            break
    }
}

println "Scrabble Score is $score"
