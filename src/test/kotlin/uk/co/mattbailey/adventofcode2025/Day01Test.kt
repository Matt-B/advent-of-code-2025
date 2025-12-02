package uk.co.mattbailey.adventofcode2025

import java.io.File
import kotlin.test.Test

class Day01Test {

    private val exampleInput = listOf(
        "L68",
        "L30",
        "R48",
        "L5",
        "R60",
        "L55",
        "L1",
        "L99",
        "R14",
        "L82"
    )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day01().solvePart1(exampleInput)
        assert(answer == 3)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day1.txt").readLines()
        val answer = Day01().solvePart1(inputs)
        assert(answer == 1132)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day01().solvePart2(exampleInput)
        assert(answer == 6)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day1.txt").readLines()
        val answer = Day01().solvePart2(inputs)
        assert(answer == 6623)
    }
}