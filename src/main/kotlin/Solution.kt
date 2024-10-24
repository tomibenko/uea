

open class Solution {
    var kandidat: MutableList<Double> = MutableList(0){0.0}
    var fitnessValue: Double = 0.0

    open fun copy(): Solution {
        var g = Solution()
        g.kandidat = kandidat.toMutableList()
        g.fitnessValue = fitnessValue
        return g
    }
}