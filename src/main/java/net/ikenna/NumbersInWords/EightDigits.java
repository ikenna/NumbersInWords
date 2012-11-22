package net.ikenna.NumbersInWords;

public class EightDigits extends AbstractWordPattern {
    public EightDigits() {
        super(new NumberRange(10000000, 99999999), 1000000);
    }

    @Override
    protected String getMainNumber(Integer mainNumber) {
        return new DoubleDigits().convertToWords(mainNumber / divisor) + " million ";
    }

    @Override
    protected String getRemainder(Integer remainder) {
        return new SixDigits().convertToWords(remainder);
    }
}
