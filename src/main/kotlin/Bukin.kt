

import java.lang.Math.pow
import kotlin.math.abs
import kotlin.math.sqrt

class Bukin(override var dimension: Int) : Problem() {
    override val name = "Bukin"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        dimension = 2
        min = MutableList(dimension) { -3.0 }
        max = MutableList(dimension) { 3.0 }
        min[0] = -15.0
        max[0] = -5.0
    }

    override fun fitness(candidate: Solution): Solution {
        candidate.fitnessValue = 100 * sqrt(abs(candidate.kandidat[1] - 0.01 * pow(candidate.kandidat[0], 2.0))) + 0.01 * abs(candidate.kandidat[0] + 10)
        return candidate
    }
}
