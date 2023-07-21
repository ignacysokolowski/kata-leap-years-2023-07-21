package leapyears

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LeapYearsTest {

    @Test fun `does not categorize typical common year as a leap year`() {
        assertFalse(Year(2001).isLeap())
    }

    @Test fun `categorizes year divisible by 4 as a leap year`() {
        assertTrue(Year(1996).isLeap())
    }

    @Test fun `does not categorize year divisible by 4 and 100 as a leap year`() {
        assertFalse(Year(1900).isLeap())
    }

    @Test fun `categorizes year divisible by 4, 100 and 400 as a leap year`() {
        assertTrue(Year(2000).isLeap())
    }
}

class Year(private val number: Int) {
    fun isLeap(): Boolean =
        isDivisibleBy(4) && !isAnAtypicalCommonYear()

    private fun isDivisibleBy(divisor: Int): Boolean =
        number % divisor == 0

    private fun isAnAtypicalCommonYear(): Boolean =
        isDivisibleBy(100) && !isDivisibleBy(400)
}
