
import Problem
import Solution
import java.lang.Math.cos
import kotlin.math.*

class Michalewicz (override var dimension: Int) : Problem() {
    override val name = "Michalewicz"
    override val min: MutableList<Double>
    override val max: MutableList<Double>



    init {
    dimension = 2
    min = MutableList(dimension) { }
    max = MutableList(dimension) { }
}
    override fun fitness(candidate: Solution): Solution {
        candidate.fitnessValue = - (0 until candidate.kandidat.size).sumOf { i ->
            val xi = candidate.kandidat[i]
            sin(xi) * sin((i + 1) * xi * xi / Math.PI).pow(2 * 10)
        }
        return candidate
    }
}