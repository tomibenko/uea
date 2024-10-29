import kotlin.random.Random

abstract class Problem {
    abstract val name: String
    abstract val min: MutableList<Double>
    abstract val max: MutableList<Double>
    abstract val dimension: Int
    abstract fun fitness(candidate: Solution): Solution

    fun randomSolution(): Solution {
        val solution = Solution()
        for (i in 0..<dimension) {
            solution.kandidat.add(Random.nextDouble(min[i], max[i]))
        }
        return solution
    }

    fun isFeasible(candidate: Solution): Boolean {
        for (i in 0..<candidate.kandidat.size) {
            if (candidate.kandidat[i] < min[i] || candidate.kandidat[i] > max[i]) {
                return false
            }
        }
        return true
    }

    fun setFeasible(candidate: Solution): Solution {
        for (i in 0..<candidate.kandidat.size) {
            if (candidate.kandidat[i] < min[i]) {
                print("neke")
                candidate.kandidat[i] = min[i]
            } else if (candidate.kandidat[i] > max[i]) {
                candidate.kandidat[i] = max[i]
            }
        }
        return candidate
    }

}