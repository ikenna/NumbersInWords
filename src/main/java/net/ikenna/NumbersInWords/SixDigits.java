package net.ikenna.NumbersInWords;

public class SixDigits extends AbstractWordPattern {

    public SixDigits() {
        super(new NumberRange(100000, 999999), 1000);
    }

    @Override
    protected String getMainNumber(Integer mainNumber) {
        return new ThreeDigits().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainder(Integer remainder) {
        return new ThreeDigits().convertToWords(remainder);
    }

}
