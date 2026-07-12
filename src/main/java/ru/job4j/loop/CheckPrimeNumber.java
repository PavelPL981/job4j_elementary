package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }

        for (int index = 2; index * index <= number; index++) {
            if (number % index == 0) {
                return false;
            }
        }

        return number > 1;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
        System.out.println(check(4));
        System.out.println(check(1));
        System.out.println(check(25));
        System.out.println(check(7));
        System.out.println(check(13));
    }
}
