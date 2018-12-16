package jp.sane.numbertovietnamese

fun numberToPositions (num: Int) : Array<Int> {
    val quot = num / 10
    val rem = num % 10
    return when {
        quot == 0 -> arrayOf(rem)
        quot < 10 -> arrayOf(quot, rem)
        else -> arrayOf(*numberToPositions(quot), rem)
    }
}
