package net.ikenna.NumbersInWords;

import static net.ikenna.NumbersInWords.FormattingElements.AND;

class ThreeDigits extends AbstractWordPattern {

    public ThreeDigits() {
        super(100, 999);
    }

    @Override
    protected String getMainNumber(int mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / MIN) + " hundred";
    }

    @Override
    protected String getRemainder(int remainder) {
        String doubleInWords = new DoubleDigits().convertToWords(remainder);
        StringBuilder result = new StringBuilder();
        if (remainder > 0) {
            result.append(AND);
        }
        return result.append(doubleInWords).toString();
    }
}


