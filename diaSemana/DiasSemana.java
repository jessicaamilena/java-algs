package com.diaSemana;

import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int diaSemana = 0;
	
	System.out.println("Digite o numero correspondente ao dia da semana.");
	diaSemana = scan.nextInt();
	
	if (diaSemana == 1) {
		System.out.println("Hoje é Domingo.");
	}else if (diaSemana == 2) {
		System.out.println("Hoje é Segunda.");
	}else if (diaSemana == 3) {
		System.out.println("Hoje é Terça.");
	}else if (diaSemana == 4) {
		System.out.println("Hoje é Quarta.");
	}else if (diaSemana == 5) {
		System.out.println("Hoje é Quinta.");
	}else if (diaSemana == 6) {
		System.out.println("Hoje é Sexta.");
	}else if (diaSemana == 7) {
		System.out.println("Hoje é Sabado.");
	}else {
		System.out.println("Numero inválido.");
	}
	
	}
}
