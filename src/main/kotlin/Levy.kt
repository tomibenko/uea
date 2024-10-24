import Problem
import Solution
import kotlin.math.*

class Levy(override var dimension: Int) : Problem() {
    override val name = "Levy"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        // Initialize the bounds for Levy function, usually within [-10, 10]
        min = MutableList(dimension) { -10.0 }
        max = MutableList(dimension) { 10.0 }
    }

    // Fitness function based on the Levy formula
    override fun fitness(candidate: Solution): Solution {
        val d = candidate.kandidat.size // Number of dimensions
        val w = candidate.kandidat.map { xi -> 1 + (xi - 1) / 4 } // Calculate w_i for each x_i

        // Levy function
        val term1 = sin(PI * w[0]).pow(2)  // sin^2(π * w1)

        // Sum over w_i terms (from i = 1 to d-1)
        val term2 = (0 until d - 1).sumOf { i ->
            (w[i] - 1).pow(2) * (1 + 10 * sin(PI * w[i] + 1).pow(2))
        }

        // Final term for w_d
        val term3 = (w[d - 1] - 1).pow(2) * (1 + sin(2 * PI * w[d - 1]).pow(2))

        // Combine all terms
        candidate.fitnessValue = term1 + term2 + term3

        return candidate
    }
}
