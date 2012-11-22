package net.ikenna.numberinwords.numberpatterns;

public interface NumberWordPattern {

    boolean isInRange(Integer number);

    String convertToWords(Integer number);
}
