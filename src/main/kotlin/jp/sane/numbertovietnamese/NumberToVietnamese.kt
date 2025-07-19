package jp.sane.numbertovietnamese

@Throws(NotImplementedError::class)
fun numberToVietnamese(num: Int): String {
    return NumberForVietnamese.from(num).toVietnamese()
}
