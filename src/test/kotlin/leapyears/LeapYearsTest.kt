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

    private fun isLeapYear(year: Int): Boolean =
        year % 4 == 0
}
