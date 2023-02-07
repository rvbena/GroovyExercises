/*
00001 = wink
00010 = double blink
00100 = close your eyes
01000 = jump

10000 = Reverse the order of the operations in the secret handshake.

Given a decimal number, convert it to the appropriate sequence of events
for a secret handshake.
*/

class Handshake {
    String event
    Integer Reverse
    Map command = [
        "wink": 1,
        "double blink": 2,
        "close your eyes": 4,
        "jump": 8
    ]

    Handshake(int e) {
        this.event = e
        println event
    }

    String[] sequence() {
        command.findAll { it.value & (this.event as Integer) }
               .collect { it.key }
    }
}

def h = new Handshake(19)
println h.sequence()