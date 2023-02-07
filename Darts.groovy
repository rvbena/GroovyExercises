/*
Write a function that returns the earned points in a single toss of a Darts game.

If the dart lands outside the target, player earns no points (0 points).
If the dart lands in the outer circle of the target, player earns 1 point.
If the dart lands in the middle circle of the target, player earns 5 points.
If the dart lands in the inner circle of the target, player earns 10 points.
*/

class Darts {
    int x, y

    Darts (int x, int y) {
        this.x = x
        this.y = y
    }

    int score () {
        double distance = Math.sqrt(this.x**2 + this.y**2)

        if (distance >= 6 && distance <= 10)
            return 1

        else if (distance >= 2 && distance <= 5)
            return 5

        else if (distance <= 1)
            return 10

        else
            return 0
    }
}

Darts d = new DartScore(8,1)
println d.score()