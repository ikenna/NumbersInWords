package net.ikenna.numberinwords;


import net.ikenna.numberinwords.numberpatterns.*;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * This NumberToWordsConverter class converts numbers from 1 to 999,999,999 to words.
 *
 * @author Ikenna Nwaiwu
 */
public class NumberToWordsConverter {

    private final List<? extends NumberWordPattern> numberWordPatterns = asList(
            new PresetNumbers(),
            new TwoDigits(),
            new ThreeDigits(),
            new FourDigits(),
            new FiveDigits(),
            new SixDigits(),
            new SevenDigits(),
            new EightDigits(),
            new NineDigits());

    public String convert(Integer number) {
        NumberWordPattern pattern = getPatternFor(number);
        return pattern.convertToWords(number);
    }

    private NumberWordPattern getPatternFor(Integer number) {
        NumberWordPattern result = new NonExistentPattern();
        for (NumberWordPattern pattern : numberWordPatterns) {
            if (pattern.isInRange(number)) {
                result = pattern;
            }
        }
        return result;
    }

}


