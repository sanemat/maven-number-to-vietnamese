package jp.sane.numbertovietnamese

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NumberToPositionsTest {
    @Test
    fun num0() {
        assert(arrayOf(0).contentEquals(numberToPositions(0)))
    }
    @Test
    fun num1() {
        assert(arrayOf(1).contentEquals(numberToPositions(1)))
    }
    @Test
    fun num10() {
        assert(arrayOf(1, 0).contentEquals(numberToPositions(10)))
    }
    @Test
    fun num55() {
        assert(arrayOf(5, 5).contentEquals(numberToPositions(55)))
    }
    @Test
    fun num1192() {
        assert(arrayOf(1, 1, 9, 2).contentEquals(numberToPositions(1192)))
    }
    @Test
    fun num_minus_1() {
        assertFailsWith<NotImplementedError> {
            numberToPositions(-1)
        }
    }
}
