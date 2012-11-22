package net.ikenna.NumbersInWords;


import java.util.List;

import static java.util.Arrays.asList;

public class NumberToWordsConverter {

    private List<? extends NumberWordPattern> numberWordPatterns;

    public NumberToWordsConverter() {
        numberWordPatterns = asList(new PresetNumbers(), new DoubleDigits(), new ThreeDigits(), new FiveDigits(), new SixDigits());
    }

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


