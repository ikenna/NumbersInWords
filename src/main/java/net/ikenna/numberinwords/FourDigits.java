package net.ikenna.numberinwords;

import net.ikenna.numberinwords.numberpatterns.NumberRange;

public class FourDigits extends AbstractWordPattern {
    public FourDigits() {
        super(new NumberRange(1000, 9999), 1000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / divisor) + " thousand ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new ThreeDigits().convertToWords(remainder);
    }
}
