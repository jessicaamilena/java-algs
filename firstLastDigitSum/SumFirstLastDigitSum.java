package com.firstLastDigitSum;

public class SumFirstLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(531);
    }
    public static int sumFirstAndLastDigit(int number){
        int lastNumber = 0;
        int firstNumber = 0;

        if(number < 0){
            return -1;
        }else if(number < 10){
            return number * 2;
        }
        else if (number < 100) {
            lastNumber = number % 10;
            number /= 10;
            firstNumber = number + lastNumber;
            return firstNumber;
        }else {
            lastNumber = number % 10;
            while (number > 0) {
                firstNumber = number;
                number /= 10;

            }
            return firstNumber + lastNumber;
        }
    }
}
