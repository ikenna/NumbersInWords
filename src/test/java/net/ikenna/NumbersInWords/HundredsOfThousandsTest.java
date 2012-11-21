package net.ikenna.NumbersInWords;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HundredsOfThousandsTest {

    @Test
    public void testShouldMatchNumbersInRange() throws Exception {
        assertThat(new HundredsOfThousands().matches(99999), is(false));
        assertThat(new HundredsOfThousands().matches(100000), is(true));
        assertThat(new HundredsOfThousands().matches(999999), is(true));
        assertThat(new HundredsOfThousands().matches(1000000), is(false));
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
        String result = new HundredsOfThousands().convertToWords(number);
        assertThat(result, is(value));
    }
}
