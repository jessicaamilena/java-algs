package com.descobreIdade;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private double altura;
	public int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	String imprimeDados() {
		String dados = "Nome: " + this.nome;
		dados += "\nAno de Nascimento: " + this.anoNasc;
		dados += "\nAltura: " + this.altura;
		dados += "\nIdade: " + (this.idade = 2021 - anoNasc);

		return dados;
	}
	
	//-----------Main------------
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome ("Jessica");
		pessoa.setAnoNasc (1996);
		pessoa.setAltura(1.60);
		
				
		System.out.println(pessoa.imprimeDados());
		
	}
}
