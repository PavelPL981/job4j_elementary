package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        return value / 90;
    }

    public static double rubleToDollar(double value) {
        return value / 75;
    }

    public static void main(String[] args) {
        System.out.println(rubleToDollar(100));
        System.out.println(rubleToEuro(200));
    }
}
