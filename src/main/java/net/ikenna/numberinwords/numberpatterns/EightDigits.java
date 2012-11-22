package net.ikenna.numberinwords.numberpatterns;

public class EightDigits extends AbstractWordPattern {
    public EightDigits() {
        super(new NumberRange(10000000, 99999999), 1000000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new TwoDigits().convertToWords(mainNumber / divisor) + " million ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new SixDigits().convertToWords(remainder);
    }
}
