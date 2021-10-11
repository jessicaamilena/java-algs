package com.pessoaNova;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;
	private Scanner scan = new Scanner(System.in);
	
	public void loop() {
		for (int i = 1; i < 3; i++) {
			lerDados(i);
			
		}
	}	
	private void lerDados(int indice){
		System.out.println("Digite o nome da " + indice + " pessoa.");
		String nome = scan.next();
		
		System.out.println("Digite a idade da " + indice + " pessoa.");
		int idade = scan.nextInt();
		verificarIdade(nome, idade);
	}
	
	public void idadeMenor() {
		System.out.println("A pessoa mais nove é " + this.nome + " e sua idade é " + this.idade);

	}
	
	private void verificarIdade(String nome, int idade) {
		if(this.idade == 0 || this.idade > idade) {
			this.idade = idade;
			this.nome = nome;
		}

	}
	
}

