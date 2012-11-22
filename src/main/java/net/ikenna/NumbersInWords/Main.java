package net.ikenna.NumbersInWords;

public class Main {

    public static void main(String[] args) {
        Integer input = Integer.valueOf(args[0]);
        String output = new NumberToWordsConverter().convert(input);
        System.out.println(output);
    }
}
