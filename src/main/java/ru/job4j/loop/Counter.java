package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        if (start < sum || start > finish) {
            return 0;
        }
        for (sum = start; sum <= finish; sum++) {
            sum += sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(-1, 0));
        System.out.println(sum(2, 1));
    }
}
