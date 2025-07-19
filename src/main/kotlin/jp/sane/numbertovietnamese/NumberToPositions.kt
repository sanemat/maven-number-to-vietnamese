package jp.sane.numbertovietnamese

@Throws(NotImplementedError::class)
fun numberToPositions(num: Int): IntArray {
    if ( num < 0 ) {
        throw NotImplementedError("unknown: $num")
    }
    val quot = num / 10
    val rem = num % 10
    return when {
        quot == 0 -> intArrayOf(rem)
        quot < 10 -> intArrayOf(quot, rem)
        else -> numberToPositions(quot) + intArrayOf(rem)
    }
}
