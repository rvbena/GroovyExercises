/*
Given a string the program should check if the provided string is a valid ISBN-10. 
Putting this into place requires some thinking about preprocessing/parsing of the 
string prior to calculating the check digit for the ISBN.

The program should be able to verify ISBN-10 both with and without separating dashes.
*/

def isbn = "3-598-21507-X".replaceAll("-", "")
final int LIMIT = 10
int total = 0
int ctr = 0

for (int x = LIMIT; x > 0; x--) {
    if (isbn[ctr] == "X")
        total += 10
    
    else
        total += (isbn[ctr] as Integer) * x

    ctr++
}

if (total % 11 == 0)
    println "Valid ISBN"

else
    println "Invalid ISBN"