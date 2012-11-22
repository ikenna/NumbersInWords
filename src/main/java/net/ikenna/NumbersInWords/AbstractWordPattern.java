package net.ikenna.NumbersInWords;

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
        StringBuilder result = new StringBuilder();
        if (mainNumber > 0) {
            result.append(getMainNumber(mainNumber));
        }
        if (remainder > 0) {
            result.append(getRemainder(remainder));
        }
        return result.toString().trim();
    }

    abstract protected String getMainNumber(Integer mainNumber);

    abstract protected String getRemainder(Integer remainder);
}

class NumberRange {
    private final Integer min;
    private final Integer max;

    NumberRange(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public boolean matches(Integer number) {
        return min <= number && number <= max;
    }

    public void assertNumberDoesNotExceedMax(Integer number) {
        if (number > max) {
            throw new RuntimeException("Number exceeds max range");
        }
    }
}