// Given a year, report if it is a leap year.

class Leap {
    int year

    Leap(int year) {
        this.year = year
    }

    boolean isLeapYear() {
        year % 100 == 0 ? year % 400 == 0 : year % 4 == 0
    }
}

def l = new Leap(1996)
println l.isLeapYear()