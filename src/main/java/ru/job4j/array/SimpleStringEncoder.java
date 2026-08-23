package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = counter <= 1 ? (result + "" + symbol) : (result + symbol + counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result = counter <= 1 ? (result + "" + symbol) : (result + symbol + counter);
        return result;
    }

    public static void main(String[] args) {
        String first = "aaabvddrr";
        System.out.println("Length of string FIRST: " + first.length());
        String second = "aaabbbvdddrrr";
        System.out.println("Length of string SECOND: " + second.length());
        String third = "abbvdddr";
        System.out.println("Length of string THIRD: " + third.length());

        String input = "aaabbbvdddrrr";
        System.out.println("Symbol with index = 2: " + input.charAt(2));
        System.out.println("Symbol with index = 3: " + input.charAt(3));
        System.out.println("Symbol with index = 6: " + input.charAt(6));
        System.out.println("Symbol with index = 9: " + input.charAt(9));
        System.out.println("Symbol with index = 10: " + input.charAt(10));
    }
}
