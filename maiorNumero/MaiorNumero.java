package com.maiorNumero;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		System.out.println("O numero a seguir é o maior entre os informados.");
		if(num1 > num2) {
			System.out.println(num1); 
		}else {
			System.out.println(num2);
		}
		
	}
}
