// Write a function to convert from normal numbers to Roman Numerals.

class ConvertToRoman {
    def equivalent = new StringBuilder()
    Map<String, Integer> romanNumerals = [
        1000: 'M',
        900: 'CM',
        500: 'D',
        400: 'CD',
        100: 'C',
        90: 'XC',
        50: 'L',
        40: 'XL',
        10: 'X',
        9: 'IX',
        5: 'V',
        4: 'IV',
        1: 'I'
    ]

    String conversion(int num) {
        boolean bool = false
        while (num > 0) {
            for (element in romanNumerals.keySet()) {
                if (num >= element) {
                    num -= element
                    equivalent << romanNumerals.get(element)
                    break
                }
            }
        }

        equivalent.toString()
    }
}

def rn = new ConvertToRoman()
println rn.conversion(1990)