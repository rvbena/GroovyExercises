/* Your task is to clean up differently formatted telephone 
numbers by removing punctuation and the country code (1) if present.
*/

class PhoneNumberFormat {
    private String phoneNum

    PhoneNumberFormat(String phoneNum) {
        this.phoneNum = phoneNum.replaceAll("[^0-9]", "")
    }

    String clean() {
        this.phoneNum.length() == 11 ? this.phoneNum.substring(1) 
                                     : this.phoneNum
    }
}

String phoneNum = "+1 (613)-995-0253"
// print "Enter a phone number: "
// String phone_num = System.in.newReader().readLine()
def ph = new PhoneNumberFormat(phoneNum)

println phoneNum
println ph.clean()