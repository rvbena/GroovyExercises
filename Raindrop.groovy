print "Enter number: "
int num = System.in.newReader().readLine() as Integer
String raindrop = ""

if (num % 3 == 0)
    raindrop += "Pling"

if (num % 5 == 0)
    raindrop += "Plang"
        
if (num % 7 == 0)
    raindrop  += "Plong"

if (!(num % 3 == 0) && !(num % 5 == 0) && !(num % 7 == 0))
    raindrop += num

println raindrop