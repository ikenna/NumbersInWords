package net.ikenna.NumbersInWords;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PresetNumbersTest {

    @Test
    public void testShouldMatchNumbersInMap() throws Exception {
        assertThat(new PresetNumbers().isInRange(11), is(true));
        assertThat(new PresetNumbers().isInRange(21), is(false));
    }

    @Test
    public void testShouldConvertSingleDigits() throws Exception {
        assertNumberInWords(1, "one");
        assertNumberInWords(2, "two");
        assertNumberInWords(3, "three");
        assertNumberInWords(4, "four");
        assertNumberInWords(5, "five");
        assertNumberInWords(6, "six");
        assertNumberInWords(7, "seven");
        assertNumberInWords(8, "eight");
        assertNumberInWords(9, "nine");
    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new PresetNumbers().convertToWords(number);
        assertThat(actual, is(numberInWords));
    }
}
