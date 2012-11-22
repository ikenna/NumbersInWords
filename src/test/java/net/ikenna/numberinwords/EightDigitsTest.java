package net.ikenna.numberinwords;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EightDigitsTest {

    @Test
    public void testShouldConvertNumbers() throws Exception {
        assertNumberInWords(10000000, "ten million");
        assertNumberInWords(10000001, "ten million and one");
        assertNumberInWords(11111111, "eleven million one hundred and eleven thousand one hundred and eleven");
        assertNumberInWords(99999999, "ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");

    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new EightDigits().convertToWords(number);
        assertThat(actual, is(numberInWords));
    }
}
