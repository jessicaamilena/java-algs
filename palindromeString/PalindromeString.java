package com.palindromeString;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String palindrome = new StringBuffer(A).reverse().toString();

        if(A.equals(palindrome)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
