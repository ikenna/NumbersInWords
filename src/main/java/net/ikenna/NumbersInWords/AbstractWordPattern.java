package net.ikenna.NumbersInWords;

public abstract class AbstractWordPattern implements NumberWordPattern {
    protected final Integer MIN;
    protected final Integer MAX;

    public AbstractWordPattern(Integer min, Integer max) {
        MIN = min;
        MAX = max;
    }

    @Override
    public boolean matches(Integer number) {
        return MIN <= number && number <= MAX;
    }

    @Override
    public String convertToWords(Integer number) {
        assert (number <= MAX);
        int remainder = number % MIN;
        int mainNumber = number - remainder;
        String result = getMainNumber(mainNumber) + getRemainder(remainder);
        return result.trim();
    }

    abstract protected String getMainNumber(int mainNumber);

    abstract protected String getRemainder(int remainder);
}
