package com.somaSequencia;

import java.util.Scanner;

public class SomaSequencia {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero.");
			int aux = scan.nextInt();
			
			if(aux < 0) {
				System.out.println("Numero invalido.");
				System.exit(0);
			}else {
				num += aux;
			}
		}
		System.out.println("A soma dos numeros digitados é " + num);
		
	}
}
