package net.ikenna.numberinwords;


import net.ikenna.numberinwords.numberpatterns.*;

import java.util.List;

import static java.util.Arrays.asList;

public class NumberToWordsConverter {

    private List<? extends NumberWordPattern> numberWordPatterns = asList(
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
        NumberWordPattern result = null;
        for (NumberWordPattern pattern : numberWordPatterns) {
            if (pattern.isInRange(number)) {
                result = pattern;
            }
        }
        return result == null ? new NonExistentPattern() : result;
    }

}


