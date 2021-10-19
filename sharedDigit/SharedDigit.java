package com.sharedDigit;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(11, 12);
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 >99) {
            return false;
        }

        int lastNum1 = num1 % 10;
        num1 /= 10;
        int lastNum2 = num2 % 10;
        num2 /= 10;

        if (lastNum1 == lastNum2 || lastNum1 == num2 || num1 == lastNum2 || num1 == num2) {
            return true;
        }
        return false;
    }
}
