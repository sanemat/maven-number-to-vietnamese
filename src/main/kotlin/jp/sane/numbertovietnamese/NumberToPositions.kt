package jp.sane.numbertovietnamese

@Throws(NotImplementedError::class)
fun numberToPositions (num: Int) : Array<Int> {
    if ( num < 0 ) {
        throw NotImplementedError("unknown: $num")
    }
    val quot = num / 10
    val rem = num % 10
    return when {
        quot == 0 -> arrayOf(rem)
        quot < 10 -> arrayOf(quot, rem)
        else -> arrayOf(*numberToPositions(quot), rem)
    }
}
