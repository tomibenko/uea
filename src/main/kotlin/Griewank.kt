
import Problem
import Solution
import kotlin.math.*

class Griewank(override var dimension: Int) : Problem() {
    override val name = "Griewank"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        // Initialize the bounds for Griewank function, typically within [-600, 600]
        min = MutableList(dimension) { -600.0 }
        max = MutableList(dimension) { 600.0 }
    }

    // Fitness function based on the Griewank formula
    override fun fitness(candidate: Solution): Solution {
        val d = candidate.kandidat.size // Number of dimensions

        // First part of the Griewank function: 1 + (1/4000) * Σ(xi^2)
        val sumTerm = candidate.kandidat.sumOf { xi -> xi.pow(2) } / 4000

        // Second part: Π(cos(xi / sqrt(i))) for i = 1 to d
        val productTerm = (0 until d).fold(1.0) { product, i ->
            product * cos(candidate.kandidat[i] / sqrt((i + 1).toDouble()))
        }

        // Griewank function: 1 + sumTerm - productTerm
        candidate.fitnessValue = 1 + sumTerm - productTerm

        return candidate
    }
}
