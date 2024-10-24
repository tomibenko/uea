

import Problem

class Sphere(override val dimension: Int) : Problem() {
    override val name = "Sphere"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        min = MutableList(dimension) { -100.0 }
        max = MutableList(dimension) { 100.0 }
        for (i in 0 until dimension) {
            if (i % 2 == 1) {
                min[i] = -10.0
                max[i] = 10.0
            }
        }
    }

    override fun fitness(candidate: Solution): Solution {
        candidate.fitnessValue = candidate.kandidat.sumOf { it * it }
        return candidate
    }
}
