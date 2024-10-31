import neke.CarromTable
import kotlin.test.Test
import kotlin.test.assertEquals

class unittest {

    @Test
    fun griewank() {

        val dimension = 2
        val griewankProblem = Griewank(dimension)

        // Define a solution close to the origin, where Griewank is expected to be minimal (value close to 0)
        val candidate = Solution()
        candidate.kandidat = mutableListOf(0.0, 0.0)  // Minimal point in Griewank function

        val result = griewankProblem.fitness(candidate)

        assertEquals(0.0, result.fitnessValue, 1e-6, "Fitness value at the origin should be close to 0.")
    }

    @Test
    fun griewank2() {

        val dimension = 5
        val griewankProblem = Griewank(dimension)

        // Define a solution close to the origin, where Griewank is expected to be minimal (value close to 0)
        val candidate = Solution()
        candidate.kandidat = mutableListOf(0.0, 0.0)  // Minimal point in Griewank function

        val result = griewankProblem.fitness(candidate)

        assertEquals(0.0, result.fitnessValue, 1e-6, "Fitness value at the origin should be close to 0.")
    }

    @Test
    fun griewank3() {

        val dimension = 10
        val griewankProblem = Griewank(dimension)

        // Define a solution close to the origin, where Griewank is expected to be minimal (value close to 0)
        val candidate = Solution()
        candidate.kandidat = mutableListOf(0.0, 0.0)  // Minimal point in Griewank function

        val result = griewankProblem.fitness(candidate)

        assertEquals(0.0, result.fitnessValue, 1e-6, "Fitness value at the origin should be close to 0.")
    }


