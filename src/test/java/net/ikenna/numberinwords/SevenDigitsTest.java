package net.ikenna.numberinwords;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SevenDigitsTest {

    @Test
    public void testShouldConvertNumbers() throws Exception {
        assertNumberInWords(1000000, "one million");
        assertNumberInWords(1000001, "one million and one");
        assertNumberInWords(1111111, "one million one hundred and eleven thousand one hundred and eleven");
        assertNumberInWords(9999999, "nine million nine hundred and ninety nine thousand nine hundred and ninety nine");

    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new SevenDigits().convertToWords(number);
        assertThat(actual, is(numberInWords));
    }
}
