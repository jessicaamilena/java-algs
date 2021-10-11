package com.exerciciosSEPLAG;

import java.util.Scanner;

public class TesteImposto {
	 public static void main(String[] args) {
	        //declarar variaveis
	        double ipi = 0;
	        //int codigo1, codigo2 = 0;
	        double valor1, valor2 = 0;
	        int quantidade1, quantidade2 = 0;
	        double valorTotal;

	        //receber dados
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Informe o percentuual do IPP:");
	        ipi = scan.nextDouble();

	        //System.out.println("Informe o cod. do produto 1: ");
	       // codigo1 = scan.nextInt();
	        //System.out.println("Informe o cod. do produto 2: ");
	        //codigo2 = scan.nextInt();

	        System.out.println("Informe o valor do produto 2: ");
	        valor1 = scan.nextDouble();
	        System.out.println("Informe o valor do produto 2: ");
	        valor2 = scan.nextDouble();

	        System.out.println("Informe o quantidade do produto 2: ");
	        quantidade1 = scan.nextInt();
	        System.out.println("Informe o quantidade do produto 2: ");
	        quantidade2 = scan.nextInt();

	        //efetuar calculo
	        valorTotal = (valor1 + quantidade1 + valor2 + quantidade2)*(ipi/100 + 1);

	        System.out.println("O valor total a ser pago é " + valorTotal);
	    }
}
