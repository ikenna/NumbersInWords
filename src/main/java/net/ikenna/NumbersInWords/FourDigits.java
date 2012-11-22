package net.ikenna.NumbersInWords;

public class FourDigits extends AbstractWordPattern {
    public FourDigits() {
        super(1000, 9999);
    }

    @Override
    protected String getMainNumber(int mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / MIN) + " thousand ";
    }

    @Override
    protected String getRemainder(int remainder) {
        return new ThreeDigits().convertToWords(remainder);
    }
}
