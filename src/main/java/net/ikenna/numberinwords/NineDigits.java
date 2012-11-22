package net.ikenna.numberinwords;

import net.ikenna.numberinwords.numberpatterns.NumberRange;

public class NineDigits extends AbstractWordPattern {
    public NineDigits() {
        super(new NumberRange(100000000, 999999999), 1000000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new ThreeDigits().convertToWords(mainNumber / divisor) + " million ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new SevenDigits().convertToWords(remainder);
    }
}
