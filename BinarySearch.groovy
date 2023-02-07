// Implement a binary search algorithm.
// Otherwise, if the search key is less than the middle element's key, then 
// the algorithm repeats its action on the sub-array to the left of the middle 
// element or, if the search key is greater, on the sub-array to the right.

// If the remaining array to be searched is empty, then the key cannot be found 
// in the array and a special "not found" indication is returned.

class Binary {
    ArrayList<Integer> numArr = []

    Binary(ArrayList<Integer> numArr) {
        this.numArr = numArr
    }

    int search(int key, int startIndex, int endIndex) {
        if (endIndex >= startIndex) {

            int middle = (endIndex + startIndex) / 2

            if (numArr[middle] == key)
                return middle

            else if (numArr[middle] > key)
                search(key, startIndex, middle - 1)

            else
                search(key, middle + 1, endIndex)
        }

        else
            return -1
    }
}

int key = 3
ArrayList<Integer> numArr = [7, 2, 1, 8, 3, 5]
def b = new Binary(numArr)

int index = b.search(key, 0, numArr.size()-1)
String check = index == -1 ? "Not Found" : "$key in index $index"
println check