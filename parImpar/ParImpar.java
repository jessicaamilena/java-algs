package com.parImpar;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero.");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Este numero � par.");
		}else {
		System.out.println("este numero � impar.");
		}
	}
}
