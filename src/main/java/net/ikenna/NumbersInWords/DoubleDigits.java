package net.ikenna.NumbersInWords;

import static net.ikenna.NumbersInWords.FormattingElements.SPACE;

public class DoubleDigits extends AbstractWordPattern {
    private final PresetNumbers presetNumbers = new PresetNumbers();

    public DoubleDigits() {
        super(new NumberRange(10, 99), 10);
    }

    @Override
    public String convertToWords(Integer number) {
        if (presetNumbers.isInRange(number)) {
            return presetNumbers.convertToWords(number);
        } else {
            return super.convertToWords(number);
        }
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return presetNumbers.convertToWords(mainNumber);
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return SPACE + presetNumbers.convertToWords(remainder);
    }

}

