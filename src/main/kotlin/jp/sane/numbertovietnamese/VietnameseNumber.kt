package jp.sane.numbertovietnamese

class VietnameseNumber(vararg nums: Int) {
    companion object {
        fun from(num : Int) : VietnameseNumber {
            return VietnameseNumber(*numberToPositions(num))
        }
    }
}
