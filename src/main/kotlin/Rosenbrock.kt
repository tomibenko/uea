
import Problem
import Solution
import java.lang.Math.pow

class Rosenbrock(override val dimension: Int) : Problem() {
    override val name = "Rosenbrock"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        min = MutableList(dimension) { -100.0 }
        max = MutableList(dimension) { 100.0 }
        for (i in 0 until dimension) {
            min[i] = -5.0
            max[i] = 10.0
        }
    }

    override fun fitness(candidate: Solution): Solution {
        for (i in 0..candidate.kandidat.count() - 2) {
            candidate.fitnessValue += 100 * pow((candidate.kandidat[i + 1] - pow(candidate.kandidat[i], 2.0)), 2.0) + pow((candidate.kandidat[i] - 1), 2.0)
        }
        return candidate
    }
}

