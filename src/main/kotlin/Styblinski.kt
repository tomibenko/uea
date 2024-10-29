
import Problem
import Solution
import java.lang.Math.cos
import kotlin.math.*

class Styblinski (override var dimension: Int) : Problem() {
    override val name = "Styblinski"
    override val min: MutableList<Double>
    override val max: MutableList<Double>



    init {
        dimension = 2
        min = MutableList(dimension) {-5.0 }
        max = MutableList(dimension) {5.0}
    }
    override fun fitness(candidate: Solution): Solution {
        candidate.fitnessValue = 0.5 * (0 until candidate.kandidat.size).sumOf { i ->
            val xi = candidate.kandidat[i]
            xi.pow(4) - 16 * xi.pow(2) + 5 * xi
        }
        return candidate
    }

}
