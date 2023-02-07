import java.time.LocalDate
import java.time.LocalDateTime

class Giga {
    static def add(LocalDate moment) {
        LocalDateTime start = moment.atStartOfDay()
        start + 1_000_000_000
    }

    static def add(LocalDateTime moment) {
        moment + 1_000_000_000
    }
}

def g = new Giga()
println g.add(LocalDate.now())