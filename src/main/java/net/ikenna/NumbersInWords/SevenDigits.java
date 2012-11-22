package net.ikenna.NumbersInWords;

public class SevenDigits extends AbstractWordPattern {
    public SevenDigits() {
        super(new NumberRange(1000000, 9999999), 1000000);
    }

    @Override
    protected String getMainNumber(Integer mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / divisor) + " million ";
    }

    @Override
    protected String getRemainder(Integer remainder) {
        return new SixDigits().convertToWords(remainder);
    }
}
