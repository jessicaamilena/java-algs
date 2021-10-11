package com.decrescente;

import java.util.Scanner;

public class Decrescente {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Digite um numero.");
		num1 = scan.nextInt();
		System.out.println("Digite um numero.");
		num2 = scan.nextInt();
		System.out.println("Digite um numero.");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("A ordem decrescente " + num1 + " " + num2 + " " + num3);
			}else {
				System.out.println("A ordem decrescente " + num1 + " " + num3 + " " + num2);
			}	
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("A ordem decrescente " + num2 + " " + num1 + " " + num3);
			}else {
				System.out.println("A ordem decrescente " + num2 + " " + num3 + " " + num1);
			}
		}else {
			if (num1 > num2) {
				System.out.println("A ordem decrescente " + num3 + " " + num1 + " " + num2);
			}else {
				System.out.println("A ordem decrescente " + num3 + " " + num2 + " " + num1);
			}
		}
	}
}
