package jp.sane.numbertovietnamese

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Vietnamese numbers https://www.omniglot.com/language/numbers/vietnamese.htm
 * Counting numbers in Vietnamese https://www.colanguage.com/counting-numbers-vietnamese
 */
class NumberForVietnameseTest {
    @Test
    fun num0() {
        assertEquals("không", NumberForVietnamese.from(0).toVietnamese())
    }
    @Test
    fun num5() {
        assertEquals("năm", NumberForVietnamese.from(5).toVietnamese())
    }
    @Test
    fun num6() {
        assertEquals("sáu", NumberForVietnamese.from(6).toVietnamese())
    }
    @Test
    fun num10() {
        assertEquals("mười", NumberForVietnamese.from(10).toVietnamese())
    }
    @Test
    fun num11() {
        assertEquals("mười một", NumberForVietnamese.from(11).toVietnamese())
    }
    @Test
    fun num15() {
        assertEquals("mười lăm", NumberForVietnamese.from(15).toVietnamese())
    }
    @Test
    fun num20() {
        assertEquals("hai mươi", NumberForVietnamese.from(20).toVietnamese())
    }
    @Test
    fun num21() {
        assertEquals("hai mươi mốt", NumberForVietnamese.from(21).toVietnamese())
    }
    @Test
    fun num100() {
        assertEquals("một trăm", NumberForVietnamese.from(100).toVietnamese())
    }
    @Test
    fun num103() {
        assertEquals("một trăm lẻ ba", NumberForVietnamese.from(103).toVietnamese())
    }
    @Test
    fun num1000() {
        assertEquals("một nghìn", NumberForVietnamese.from(1000).toVietnamese())
    }
    @Test
    fun num1000000() {
        assertEquals("một triệu", NumberForVietnamese.from(1000000).toVietnamese())
    }

}
