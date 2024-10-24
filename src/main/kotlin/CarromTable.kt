package neke

import Problem
import Solution
import java.lang.Math.cos
import kotlin.math.abs
import kotlin.math.exp
import kotlin.math.pow
import kotlin.math.sqrt

class CarromTable(override var dimension: Int) : Problem() {
    override val name = "CarromTable"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        dimension = 2
        min = MutableList(dimension) { -10.0 }
        max = MutableList(dimension) { 10.0 }
    }

    override fun fitness(candidate: Solution): Solution {
        val firstTerm = -(1 / 30.0) * exp(
                2 * abs(1.0 - (sqrt(candidate.kandidat[0] * candidate.kandidat[0] + candidate.kandidat[1] * candidate.kandidat[1]) / Math.PI))
        )
        val secondTerm = cos(candidate.kandidat[0]).pow(2.0) * cos(candidate.kandidat[1]).pow(2.0)
        candidate.fitnessValue = firstTerm * secondTerm
        
        return candidate
    }

}
