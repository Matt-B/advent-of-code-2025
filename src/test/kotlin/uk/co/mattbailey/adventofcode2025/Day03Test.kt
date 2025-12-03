package uk.co.mattbailey.adventofcode2025

import java.io.File
import kotlin.test.Test

class Day03Test {
    private val exampleInput =
        listOf(
            "987654321111111",
            "811111111111119",
            "234234234234278",
            "818181911112111",
        )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day03().solvePart1(exampleInput)
        assert(answer == 357)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day3.txt").readLines()
        val answer = Day03().solvePart1(inputs)
        assert(answer == 17435)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day03().solvePart2(exampleInput)
        assert(answer == 3121910778619L)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day3.txt").readLines()
        val answer = Day03().solvePart2(inputs)
        println(answer)
    }
}
