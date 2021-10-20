package com.perfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int isPerfect = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                isPerfect += i;
                if (number == isPerfect){
                return true;
                }
            }
        }
        return false;
    }

}

