// Transform the legacy data format to the shiny new format.

class Migrate {
    Map<String, String> transform(Map<String, Collection<String>> oldSystem) {
        oldSystem.collectEntries { key, value -> 
            value.collectEntries { [(it.toLowerCase()), key] }
        }.sort()
    }
}

Map<Integer, String> oldSystem = [
    // key, value
    "1 point": ["A", "E", "I", "O", "U", "L", "N", "R", "S", "T"],
    "2 points": ["D", "G"],
    "3 points": ["B", "C", "M", "P"],
    "4 points": ["F", "H", "V", "W", "Y"],
    "5 points": ["K"],
    "8 points": ["J", "X"],
    "10 points": ["Q", "Z"]
]

def m = new Migrate()
def newSystem = m.transform(oldSystem)

newSystem.each { k, v -> println "$k: $v" }