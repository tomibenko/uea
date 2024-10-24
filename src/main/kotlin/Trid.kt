
import java.lang.Math.pow

class Trid(override val dimension: Int) : Problem() {
    override val name = "Trid"
    override val min: MutableList<Double>
    override val max: MutableList<Double>

    init {
        min = MutableList(dimension) { dimension * dimension * -1.0 }
        max = MutableList(dimension) { dimension * dimension * 1.0 }
    }

    override fun fitness(candidate: Solution): Solution {
        var result = candidate.kandidat.sumOf { pow(it - 1, 2.0) };
        var res = 0.0;
        for (i in 1..<candidate.kandidat.count()) {
            res += candidate.kandidat[i] * candidate.kandidat[i - 1]
        }
        candidate.fitnessValue = result - res
        return candidate
    }
}