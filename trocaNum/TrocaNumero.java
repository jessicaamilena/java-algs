package com.trocaNum;

import java.util.Scanner;

public class TrocaNumero {
	public static void main(String[] args) {
		
		int numA = 0;
		int numB = 0;
		int numC = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero.");
		numA = scan.nextInt();
		System.out.println("Digite o segundo numero.");
		numB = scan.nextInt();
		
		numC = numA;
		numA = numB;
		numB = numC;
		
		System.out.println("O primeiro numero é o " + numA + ", e o segundo numero é o " + numB);
	}
}
