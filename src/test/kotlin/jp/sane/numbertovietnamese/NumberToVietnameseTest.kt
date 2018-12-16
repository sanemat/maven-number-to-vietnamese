package jp.sane.numbertovietnamese

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Vietnamese numbers https://www.omniglot.com/language/numbers/vietnamese.htm
 * Counting numbers in Vietnamese https://www.colanguage.com/counting-numbers-vietnamese
 */
class NumberToVietnameseTest {
    @Test
    fun num0() {
        assertEquals("không", numberToVietnamese(0))
    }
    @Test
    fun num5() {
        assertEquals("năm", numberToVietnamese(5))
    }
    @Test
    fun num6() {
        assertEquals("sáu", numberToVietnamese(6))
    }
    @Test
    fun num10() {
        assertEquals("mười", numberToVietnamese(10))
    }
    @Test
    fun num11() {
        assertEquals("mười một", numberToVietnamese(11))
    }
    @Test
    fun num15() {
        assertEquals("mười lăm", numberToVietnamese(15))
    }
    @Test
    fun num20() {
        assertEquals("hai mươi", numberToVietnamese(20))
    }
    @Test
    fun num21() {
        assertEquals("hai mươi mốt", numberToVietnamese(21))
    }
    @Test
    fun num100() {
        assertEquals("một trăm", numberToVietnamese(100))
    }
    @Test
    fun num103() {
        assertEquals("một trăm lẻ ba", numberToVietnamese(103))
    }
    @Test
    fun num1000() {
        assertEquals("một nghìn", numberToVietnamese(1000))
    }
    @Test
    fun num1000000() {
        assertEquals("một triệu", numberToVietnamese(1000000))
    }
}
