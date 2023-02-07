/*
Given a list of inputs, generate the relevant proverb. For example, given the list 
["nail", "shoe", "horse", "rider", "message", "battle", "kingdom"], you will output the 
full text of this proverbial rhyme:

For want of a nail the shoe was lost.
For want of a shoe the horse was lost.
For want of a horse the rider was lost.
For want of a rider the message was lost.
For want of a message the battle was lost.
For want of a battle the kingdom was lost.
And all for the want of a nail.
*/

def proverb = ["nail", "shoe", "horse", "rider", "message", "battle", "kingdom"]
ctr = 0

while (ctr < proverb.size()-1) {
    println "For want of a ${proverb[ctr]}, the ${proverb[ctr+1]} was lost."
    ctr++
}

println "And all for the want of a nail."