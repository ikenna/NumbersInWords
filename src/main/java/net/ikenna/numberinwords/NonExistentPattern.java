package net.ikenna.numberinwords;

public class NonExistentPattern implements NumberWordPattern {

    @Override
    public String convertToWords(Integer number) {
        return "Don't know how to convert " + number + " to words";
    }

    @Override
    public boolean isInRange(Integer number) {
        return false;
    }
}
