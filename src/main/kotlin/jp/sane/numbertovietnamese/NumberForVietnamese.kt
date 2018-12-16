package jp.sane.numbertovietnamese

class NumberForVietnamese(val nums: IntArray) {
    companion object {
        fun from(num : Int) : NumberForVietnamese {
            return NumberForVietnamese(numberToPositions(num))
        }
    }

    @Throws(NotImplementedError::class)
    fun toVietnamese() : String {
        val normalNumbers = arrayOf(
                "không", "một", "hai", "ba", "bốn",
                "năm", "sáu", "bảy", "tám", "chín"
        )
        val thousand = "nghìn"
        val million = "triệu"

        return when {
            nums.contentEquals(intArrayOf(0)) -> { "không" }
            nums.contentEquals(intArrayOf(1, 0, 0, 0, 0, 0, 0)) -> { "${normalNumbers[1]} $million" }
            nums.contentEquals(intArrayOf(1, 0, 0, 0)) -> { "${normalNumbers[1]} $thousand" }
            nums.count() == 3 -> withoutPrefix(nums[0], nums[1], nums[2])!!
            nums.count() == 2 -> withoutPrefix(0, nums[0], nums[1])!!
            nums.count() == 1 -> withoutPrefix(0, 0, nums[0])!!
            else -> { throw NotImplementedError("unknown: $nums") }
        }
    }
}

fun withoutPrefix(hundredsPosition: Int, tensPosition: Int, onesPosition: Int) : String? {
    if (hundredsPosition == 0 && tensPosition == 0 && onesPosition == 0) {
        return null
    }
    val normalNumbers = arrayOf(
            "không", "một", "hai", "ba", "bốn",
            "năm", "sáu", "bảy", "tám", "chín"
    )
    val ten = "mười"
    val specialTen = "mươi"
    val specialFive = "lăm"
    val specialOne = "mốt"
    val hundred = "trăm"
    val thousand = "nghìn"
    val million = "triệu"
    // north: linh, south: lẻ
    val empty = "lẻ"

    val temp = mutableListOf<String?>()
    // hundred's position
    if (hundredsPosition != 0) {
        temp.add("${normalNumbers[hundredsPosition]} $hundred")
    }
    // ten's position
    if (hundredsPosition != 0 && tensPosition == 0 && onesPosition != 0) {
        temp.add(empty)
    } else if (tensPosition == 1) {
        temp.add(ten)
    } else if (tensPosition in 2..9) {
        temp.add("${normalNumbers[tensPosition]} $specialTen")
    }
    // one's position
    if (tensPosition in 1..9 && onesPosition == 5) {
        temp.add(specialFive)
    } else if (tensPosition in 2..9 && onesPosition == 1) {
        temp.add(specialOne)
    } else if (onesPosition in 1..9) {
        temp.add(normalNumbers[onesPosition])
    }
    return temp.joinToString(" ")
}
