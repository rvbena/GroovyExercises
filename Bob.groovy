/* 
Bob is a lackadaisical teenager. In conversation, his responses are very limited.
Bob answers 'Sure.' if you ask him a question, such as "How are you?".
He answers 'Whoa, chill out!' if you YELL AT HIM (in all capitals).
He answers 'Calm down, I know what I'm doing!' if you yell a question at him.
He says 'Fine. Be that way!' if you address him without actually saying anything.
He answers 'Whatever.' to anything else.
Bob's conversational partner is a purist when it comes to written communication and always follows normal rules regarding sentence punctuation in English. 
*/

@Grab( 'commons-lang:commons-lang:2.6' )
import org.apache.commons.lang.StringUtils

print "Say something to Bob: "
String msg = System.in.newReader().readLine().replaceAll("[^a-zA-Z0-9? -]", "")

if (msg.equalsIgnoreCase('Bob')) {
    println "Fine. Be that way!"
}

else if (msg.endsWith('?')) {
    msg = msg.replaceAll('\\?', '')
    
    if (StringUtils.isAllUpperCase(msg)) 
        println "Calm down, I know what I'm doing!"
    else
        println "Sure."
}

else if (StringUtils.isAllUpperCase(msg)) {
    println "Whoa, chill out!"
}

else {
    println "Whatever."
}
