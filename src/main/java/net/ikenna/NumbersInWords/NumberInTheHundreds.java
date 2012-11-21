package net.ikenna.NumbersInWords;

class NumberInTheHundreds implements NumberWordPattern {

    private TwoWordNumbersBetween20And100 twoWordNumbers = new TwoWordNumbersBetween20And100();

    @Override
    public String convertToWords(Integer number) {
        if (twoWordNumbers.matches(number)) {
            return twoWordNumbers.convertToWords(number);
        } else {
            int remainder = number % 100;
            int multipleOfHundred = number - remainder;
            String result = getNumberOfHundreds(multipleOfHundred) + getRemainder(remainder);
            return result.trim();
        }
    }

    private String getRemainder(int remainder) {
        if (remainder > 0) {
            return " and " + twoWordNumbers.convertToWords(remainder);
        } else {
            return "";
        }
    }

    private String getNumberOfHundreds(Integer number) {
        if (number >= 100) {
            int multipleOfHundred = number / 100;
            return twoWordNumbers.convertToWords(multipleOfHundred) + " hundred";
        } else return "";
    }

    @Override
    public boolean matches(Integer number) {
        return 100 <= number && number < 1000;
    }
}
