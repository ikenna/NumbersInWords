package net.ikenna.NumbersInWords;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ThreeDigitsTest {


    @Test
    public void testShouldConvertNumbersInHundreds() throws Exception {
        assertNumberInWords(100, "one hundred");
        assertNumberInWords(101, "one hundred and one");
        assertNumberInWords(111, "one hundred and eleven");
        assertNumberInWords(110, "one hundred and ten");
        assertNumberInWords(156, "one hundred and fifty six");
        assertNumberInWords(199, "one hundred and ninety nine");
        assertNumberInWords(200, "two hundred");
        assertNumberInWords(577, "five hundred and seventy seven");
        assertNumberInWords(999, "nine hundred and ninety nine");
    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new ThreeDigits().convertToWords(number);
        assertThat(actual, is(numberInWords));
    }
}
