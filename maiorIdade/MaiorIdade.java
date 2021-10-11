package com.maiorIdade;

import java.util.Scanner;

public class MaiorIdade {
	public static void main(String[] args) {
		int anoNasc;
		int idade;
		String nome;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome.");
		nome = scan.next();
		
		System.out.println("Informe seu ano de nascimento, " + nome);
		anoNasc = scan.nextInt();
		
		idade = 2021 - anoNasc;
		
		if (idade >= 18) {
			System.out.println("Entrada liberada, " + nome + ". Divirta-se.");
		}else {
			System.out.println("Entrada não permitida, " + nome + ". Esse estabelecimento não aceita menores de 18 anos.");
		}
	}
}
