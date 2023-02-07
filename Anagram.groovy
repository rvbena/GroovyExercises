/*
* Given a target word and a set of candidate words, this exercise requests the 
* anagram set: the subset of the candidates that are anagrams of the target.
*/

class Anagram {
    ArrayList<String> getAnagram(String target, ArrayList<String> candidates) {
        String targetSorted = target.toLowerCase().split('').sort().join("")
        ArrayList<String> subset = []
        ArrayList<String> sorted = candidates.collect {
            it.toLowerCase().split('').sort().join("")
        }


        for (int x = 0; x < candidates.size(); x++) {
            if (target == candidates[x])
                continue
                
            else {
                if (targetSorted == sorted[x])
                    subset << candidates[x]
            }
        }

        subset
    }
}

String target = "stone"
ArrayList<String>  candidates = ["stone", "tones", "banana", "tons", "alpha", "notes", "Seton"]

def a = new Anagram()
println (a.getAnagram(target, candidates))
