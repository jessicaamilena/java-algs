package com.numberPalindrome;

public class NumberPalindrome {
        public static void main(String[] args) {
            System.out.println(isPalindrome(-222));
        }
        public static boolean isPalindrome(int number) {
            int reverse = 0;
            int original = number;

            while(number != 0) {
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number /= 10;
            }

            if (original == reverse) {
                return true;
            }else {
                return false;
            }
        }
}
