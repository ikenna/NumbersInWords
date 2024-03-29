package net.ikenna.numberinwords.numberpatterns;

public class TwoDigits extends AbstractWordPattern {
    private final PresetNumbers presetNumbers = new PresetNumbers();

    public TwoDigits() {
        super(new NumberRange(10, 99), 10);
    }

    @Override
    public String convertToWords(Integer number) {
        if (presetNumbers.isInRange(number)) {
            return presetNumbers.convertToWords(number);
        } else {
            return super.convertToWords(number);
        }
    }

    @Override
    protected String getMainNumberInWords(Integer mainNumber) {
        return presetNumbers.convertToWords(mainNumber);
    }

    @Override
    protected String getRemainderInWords(Integer remainder) {
        return " " + presetNumbers.convertToWords(remainder);
    }

}

