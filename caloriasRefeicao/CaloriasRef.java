package com.caloriasRefeicao;

import java.util.Scanner;

public class CaloriasRef {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numPrato = 0;
		int calPrato = 0;
		int numSobremesa = 0;
		int calSobremesa = 0;
		int numBebida = 0;
		int calBebida = 0;
		int calTotal = 0;
		
		System.out.println("Os pratos disponiveis são: \n1- Vegetariano \n2- Peixe \n3- Frango \n4- Carne \nDigite o numero do prato correspondente.");
		numPrato = scan.nextInt();
		
		if(numPrato == 1) {
			calPrato = 180;
		} else if(numPrato == 2) {
			calPrato = 230;
		}else if(numPrato == 3) {
			calPrato = 250;
		}else {
			calPrato = 350;
		}
		
		System.out.println("As sobremesas disponiveis são: \n1- Abacaxi \n2- Sorvete Diet \n3- Mouse Diet \n4- Mouse chocolate \nDigite o numero da sobremesa correspondente.");
		numSobremesa = scan.nextInt();
		
		if(numSobremesa == 1) {
			calSobremesa = 75;
		} else if(numSobremesa == 2) {
			calSobremesa = 110;
		}else if(numSobremesa == 3) {
			calSobremesa = 170;
		}else {
			calSobremesa = 200;
		}
		
		System.out.println("As bebidas disponiveis são: \n1- Chá \n2- Suco de Laranja \n3- Suco de Melão \n4- Refrigerante Diet \nDigite o numero da bebida correspondente.");
		numBebida = scan.nextInt();
		
		if(numBebida == 1) {
			calBebida = 20;
		} else if(numBebida == 2) {
			calBebida = 70;
		}else if(numBebida == 3) {
			calBebida = 100;
		}else {
			calBebida = 65;
		}
		
		calTotal = calBebida + calPrato + calSobremesa;
		System.out.println("O total de calorias da sua refeição é de " + calTotal + " cal.");
	}
}

