package net.ikenna.NumbersInWords;

public class NineDigits extends AbstractWordPattern {
    public NineDigits() {
        super(new NumberRange(100000000, 999999999), 1000000);
    }

    @Override
    protected String getMainNumber(Integer mainNumber) {
        return new ThreeDigits().convertToWords(mainNumber / divisor) + " million ";
    }

    @Override
    protected String getRemainder(Integer remainder) {
        return new SevenDigits().convertToWords(remainder);
    }
}
