package leapyears

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class LeapYearsTest {

    @Test fun `does not categorize typical common year as a leap year`() {
        assertFalse(isLeapYear(2001))
    }

    private fun isLeapYear(year: Int): Boolean =
        false
}
