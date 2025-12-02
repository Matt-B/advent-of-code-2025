package uk.co.mattbailey.adventofcode2025

import java.io.File
import kotlin.test.Test

class Day02Test {

    private val exampleInput = listOf(
        "11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124"
    )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day02().solvePart1(exampleInput)
        assert(answer == 1227775554L)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day2.txt").readLines()
        val answer = Day02().solvePart1(inputs)
        assert(answer == 28844599675L)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day02().solvePart2(exampleInput)
        assert(answer == 4174379265L)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day2.txt").readLines()
        val answer = Day02().solvePart2(inputs)
        assert(answer == 48778605167L)
    }
}