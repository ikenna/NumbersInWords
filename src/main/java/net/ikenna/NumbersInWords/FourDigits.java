package net.ikenna.NumbersInWords;

public class FourDigits extends AbstractWordPattern {
    public FourDigits() {
        super(new NumberRange(1000, 9999), 1000);
    }

    @Override
    protected String getMainNumber(Integer mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainder(Integer remainder) {
        return new ThreeDigits().convertToWords(remainder);
    }
}
