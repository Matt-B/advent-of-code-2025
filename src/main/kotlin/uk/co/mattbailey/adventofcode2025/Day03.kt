package uk.co.mattbailey.adventofcode2025

class Day03 {
    fun solvePart1(input: List<String>): Int {
        var totalJoltage = 0
        for (line in input) {
            val first = getHighestNumberAndIndex(line.dropLast(1))
            val second = getHighestNumberAndIndex(line.substring(first.first + 1, line.length))
            val joltage = (first.second.toString() + second.second.toString()).toInt()
            totalJoltage += joltage
        }
        return totalJoltage
    }

    fun solvePart2(input: List<String>): Long {
        var totalJoltage = 0L
        for (line in input) {
            var joltage = ""
            var remainingLine = line
            for (i in 11 downTo 0) {
                val highest = getHighestNumberAndIndex(remainingLine.dropLast(i))
                remainingLine = remainingLine.substring(highest.first + 1, remainingLine.length)
                joltage += highest.second.toString()
            }
            totalJoltage += joltage.toLong()
        }
        return totalJoltage
    }

    private fun getHighestNumberAndIndex(input: String): Pair<Int, Int> {
        val sortedInput =
            input
                .toCharArray()
                .map { c -> c.digitToInt() }
                .sorted()
                .reversed()
        return Pair(input.indexOf(sortedInput[0].toString()), sortedInput[0])
    }
}
