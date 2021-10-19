package com.greatestCommonDivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(12, 30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
