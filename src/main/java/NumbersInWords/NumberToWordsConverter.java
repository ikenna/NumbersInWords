package NumbersInWords;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class NumberToWordsConverter {

    private List<? extends NumberWordPattern> numberWordPatterns;

    public NumberToWordsConverter() {
        numberWordPatterns = asList(new OneWordNumbers(), new TwoWordNumbersBetween20And100(), new NumberInTheHundreds(), new NumberInThousands());
    }

    public String convert(Integer number) {
        NumberWordPattern pattern = getPatternFor(number);
        return pattern.convertToWords(number);
    }

    private NumberWordPattern getPatternFor(Integer number) {
        NumberWordPattern result = null;
        for (NumberWordPattern pattern : numberWordPatterns) {
            if (pattern.matches(number)) {
                result = pattern;
            }
        }
        return result == null ? new NonExistentPattern() : result;
    }

}

class OneWordNumbers implements NumberWordPattern {
    private final Map<Integer, String> wordMap;

    OneWordNumbers() {
        wordMap = new HashMap<Integer, String>();
        wordMap.put(1, "one");
        wordMap.put(2, "two");
        wordMap.put(3, "three");
        wordMap.put(4, "four");
        wordMap.put(5, "five");
        wordMap.put(6, "six");
        wordMap.put(7, "seven");
        wordMap.put(8, "eight");
        wordMap.put(9, "nine");
        wordMap.put(10, "ten");
        wordMap.put(11, "eleven");
        wordMap.put(12, "twelve");
        wordMap.put(13, "thirteen");
        wordMap.put(14, "fourteen");
        wordMap.put(15, "fifteen");
        wordMap.put(16, "sixteen");
        wordMap.put(17, "seventeen");
        wordMap.put(18, "eighteen");
        wordMap.put(19, "nineteen");
        wordMap.put(20, "twenty");
        wordMap.put(30, "thirty");
        wordMap.put(40, "forty");
        wordMap.put(50, "fifty");
        wordMap.put(60, "sixty");
        wordMap.put(70, "seventy");
        wordMap.put(80, "eighty");
        wordMap.put(90, "ninety");

    }

    public String convertToWords(Integer number) {
        return number == 0 ? "" : wordMap.get(number);
    }

    @Override
    public boolean matches(Integer number) {
        return wordMap.get(number) != null;
    }
}


class TwoWordNumbersBetween20And100 implements NumberWordPattern {

    private OneWordNumbers oneWordNumbers = new OneWordNumbers();

    public boolean matches(Integer number) {
        return 20 < number && number < 100;
    }

    public String convertToWords(Integer number) {
        int remainder = number % 10;
        int multipleOfTen = number - remainder;
        String result = oneWordNumbers.convertToWords(multipleOfTen) + " " + oneWordNumbers.convertToWords(remainder);
        return result.trim();
    }
}

class NumberInTheHundreds implements NumberWordPattern {

    private TwoWordNumbersBetween20And100 twoWordNumbers = new TwoWordNumbersBetween20And100();

    @Override
    public String convertToWords(Integer number) {
        String result = getNumberOfHundreds(number) + getRemainder(number);
        return result.trim();
    }

    private String getRemainder(int number) {
        int remainder = number % 100;
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

class NumberInThousands implements NumberWordPattern {

    private NumberInTheHundreds hundredsPattern = new NumberInTheHundreds();

    @Override
    public String convertToWords(Integer number) {
        return getNumberOfThousands(number) + getRemainder(number);
    }

    private String getRemainder(Integer number) {
        int remainder = number % 1000;
        if (remainder > 0) {
            return " " + hundredsPattern.convertToWords(remainder);
        } else {
            return "";
        }
    }

    private String getNumberOfThousands(Integer number) {
        return "one thousand";
    }

    @Override
    public boolean matches(Integer number) {
        return 1000 <= number && number < 9999;
    }
}

class NonExistentPattern implements NumberWordPattern {

    @Override
    public String convertToWords(Integer number) {
        return "Don't know how to convert " + number + " to words";
    }

    @Override
    public boolean matches(Integer number) {
        return false;
    }
}

interface NumberWordPattern {
    String convertToWords(Integer number);

    boolean matches(Integer number);
}