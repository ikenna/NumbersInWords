package net.ikenna.NumbersInWords;

public class HundredsOfThousands implements NumberWordPattern {
    @Override
    public boolean matches(Integer number) {
        return 100000 <= number && number <= 999999;
    }

    @Override
    public String convertToWords(Integer number) {
        int remainder = number % 100000;
        int hundredOfThousand = number - remainder;
        return getMainNumber(hundredOfThousand) + getRemainder(remainder);
    }

    private String getRemainder(int remainder) {
        if (remainder > 0) {
            return new NumberInThousands().convertToWords(remainder);
        } else {
            return "";
        }
    }

    private String getMainNumber(int number) {
        int mainNumber = number / 1000;
        return new NumberInTheHundreds().convertToWords(mainNumber) + " thousand";
    }
}
