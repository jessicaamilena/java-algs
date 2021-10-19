package com.evenDigit;

public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(22);
    }

    public static int getEvenDigitSum(int number) {
        int lastDigit = 0;

        if (number < 0) {
            return -1;
        }

        while(number > 0){
            if(number % 2 == 0) {
                lastDigit += number % 10;
            }
            number /= 10;
        }
        return lastDigit;
    }
}
