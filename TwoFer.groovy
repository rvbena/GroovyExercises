/* 
Given a name, return a string with the message: 
One for name, one for me.
Where "name" is the given name.
However, if the name is missing, return the string:
One for you, one for me.
*/

print "Enter name: "
String name = System.in.newReader().readLine()

if (name)
    println "One for $name, one for me."

else
    println "One for you, one for me."