package net.ikenna.NumbersInWords;

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
