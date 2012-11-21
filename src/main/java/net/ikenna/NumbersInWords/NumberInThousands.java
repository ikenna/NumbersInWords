package net.ikenna.NumbersInWords;

class NumberInThousands implements NumberWordPattern {

    private NumberInTheHundreds hundredsPattern = new NumberInTheHundreds();

    @Override
    public String convertToWords(Integer number) {
        int remainder = number % 1000;
        int multipleOfThousand = number - remainder;
        return getNumberOfThousands(multipleOfThousand) + getRemainder(remainder);
    }

    private String getNumberOfThousands(Integer number) {
        return new TwoWordNumbersBetween20And100().convertToWords(number / 1000) + " thousand";
    }

    private String getRemainder(Integer remainder) {
        if (remainder > 0) {
            return " " + hundredsPattern.convertToWords(remainder);
        } else {
            return "";
        }
    }

    @Override
    public boolean matches(Integer number) {
        return 1000 <= number && number <= 99999;
    }
}
