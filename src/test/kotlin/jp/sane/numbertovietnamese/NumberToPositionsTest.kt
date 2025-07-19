package jp.sane.numbertovietnamese

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NumberToPositionsTest {
    @Test
    fun num0() {
        assert(intArrayOf(0).contentEquals(numberToPositions(0)))
    }
    @Test
    fun num1() {
        assert(intArrayOf(1).contentEquals(numberToPositions(1)))
    }
    @Test
    fun num10() {
        assert(intArrayOf(1, 0).contentEquals(numberToPositions(10)))
    }
    @Test
    fun num55() {
        assert(intArrayOf(5, 5).contentEquals(numberToPositions(55)))
    }
    @Test
    fun num1192() {
        assert(intArrayOf(1, 1, 9, 2).contentEquals(numberToPositions(1192)))
    }
    @Test
    fun num_minus_1() {
        assertFailsWith<NotImplementedError> {
            numberToPositions(-1)
        }
    }
    
    @Test
    fun num123() {
        assert(intArrayOf(1, 2, 3).contentEquals(numberToPositions(123)))
    }
    
    @Test
    fun num1000() {
        assert(intArrayOf(1, 0, 0, 0).contentEquals(numberToPositions(1000)))
    }
    
    @Test
    fun num999() {
        assert(intArrayOf(9, 9, 9).contentEquals(numberToPositions(999)))
    }
}
