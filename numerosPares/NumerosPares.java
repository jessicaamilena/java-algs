package com.numerosPares;

import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um numero.");
			int aux = scan.nextInt();
			
			if(aux % 2 == 0) {
				num += 1;
			}
		}
		System.out.println(num);
	}
}
