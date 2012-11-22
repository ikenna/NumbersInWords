package net.ikenna.numbersInWords;

public class SixDigits extends AbstractWordPattern {

    public SixDigits() {
        super(new NumberRange(100000, 999999), 1000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new ThreeDigits().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new ThreeDigits().convertToWords(remainder);
    }

}
