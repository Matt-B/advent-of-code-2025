package uk.co.mattbailey.adventofcode2025

class Day01 {

    fun solvePart1(input: List<String>): Int {
        var numberOfTimesAtZero = 0
        var currentPosition = 50
        for (line in input) {
            val direction = line[0]
            val amount = line.substring(1).toInt()
            if (direction == 'L') {
                currentPosition -= amount
                while (currentPosition < 0) {
                    currentPosition = 100 - (currentPosition * -1)
                }
            } else if (direction == 'R') {
                currentPosition += amount
                while (currentPosition > 99) {
                    currentPosition = 0 + (currentPosition - 100)
                }
            }
            if (currentPosition == 0) { numberOfTimesAtZero++ }
        }
        return numberOfTimesAtZero
    }

    fun solvePart2(input: List<String>): Int {
        var numberOfTimesPassedZero = 0
        var currentPosition = 50
        for (line in input) {
            val direction = line[0]
            val amount = line.substring(1).toInt()
            if (direction == 'L') {
                val originalPosition = currentPosition
                val numberOfRotations = (amount - (amount % 100)) / 100
                val finalMovement = amount % 100
                numberOfTimesPassedZero += numberOfRotations
                currentPosition -= finalMovement
                if (currentPosition < 0) {
                    currentPosition = 100 - (currentPosition * -1)
                    if(currentPosition != 0 && originalPosition != 0)
                    {
                        numberOfTimesPassedZero++
                    }
                }
            } else if (direction == 'R') {
                val originalPosition = currentPosition
                val numberOfRotations = (amount - (amount % 100)) / 100
                val finalMovement = amount % 100
                numberOfTimesPassedZero += numberOfRotations
                currentPosition += finalMovement
                if (currentPosition > 99) {
                    currentPosition = 0 + (currentPosition - 100)
                    if(currentPosition != 0 && originalPosition != 0)
                    {
                        numberOfTimesPassedZero++
                    }
                }
            }
            if (currentPosition == 0) {
                numberOfTimesPassedZero++
            }
        }
        return numberOfTimesPassedZero
    }
}