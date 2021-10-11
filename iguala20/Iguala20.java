package com.iguala20;

import java.util.Scanner;

public class Iguala20 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero.");
		num = scan.nextInt();
		
		if(num == 20) {
			System.out.println("Igual a 20.");
		}else if(num < 20) {
			System.out.println("Menor que 20.");
		}else {
			System.out.println("Maior que 20.");
		}
	}
}
