package com.numDecresc;

import java.util.Scanner;

public class NumeroDecrescente {
	public static void main(String[] args) {
		
		int num;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero.");
		num = scan.nextInt();
		
		System.out.println("A ordem decrescente a partir de " + num + " é: ");
		
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}

	}
}
