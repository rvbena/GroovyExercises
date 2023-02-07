/* 
Given an age in seconds, calculate how old someone would be on:
> Mercury: orbital period 0.2408467 Earth years
> Venus: orbital period 0.61519726 Earth years
> Earth: orbital period 1.0 Earth years, 365.25 Earth days, or 31557600 seconds
> Mars: orbital period 1.8808158 Earth years
> Jupiter: orbital period 11.862615 Earth years
> Saturn: orbital period 29.447498 Earth years
> Uranus: orbital period 84.016846 Earth years
> Neptune: orbital period 164.79132 Earth years
*/

import java.text.DecimalFormat 

final int SECONDS_PER_DAY = 60 * 60 * 24 // seconds_per_minute * minute_per_hour * hour_per_day
final float TOTAL_DAYS_EARTH = 365.25
def df = new DecimalFormat("#0.00")

def orbitalPeriod = [
    Mercury: 0.2408467,
    Venus: 0.61519726,
    Earth: 1,
    Mars: 1.8808158,
    Jupiter: 11.862615,
    Saturn: 29.447498,
    Uranus: 84.016846,
    Neptune: 164.79132
]

print "Enter Age (in seconds): "
int ageInSeconds = System.in.newReader().readLine() as Integer

for (key in orbitalPeriod.keySet()) {
    println "Age in $key years: \t${df.format(ageInSeconds / (SECONDS_PER_DAY 
            * (TOTAL_DAYS_EARTH * orbitalPeriod[key])))}"
}