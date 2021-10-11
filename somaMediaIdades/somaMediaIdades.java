package com.somaMediaIdades;

import java.util.Scanner;

public class somaMediaIdades {
	public static void main(String[] args) {
		int idades = 0;
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Informe a idade.");
			idades = scan.nextInt();
			soma += idades;
		}
		System.out.println("A soma das idades é " + soma);
		
		soma = soma / 20;
		System.out.println("A media das idades é " + soma);
	}
}
