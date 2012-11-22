package net.ikenna.NumbersInWords;

class ThreeDigits extends AbstractWordPattern {

    public ThreeDigits() {
        super(new NumberRange(100, 999), 100);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / divisor) + " hundred";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        String doubleInWords = new DoubleDigits().convertToWords(remainder);
        StringBuilder result = new StringBuilder();
        if (remainder > 0) {
            result.append(" and ");
        }
        return result.append(doubleInWords).toString();
    }
}


