package uk.co.mattbailey.adventofcode2025

class Day02 {

    fun solvePart1(input: List<String>): Long {
        val invalidIds = mutableListOf<Long>()
        for(line in input) {
            line.split(',').forEach { codes ->
                val first = codes.split('-').first().toLong()
                val second = codes.split('-').last().toLong()
                for(id in first..second) {
                    val stringedId = id.toString()
                    if( stringedId.length % 2 == 0 ) {
                        val firstHalf = stringedId.take(((stringedId.length / 2)))
                        val secondHalf = stringedId.substring(stringedId.length / 2, stringedId.length)
                        if(firstHalf == secondHalf) {
                            invalidIds.add(id)
                        }
                    }
                }
            }
        }
        return invalidIds.sum()
    }

    fun solvePart2(input: List<String>): Long {
        val invalidIds = mutableListOf<Long>()
        for(line in input) {
            line.split(',').forEach { codes ->
                val first = codes.split('-').first().toLong()
                val second = codes.split('-').last().toLong()
                for(id in first..second) {
                    val stringedId = id.toString()
                    for(length in 1..<stringedId.length) {
                        if(stringedId.length % length == 0 ) {
                            val matchResults = ".{1,$length}".toRegex().findAll(stringedId)
                            val matches = matchResults.map { matchResult -> matchResult.groupValues[0] }
                            if(matches.all { it == matches.first() }) {
                                invalidIds.add(id)
                                break
                            }
                        }
                    }
                }
            }
        }
        return invalidIds.sum()
    }
}