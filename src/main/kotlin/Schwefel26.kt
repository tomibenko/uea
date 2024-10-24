

import kotlin.math.*

class Schwefel26(override val dimension: Int) : Problem() {
    override val name = "Schwefel26"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        min = MutableList(dimension) { -100.0 }
        max = MutableList(dimension) { 100.0 }
        for (i in 0 until dimension) {
                min[i] = -500.0
                max[i] = 500.0
        }
    }

    override fun fitness(candidate: Solution): Solution {
        candidate.fitnessValue = candidate.kandidat.sumOf { it * sin(sqrt(abs(it))) }
        return candidate
    }
}

