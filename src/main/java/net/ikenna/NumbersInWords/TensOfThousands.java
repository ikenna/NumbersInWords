package net.ikenna.NumbersInWords;

class TensOfThousands implements NumberWordPattern {

    private final int MIN = 1000;
    private final int MAX = 99999;

    @Override
    public boolean matches(Integer number) {
        return MIN <= number && number <= MAX;
    }

    @Override
    public String convertToWords(Integer number) {
        int remainder = number % MIN;
        int mainNumber = number - remainder;
        return getMainNumber(mainNumber) + getRemainder(remainder);
    }

    private String getMainNumber(Integer number) {
        if (number > 0) {
            int twoWordNumber = number / MIN;
            return new TwoWordNumbersBetween20And100().convertToWords(twoWordNumber) + " thousand";
        }
        return "";
    }

    private String getRemainder(Integer remainder) {
        if (remainder > 0) {
            return " " + new ThreeDigits().convertToWords(remainder);
        } else {
            return "";
        }
    }

}
