package NumbersInWords;


import java.util.HashMap;
import java.util.Map;

public class NumberToWordsConverter {
    private final Map<Integer, String> wordMap;

    public NumberToWordsConverter() {
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

    }

    public String convert(Integer number) {
        if (isBetween20And30(number)) {
            return wordsBetween20And30(number);
        } else {
            return wordMap.get(number);
        }
    }

    private boolean isBetween20And30(Integer number) {
        return 20 < number && number < 30;
    }

    private String wordsBetween20And30(Integer number) {
        int remainder = number % 10;
        return "twenty " + wordMap.get(remainder);
    }
}
