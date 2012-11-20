package NumbersInWords;


import java.util.HashMap;
import java.util.Map;

public class NumberToWordsConverter {
    private final Map<Integer, String> wordMap;

    public NumberToWordsConverter() {
        wordMap = new HashMap<Integer, String>();
        wordMap.put(0, "zero");
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
    }

    public String convert(Integer number) {
        if (isInTheTwenties(number)) {
            return wordsInTheTwenties(number);
        }
        if (isInTheThirties(number)) {
            return wordsInTheThirties(number);
        } else {
            return getFromWordMap(number);
        }
    }

    private String getFromWordMap(Integer number) {
        if (number == 0) {
            return "";
        } else {
            return wordMap.get(number);
        }
    }

    private String wordsInTheThirties(Integer number) {
        int remainder = number % 10;
        String result = "thirty " + getFromWordMap(remainder);
        return result.trim();
    }

    private boolean isInTheThirties(Integer number) {
        return 30 <= number && number <= 39;
    }

    private boolean isInTheTwenties(Integer number) {
        return 20 <= number && number <= 29;
    }

    private String wordsInTheTwenties(Integer number) {
        int remainder = number % 10;
        String result = "twenty " + getFromWordMap(remainder);
        return result.trim();
    }
}
