/* Given a string of digits, output all the contiguous 
substrings of length n in that string in the order that 
they appear.
*/

class Substring {
    String slice(String digit, int length) {
        digit.split("").collate(length,1,false).join(', ')
    }
}


String digit = 49142
int length = 3

def s = new Substring()
println s.slice(digit, length)