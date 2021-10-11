package com.comparaNumero;

import java.util.Scanner;

public class ComparaNumero {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero.");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero.");
		num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("Numeros iguais"); 
		}
		else if (num1 > num2) {
			System.out.println("Numeros diferentes. O maior numero é o " + num1);
		}else {
			System.out.println("Numeros diferentes. O maior numero é o " + num2);
		}
		
	}
}
