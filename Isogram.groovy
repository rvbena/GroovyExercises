/* 
Determine if a word or phrase is an isogram.
An isogram (also known as a "non-pattern word") is a word or phrase without a 
repeating letter, however spaces and hyphens are allowed to appear multiple times.
*/

@Grab( 'commons-lang:commons-lang:2.6' )
import org.apache.commons.lang.StringUtils

print "Enter a word: "
def word = System.in.newReader().readLine().replaceAll("[^\\w ]*", "").split(" ") 
def getDistinct = word.toUnique()

String checker = getDistinct.size() < word.size() ? "ISOGRAM" : "NOT ISOGRAM"
println checker