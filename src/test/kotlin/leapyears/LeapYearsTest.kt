package leapyears

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LeapYearsTest {

    @Test fun `does not categorize typical common year as a leap year`() {
        assertFalse(isLeapYear(2001))
    }

    @Test fun `categorizes year divisible by 4 as a leap year`() {
        assertTrue(isLeapYear(1996))
    }

    @Test fun `does not categorize year divisible by 4 and 100 as a leap year`() {
        assertFalse(isLeapYear(1900))
    }

    @Test fun `categorizes year divisible by 4, 100 and 400 as a leap year`() {
        assertTrue(isLeapYear(2000))
    }

    private fun isLeapYear(year: Int): Boolean =
        year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}
