package net.ikenna.NumbersInWords;

class NumberInThousands implements NumberWordPattern {

    @Override
    public boolean matches(Integer number) {
        return 1000 <= number && number <= 99999;
    }

    @Override
    public String convertToWords(Integer number) {
        int remainder = number % 1000;
        int multipleOfThousand = number - remainder;
        return getNumberOfThousands(multipleOfThousand) + getRemainder(remainder);
    }

    private String getNumberOfThousands(Integer number) {
        if (number > 0) {
            int twoWordNumber = number / 1000;
            return new TwoWordNumbersBetween20And100().convertToWords(twoWordNumber) + " thousand";
        }
        return "";
    }

    private String getRemainder(Integer remainder) {
        if (remainder > 0) {
            return " " + new NumberInTheHundreds().convertToWords(remainder);
        } else {
            return "";
        }
    }

}
