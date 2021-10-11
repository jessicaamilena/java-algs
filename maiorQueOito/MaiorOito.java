package com.maiorQueOito;

import java.util.Scanner;

public class MaiorOito {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um numero.");
			int aux = scan.nextInt();
			if(aux > 8) {
			num += 1;
			}
		}
		System.out.println(num);
	}
}
