package net.ikenna.numbersInWords;

public abstract class AbstractWordPattern implements NumberWordPattern {

    private final NumberRange range;
    protected final Integer divisor;

    public AbstractWordPattern(NumberRange range, Integer divisor) {
        this.range = range;
        this.divisor = divisor;
    }

    @Override
    public boolean isInRange(Integer number) {
        return range.matches(number);
    }

    @Override
    public String convertToWords(Integer number) {
        range.assertNumberDoesNotExceedMax(number);
        int remainder = number % divisor;
        int mainNumber = number - remainder;
        String mainNumberInWords = getMainNumberInWords(mainNumber);
        String remainderInWords = getRemainderInWords(remainder);

        StringBuilder result = new StringBuilder();
        if (mainNumber > 0) {
            result.append(mainNumberInWords);
        }
        if (remainder > 0) {
            result.append(remainderInWords);
        }
        return result.toString().trim();
    }

    abstract protected String getMainNumberInWords(Integer mainNumber);

    abstract protected String getRemainderInWords(Integer remainder);
}

