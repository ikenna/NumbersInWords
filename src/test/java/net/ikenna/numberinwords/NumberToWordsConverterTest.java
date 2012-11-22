package net.ikenna.numberinwords;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberToWordsConverterTest {

    @Test
    public void testShouldConvertNumbers() throws Exception {
        assertNumberInWords(1, "one");
        assertNumberInWords(9, "nine");
        assertNumberInWords(10, "ten");
        assertNumberInWords(21, "twenty one");
        assertNumberInWords(99, "ninety nine");
        assertNumberInWords(105, "one hundred and five");
        assertNumberInWords(999, "nine hundred and ninety nine");
        assertNumberInWords(99999, "ninety nine thousand nine hundred and ninety nine");
        assertNumberInWords(900999, "nine hundred thousand nine hundred and ninety nine");
        assertNumberInWords(9999999, "nine million nine hundred and ninety nine thousand nine hundred and ninety nine");
        assertNumberInWords(56945781, "fifty six million nine hundred and forty five thousand seven hundred and eighty one");
        assertNumberInWords(99999999, "ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");
        assertNumberInWords(999999999, "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");
    }

    @Test
    public void testShouldNotConvertNumbersOutsideRange() throws Exception {
        assertNumberInWords(1000000000, "Don't know how to convert 1000000000 to words");
        assertNumberInWords(-1, "Don't know how to convert -1 to words");
    }

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new NumberToWordsConverter().convert(number);
        assertThat(actual, is(numberInWords));
    }
}
