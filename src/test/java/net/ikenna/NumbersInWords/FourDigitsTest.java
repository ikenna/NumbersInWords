package net.ikenna.numbersInWords;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FourDigitsTest {

    @Test
    public void testShouldConvertFourDigitNumbers() throws Exception {
        assertNumberInWords(1000, "one thousand");
        assertNumberInWords(1001, "one thousand and one");
        assertNumberInWords(1010, "one thousand and ten");
        assertNumberInWords(1100, "one thousand one hundred");
        assertNumberInWords(1101, "one thousand one hundred and one");
        assertNumberInWords(1110, "one thousand one hundred and ten");
        assertNumberInWords(2000, "two thousand");
        assertNumberInWords(9000, "nine thousand");
        assertNumberInWords(9999, "nine thousand nine hundred and ninety nine");
    }

    private void assertNumberInWords(int number, String words) {
        String result = new FourDigits().convertToWords(number);
        assertThat(result, is(words));
    }
}
