package net.ikenna.NumbersInWords;

interface NumberWordPattern {

    boolean matches(Integer number);

    String convertToWords(Integer number);
}
