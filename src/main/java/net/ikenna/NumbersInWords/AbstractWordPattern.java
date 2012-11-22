package net.ikenna.NumbersInWords;

public abstract class AbstractWordPattern implements NumberWordPattern {
    protected final Integer min;
    protected final Integer max;
    protected final Integer divisor;

    public AbstractWordPattern(Integer min, Integer max, Integer divisor) {
        this.min = min;
        this.max = max;
        this.divisor = divisor;
    }

    @Override
    public boolean matches(Integer number) {
        return min <= number && number <= max;
    }

    @Override
    public String convertToWords(Integer number) {
        assert (number <= max);
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