    @Test
    fun ackley() {
        val dimension = 2
        val ackleyProblem = Ackley(dimension)

        // Ackley function is minimal at origin for many implementations
        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = ackleyProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-6,
            "Fitness value at the origin should be close to 0 for Ackley function."
        )
    }

    @Test
    fun ackle2() {
        val dimension = 5
        val ackleyProblem = Ackley(dimension)

        // Ackley function is minimal at origin for many implementations
        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = ackleyProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-6,
            "Fitness value at the origin should be close to 0 for Ackley function."
        )
    }

    @Test
    fun ackley3() {
        val dimension = 10
        val ackleyProblem = Ackley(dimension)

        // Ackley function is minimal at origin for many implementations
        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = ackleyProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-6,
            "Fitness value at the origin should be close to 0 for Ackley function."
        )
    }

    @Test
    fun Rastrigin() {
        val dimension = 2
        val rastriginProblem = Rastrigin(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = rastriginProblem.fitness(candidate)

        // Rastrigin is 0 at the origin
        assertEquals(0.0, result.fitnessValue, 1e-6, "Fitness value at the origin should be 0 for Rastrigin function.")
    }

    @Test
    fun Rastrigin2() {
        val dimension = 5
        val rastriginProblem = Rastrigin(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = rastriginProblem.fitness(candidate)

        // Rastrigin is 0 at the origin
        assertEquals(0.0, result.fitnessValue, 1e-6, "Fitness value at the origin should be 0 for Rastrigin function.")
    }

    @Test
    fun Rastrigin3() {
        val dimension = 10
        val rastriginProblem = Rastrigin(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = rastriginProblem.fitness(candidate)

        // Rastrigin is 0 at the origin
        assertEquals(0.0, result.fitnessValue, 1e-6, "Fitness value at the origin should be 0 for Rastrigin function.")
    }


    @Test
    fun bukin() {
        val dimension = 2
        val rastriginProblem = Bukin(dimension)

        val candidate = Solution()
        candidate.kandidat = mutableListOf(-10.0, 1.0)

        val result = rastriginProblem.fitness(candidate)

        // Rastrigin is 0 at the origin
        assertEquals(
            0.0,
            result.fitnessValue,
            1e-6,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun CarromTable() {
        val dimensions = listOf(2, 5, 10) // Test with different dimensions
        val testValue = 9.646157266348881 // Known value used in the test

        dimensions.forEach { dimension ->
            val carromTableProblem = CarromTable(dimension)
            val candidate = Solution()

            // Create a candidate solution with alternating values based on testValue
            candidate.kandidat = MutableList(dimension) { if (it % 2 == 0) testValue else -testValue }

            // Evaluate the fitness for this candidate
            val result = carromTableProblem.fitness(candidate)

            // Expected fitness needs to be verified for each dimension or calculated dynamically
            val expectedFitness = -24.1568 // Placeholder, adjust if needed based on calculations

            // Validate fitness value within a tolerance
            assertEquals(
                expectedFitness,
                result.fitnessValue,
                1e-2,
                "Fitness value should match the expected CarromTable value for dimension $dimension. Actual: ${result.fitnessValue}"
            )
        }
    }

    @Test
    fun levy() {
        val dimension = 2
        val rastriginProblem = Levy(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 1.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    fun levy2() {
        val dimension = 5
        val rastriginProblem = Levy(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 1.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    fun levy3() {
        val dimension = 10
        val rastriginProblem = Levy(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 1.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    fun `Michalewicz fitness function with specific input for multiple dimensions`() {
        val dimensions = listOf(2, 5, 10) // Test with different dimensions
        val knownValues = mapOf(
            2 to mutableListOf(2.20, 1.57),
            5 to mutableListOf(2.20, 1.57, 2.2, 1.57, 2.20),
            10 to MutableList(10) { if (it % 2 == 0) 2.20 else 1.57 }
        )
        val expectedFitnessValues = mapOf(
            2 to -1.8013,
            5 to -4.6877,
            10 to -9.66015
        )

        dimensions.forEach { dimension ->
            val michalewiczProblem = Michalewicz(dimension)
            val candidate = Solution()
            candidate.kandidat = knownValues[dimension] ?: MutableList(dimension) { 0.0 }
            val result = michalewiczProblem.fitness(candidate)
            val expectedFitness = expectedFitnessValues[dimension] ?: 0.0

            assertEquals(
                expectedFitness,
                result.fitnessValue,
                1e-2,
                "Fitness value should match the expected Michalewicz value for dimension $dimension. Actual: ${result.fitnessValue}"
            )
        }
    }

    @Test
    fun rosenbrock() {
        val dimension = 2
        val rastriginProblem = Rosenbrock(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 1.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun rosenbrock2() {
        val dimension = 5
        val rastriginProblem = Rosenbrock(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 1.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun rosenbrock3() {
        val dimension = 10
        val rastriginProblem = Rosenbrock(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 1.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun schwefel26() {
        val dimension = 2
        val rastriginProblem = Schwefel26(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 420.9687 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun schwefel26_3() {
        val dimension = 5
        val rastriginProblem = Schwefel26(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 420.9687 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun schwefel26_2() {
        val dimension = 10
        val rastriginProblem = Schwefel26(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 420.9687 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun sphere() {
        val dimension = 2
        val rastriginProblem = Sphere(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { 0.0 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            0.0,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun styblitski() {
        val dimension = 2
        val rastriginProblem = Styblinski(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { -2.903534 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            -39.16599 * dimension,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun styblitski2() {
        val dimension = 5
        val rastriginProblem = Styblinski(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { -2.903534 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            -39.16599 * dimension,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }

    @Test
    fun styblitski3() {
        val dimension = 10
        val rastriginProblem = Styblinski(dimension)

        val candidate = Solution()
        candidate.kandidat = MutableList(dimension) { -2.903534 }

        val result = rastriginProblem.fitness(candidate)

        assertEquals(
            -39.16599 * dimension,
            result.fitnessValue,
            1e-2,
            "Fitness value at the origin should be 0 for bukin function." + result.fitnessValue
        )
    }



    @Test
    fun `Trid fitness should calculate correct fitness value at known minimum for multiple dimensions`() {
        // Test for dimensions from 2 to 10
        for (dimension in 2..15) {
            val tridProblem = Trid(dimension)

            // Create a candidate solution at the known minimum point, where x_i = i
            val candidate = Solution()
            candidate.kandidat = MutableList(dimension) { i -> (i + 1) * (dimension + 1 - (i + 1)).toDouble() }

            val result = tridProblem.fitness(candidate)

            // Calculate the expected minimum fitness value for the given dimension
            val expectedFitness = -(dimension * (dimension + 4) * (dimension - 1)) / 6.0

            assertEquals(
                expectedFitness, result.fitnessValue, 1e-6,
                "Fitness value at the known minimum should match the expected Trid minimum for dimension $dimension."
            )
        }
    }

}
