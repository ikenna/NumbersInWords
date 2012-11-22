package net.ikenna.numbersInWords;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SixDigitsTest {

    @Test
    public void testShouldMatchNumbersInRange() throws Exception {
        assertThat(new SixDigits().isInRange(99999), is(false));
        assertThat(new SixDigits().isInRange(100000), is(true));
        assertThat(new SixDigits().isInRange(999999), is(true));
        assertThat(new SixDigits().isInRange(1000000), is(false));
    }

    @Test
    public void testShouldConvertNumbers() throws Exception {
        assertNumberInWords(100000, "one hundred thousand");
        assertNumberInWords(100001, "one hundred thousand and one");
        assertNumberInWords(100101, "one hundred thousand one hundred and one");
        assertNumberInWords(900909, "nine hundred thousand nine hundred and nine");
        assertNumberInWords(900999, "nine hundred thousand nine hundred and ninety nine");
    }

    private void assertNumberInWords(int number, String value) {
        String result = new SixDigits().convertToWords(number);
        assertThat(result, is(value));
    }
}
