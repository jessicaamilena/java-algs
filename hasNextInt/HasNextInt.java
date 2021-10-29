package com.hasNextInt;
import java.util.Scanner;
    /*
     Read 10 numbers from the console entered by the user and print the sum of those numbers.
     Create a Scanner and use the hasNextInt() method from the scanner to check if the user has entered an int value.
     Before the user enters each number, print the message "Enter number #:" where # represents the count, i.e. 1,2, etc.
     If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
     */
public class HasNextInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int finalNum = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Digite o numero " + i + ": ");
                boolean hasNextInt = scan.hasNextInt();

                if (hasNextInt) {
                    int num = scan.nextInt();
                    finalNum += num;
                }else {
                    System.out.println("Invalid Number");
                }
            }
        System.out.println("The sum of number is " + finalNum);
    }

}

