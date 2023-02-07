/*
Given a string containing brackets [], braces {}, parentheses (), or any 
combination thereof, verify that any and all pairs are matched and nested 
correctly.
*/

String str = "[1]{}}[45]"
def stack = []

Map match = [
    '[': ']',
    '{': '}',
    '(': ')'
]

for (ch in str) {
    if (match.containsKey(ch))
        stack.push(ch)

    else if (ch in match.values()) {
        if (stack) 
            stack.pop()
        
        else
            stack.push(ch)
    }
}

String check = stack.each { match.containsKey(it) } ? "Incorrectly paired" 
                                                     : "Correctly paired"
println check