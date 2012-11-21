package net.ikenna.NumbersInWords;

class TwoWordNumbersBetween20And100 implements NumberWordPattern {

    private PresetNumbers presetNumbers = new PresetNumbers();

    public boolean matches(Integer number) {
        return 20 < number && number < 100;
    }

    public String convertToWords(Integer number) {
        if (presetNumbers.matches(number)) {
            return presetNumbers.convertToWords(number);
        } else {
            int remainder = number % 10;
            int multipleOfTen = number - remainder;
            String result = presetNumbers.convertToWords(multipleOfTen) + " " + presetNumbers.convertToWords(remainder);
            return result.trim();
        }
    }
}
