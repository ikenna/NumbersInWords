package net.ikenna.numberinwords.numberpatterns;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TwoDigitsTest {

    @Test
    public void testShouldMatchNumbersInRange() throws Exception {
        assertThat(new TwoDigits().isInRange(9), is(false));
        assertThat(new TwoDigits().isInRange(10), is(true));
        assertThat(new TwoDigits().isInRange(99), is(true));
        assertThat(new TwoDigits().isInRange(100), is(false));
    }


    @Test
    public void testShouldConvertDoubleDigits() throws Exception {
        assertNumberInWords(10, "ten");
        assertNumberInWords(11, "eleven");
        assertNumberInWords(12, "twelve");
        assertNumberInWords(13, "thirteen");
        assertNumberInWords(14, "fourteen");
        assertNumberInWords(15, "fifteen");
        assertNumberInWords(16, "sixteen");
        assertNumberInWords(17, "seventeen");
        assertNumberInWords(18, "eighteen");
        assertNumberInWords(19, "nineteen");
        assertNumberInWords(20, "twenty");

        assertNumberInWords(21, "twenty one");
        assertNumberInWords(22, "twenty two");
        assertNumberInWords(30, "thirty");
        assertNumberInWords(39, "thirty nine");
        assertNumberInWords(40, "forty");
        assertNumberInWords(49, "forty nine");
        assertNumberInWords(90, "ninety");
        assertNumberInWords(99, "ninety nine");

    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new TwoDigits().convertToWords(number);
        assertThat(actual, is(numberInWords));
    }
}
