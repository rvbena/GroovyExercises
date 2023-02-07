/*
* Given a target word and a set of candidate words, this exercise requests the 
* anagram set: the subset of the candidates that are anagrams of the target.
*/

class Ana {
    ArrayList<String> getAnagram(String target, ArrayList<String> candidates) {
        ArrayList<String> subset = []

        for (element in candidates) {
            if (target.equalsIgnoreCase(element) || target.length() != element.length())
                continue

            else
                subset << element
        }

        subset
    }
}

String target = "stone"
ArrayList<String> candidates = ["stone", "tones", "banana",
                                "tons", "notes", "Seton"]

def a = new Ana()
println (a.getAnagram(target, candidates))