package net.ikenna.NumbersInWords;

import static net.ikenna.NumbersInWords.FormattingElements.SPACE;

public class DoubleDigits extends AbstractWordPattern {
    private final PresetNumbers presetNumbers = new PresetNumbers();

    public DoubleDigits() {
        super(10, 99);
    }

    @Override
    public String convertToWords(Integer number) {
        if (presetNumbers.matches(number)) {
            return presetNumbers.convertToWords(number);
        } else {
            return super.convertToWords(number);
        }
    }

    @Override
    protected String getMainNumber(int mainNumber) {
        return presetNumbers.convertToWords(mainNumber);
    }

    @Override
    protected String getRemainder(int remainder) {
        return SPACE + presetNumbers.convertToWords(remainder);
    }

}

