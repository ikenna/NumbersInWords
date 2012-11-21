package net.ikenna.NumbersInWords;

class TwoWordNumbersBetween20And100 implements NumberWordPattern {

    private OneWordNumbers oneWordNumbers = new OneWordNumbers();

    public boolean matches(Integer number) {
        return 20 < number && number < 100;
    }

    public String convertToWords(Integer number) {
        if (oneWordNumbers.matches(number)) {
            return oneWordNumbers.convertToWords(number);
        } else {
            int remainder = number % 10;
            int multipleOfTen = number - remainder;
            String result = oneWordNumbers.convertToWords(multipleOfTen) + " " + oneWordNumbers.convertToWords(remainder);
            return result.trim();
        }
    }
}
