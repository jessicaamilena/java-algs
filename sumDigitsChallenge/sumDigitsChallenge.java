package com.sumDigitsChallenge;

public class sumDigitsChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(251));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int n = 0;
        while (number > 0) {
            int sum = number % 10;
            number /= 10;
            n += sum;
        }
        return n;
    }
}
