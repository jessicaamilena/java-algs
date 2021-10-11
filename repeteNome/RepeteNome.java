package com.repeteNome;

import java.util.Scanner;

public class RepeteNome {
	public static void main(String[] args) {
		String nome;
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		nome = scan.next();
		
		System.out.println("Qual seu numero de ID?");
		num = scan.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Olá, " + nome + ", ID " + num);
		}
	}
}
