package net.ikenna.NumbersInWords;

interface NumberWordPattern {
    String convertToWords(Integer number);

    boolean matches(Integer number);
}
