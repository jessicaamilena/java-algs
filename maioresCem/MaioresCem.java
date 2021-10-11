package com.maioresCem;

import java.util.Scanner;

public class MaioresCem {
	public static void main(String[] args) {
		int numb = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um numero");
			int aux = scan.nextInt();
			
			if(aux >= 0 && aux <= 100) {
				numb += 1;
			}
		}
		System.out.println(numb + " numeros digitados estão entre 0 e 100.");
	}
}
