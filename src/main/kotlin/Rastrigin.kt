

import Problem
import Solution
import java.lang.Math.cos
import kotlin.math.*

class Rastrigin  (override var dimension: Int) : Problem() {
    override val name = "Styblinski"
    override val min: MutableList<Double>
    override val max: MutableList<Double>



    init {
        dimension = 2
        min = MutableList(dimension) {-5.12 }
        max = MutableList(dimension) { 5.12 }
    }
    override fun fitness(candidate: Solution): Solution {
        candidate.fitnessValue = 10.0 * dimension + (0 until dimension).sumOf { i ->
            val xi = candidate.kandidat[i]
            xi.pow(2) - 10 * cos(2 * PI * xi)
        }

        return candidate
    }


}
