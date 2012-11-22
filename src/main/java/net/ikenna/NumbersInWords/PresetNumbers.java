package net.ikenna.numbersInWords;

import java.util.HashMap;
import java.util.Map;

public class PresetNumbers implements NumberWordPattern {
    private final Map<Integer, String> wordMap;

    public PresetNumbers() {
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

    @Override
    public boolean isInRange(Integer number) {
        return wordMap.get(number) != null;
    }

    @Override
    public String convertToWords(Integer number) {
        return number == 0 ? "" : wordMap.get(number);
    }
}
