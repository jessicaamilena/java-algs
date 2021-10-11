package com.salarioMin;

import java.util.Scanner;

public class SalarioMin {
	public static void main(String[] args) {
		double salarioMin = 0;
		double salarioUsuario = 0;
		double qtdSalarioMin = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o valor so salario min. atual?");
		salarioMin = scan.nextInt();
		
		System.out.println("Qual o salario atual do usuario?");
		salarioUsuario = scan.nextInt();
		
		if(salarioUsuario == salarioMin) {
			System.out.println("Este usuario recebe apenas 1 salario min."); 
		}else {
			System.out.println("Este usuario recebe " + (qtdSalarioMin = salarioUsuario / salarioMin) + " salarios min.");
		}
	}
}
