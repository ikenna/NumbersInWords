package net.ikenna.NumbersInWords;

public class HundredsOfThousands implements NumberWordPattern {

    private final int MIN = 100000;
    private final int MAX = 999999;

    @Override
    public boolean matches(Integer number) {
        return MIN <= number && number <= MAX;
    }

    @Override
    public String convertToWords(Integer number) {
        int remainder = number % MIN;
        int hundredOfThousand = number - remainder;
        return getMainNumber(hundredOfThousand) + getRemainder(remainder);
    }

    private String getRemainder(int remainder) {
        if (remainder > 0) {
            return new TensOfThousands().convertToWords(remainder);
        } else {
            return "";
        }
    }

    private String getMainNumber(int number) {
        int hundreds = number / 1000;
        return new NumberInTheHundreds().convertToWords(hundreds) + " thousand";
    }
}
