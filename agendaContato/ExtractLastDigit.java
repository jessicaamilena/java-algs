package com.agendaContato;

public class ExtractLastDigit {
    public static void isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;

        while (number > reverse){
            lastDigit = number % 10;
            reverse += lastDigit;
            reverse *= 10;
            System.out.println(lastDigit);
            System.out.println(reverse);
        }

    }
}

