/*
Your task is to build a high-score component of the classic Frogger game, one 
of the highest selling and most addictive games of all time, and a classic of 
the arcade era. Your task is to write methods that return the highest score 
from the list, the last added score and the three highest scores.
*/

class Scores {
    ArrayList<Integer> numArr = []

    Scores(ArrayList<Integer> numArr) {
        this.numArr = numArr
    }

    int highest() {
        this.numArr.max()
    }

    int last() {
        this.numArr[-1]
    }

    String threeHighest() {
        numArr.sort().reverse().take(3).join(", ")
    }
}

ArrayList<Integer> numArr = [89 ,66, 88, 45, 34]
def s = new Scores(numArr)
println "Highest: ${s.highest()}"
println "Last: ${s.last()}"
println "Highest Three: ${s.threeHighest()}"