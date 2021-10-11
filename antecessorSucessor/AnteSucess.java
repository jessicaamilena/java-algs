package com.antecessorSucessor;

import java.util.Scanner;

public class AnteSucess {
	public static void main(String[] args) {
		
		int num;
		int soma;
		int sub;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero.");
		num = scan.nextInt();
		
		soma = num + 1;
		sub = num - 1;
		
		System.out.println("O numero antecessor de " + num + " é " + sub + " e o numero sucessor é " + soma + ".");
	}
}
