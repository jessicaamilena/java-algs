package com.sumThreeFive;

public class SumThreeFive {
    public static void main(String[] args) {
        int countNum = 0;
        int countTim = 0;

        for (int i = 2; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                countNum += i;
                countTim++;
                System.out.println("Number " + i + " met the conditions.");
                if (countTim == 5) {
                    System.out.println("Exiting for loop.");
                    System.out.println("The sum of all numbers is " + countNum);
                    break;
                }
            }
        }
    }
}
