package NumbersInWords;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberToWordsConverterTest {

    @Test
    public void testShouldConvertNumberToWords() throws Exception {
        assertNumberInWords(1, "one");
        assertNumberInWords(2, "two");
        assertNumberInWords(3, "three");
        assertNumberInWords(4, "four");
        assertNumberInWords(5, "five");
        assertNumberInWords(6, "six");
        assertNumberInWords(7, "seven");
        assertNumberInWords(8, "eight");
        assertNumberInWords(9, "nine");
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
        assertNumberInWords(23, "twenty three");
        assertNumberInWords(24, "twenty four");
        assertNumberInWords(29, "twenty nine");

        assertNumberInWords(30, "thirty");
        assertNumberInWords(31, "thirty one");
        assertNumberInWords(32, "thirty two");
        assertNumberInWords(39, "thirty nine");

        assertNumberInWords(40, "forty");
        assertNumberInWords(41, "forty one");
        assertNumberInWords(49, "forty nine");


    }

    @Test
    public void testShouldNotConvertNumbersOutsideRange() throws Exception {
        assertNumberInWords(1000000000, "Don't know how to convert 1000000000 to words");
        assertNumberInWords(-1, "Don't know how to convert -1 to words");
    }

// test should give error if cannot work out number or number not within range, e.g negative numbers

    // remmber to comment your code

    private void assertNumberInWords(int number, String numberInWords) {
        String actual = new NumberToWordsConverter().convert(number);
        assertThat(actual, is(numberInWords));
    }
}
