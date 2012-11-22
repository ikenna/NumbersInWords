package net.ikenna.numberinwords;

import net.ikenna.numberinwords.numberpatterns.FiveDigits;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FiveDigitsTest {

    @Test
    public void testShouldConvertTensOfThousands() throws Exception {
        assertNumberInWords(10000, "ten thousand");
        assertNumberInWords(10100, "ten thousand one hundred");
        assertNumberInWords(10100, "ten thousand one hundred");
        assertNumberInWords(10101, "ten thousand one hundred and one");
        assertNumberInWords(10111, "ten thousand one hundred and eleven");
        assertNumberInWords(99000, "ninety nine thousand");
        assertNumberInWords(99999, "ninety nine thousand nine hundred and ninety nine");
    }

    private void assertNumberInWords(int number, String words) {
        String result = new FiveDigits().convertToWords(number);
        assertThat(result, is(words));
    }
}
