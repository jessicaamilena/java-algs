package com.exerciciosSEPLAG;

import java.util.Scanner;

public class IdadeDias {
	  public static void main(String[]args) {
	        int idadeAnos;
	        int idadeMes;
	        int idadeDias;
	        int conversaoDias;

	        Scanner scan = new Scanner(System.in);
	        System.out.println("Informe sua idade atual.");
	        System.out.println("Anos: ");
	        idadeAnos = scan.nextInt();

	        System.out.println("Meses: ");
	        idadeMes = scan.nextInt();

	        System.out.println("Dias: ");
	        idadeDias = scan.nextInt();

	        conversaoDias = (idadeAnos * 365) + (idadeMes * 30) + idadeDias;

	        System.out.println("Sua idade em dias é " + conversaoDias);
	    }
}
