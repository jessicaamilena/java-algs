package com.somaNumeros;

import java.util.Scanner;

public class Soma10num {
	public static void main(String[] args) {
		int num = 0;
		int soma = 0;
		Scanner scan = new Scanner(System.in);		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o numero.");
			num = scan.nextInt();
			soma += num;	
		}
		System.out.println(soma);
	}
}
