package net.ikenna.NumbersInWords;

class FiveDigits extends AbstractWordPattern {

    public FiveDigits() {
        super(new NumberRange(10000, 99999), 1000);
    }

    @Override
    protected String getMainNumber(Integer mainNumber) {
        return new DoubleDigits().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainder(Integer remainder) {
        return new FourDigits().convertToWords(remainder);
    }

}
