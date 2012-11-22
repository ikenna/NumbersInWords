package net.ikenna.numberinwords;

import net.ikenna.numberinwords.numberpatterns.NumberRange;

public class SevenDigits extends AbstractWordPattern {
    public SevenDigits() {
        super(new NumberRange(1000000, 9999999), 1000000);
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return new PresetNumbers().convertToWords(mainNumber / divisor) + " million ";
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return new SixDigits().convertToWords(remainder);
    }
}
