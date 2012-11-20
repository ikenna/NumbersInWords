package NumbersInWords;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberToWordsConverterTest {

    @Test
    public void testShouldConvertNumberToWords() throws Exception {

        String actual = new NumberToWordsConverter().convert(1);
        assertThat(actual, is("one"));
    }
}
