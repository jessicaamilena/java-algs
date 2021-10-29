package com.StringUpperCase;
import java.util.Scanner;
/*
     The elements of a String are called characters. The number of characters in a String is called the length,
     and it can be retrieved with the String.length() method.
    Given two strings of lowercase English letters, A and B, perform the following operations:
    - Sum the lengths of A and B.
    - Determine if A is lexicographically larger than B.
    - Capitalize the first letter in A and B and print them on a single line, separated by a space.

Output Format

    For the first line, sum the lengths of  and .
    For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
    For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
 */
public class StringUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N1:");
        String A=sc.next();
        System.out.println("N2:");
        String B=sc.next();

        int sumA = A.length();
        int sumB = B.length();
        System.out.println(sumA + sumB);

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.print(A + " " + B);
    }
}