/*
Given a person's allergy score, determine whether or not they're 
allergic to a given item, and their full list of allergies.
*/

class Allergy {
    Integer allergyScore
    String[] allergyList

    Map<String, Integer> allergens = [
        eggs: 1,
        peanuts: 2,
        shellfish: 4,
        strawberries: 8,
        tomatoes: 16,
        chocolate: 32,
        pollen: 64,
        cats: 128
    ]

    Allergy (int score) {
        this.allergyScore = score
    }

    String[] list() {
        allergyList = allergens.findAll { it.value & allergyScore }
                               .collect { it.key }
    }

    boolean allergicTo(String substance) {
        substance in allergyList
    }
}

Allergy a = new Allergy(120)
println a.allergicTo('eggs')
println a.list()