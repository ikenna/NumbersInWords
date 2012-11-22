package net.ikenna.numberinwords;

import net.ikenna.numberinwords.numberpatterns.NineDigits;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NineDigitsTest {

    @Test
    public void testShouldConvertNumbers() throws Exception {
        assertNumberInWords(100000000, "one hundred million");
        assertNumberInWords(100000001, "one hundred million and one");
        assertNumberInWords(111111111, "one hundred and eleven million one hundred and eleven thousand one hundred and eleven");
        assertNumberInWords(999999999, "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");

    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new NineDigits().convertToWords(number);
        assertThat(actual, is(numberInWords));
    }
}
