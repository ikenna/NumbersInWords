package net.ikenna.numberinwords.numberpatterns;

class NumberRange {
    private final Integer min;
    private final Integer max;

    public NumberRange(Integer min, Integer max) {
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
