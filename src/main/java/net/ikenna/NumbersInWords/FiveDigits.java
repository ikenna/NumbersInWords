package net.ikenna.numbersInWords;

class FiveDigits extends AbstractWordPattern {

    public FiveDigits() {
        super(new NumberRange(10000, 99999), 1000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new DoubleDigits().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new FourDigits().convertToWords(remainder);
    }

}
