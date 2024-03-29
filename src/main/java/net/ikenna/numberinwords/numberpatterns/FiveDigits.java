package net.ikenna.numberinwords.numberpatterns;

public class FiveDigits extends AbstractWordPattern {

    public FiveDigits() {
        super(new NumberRange(10000, 99999), 1000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new TwoDigits().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new FourDigits().convertToWords(remainder);
    }

}
