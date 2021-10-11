package com.imc;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		double altura = 0;
		double peso = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura.");
		altura = scan.nextDouble();
		
		System.out.println("Digite seu peso.");
		peso = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if(imc < 20) {
			System.out.println("Voc� est� abaixo do peso.");
		}else if(imc >= 20 && imc <= 25) {
			System.out.println("Voc� est� no peso normal.");
		}else if(imc > 25 && imc <= 30) {
			System.out.println("Voc� est� sobre peso.");
		}else if(imc > 30 && imc <= 40) {
			System.out.println("Voc� est� na area de obesidade.");
		}else {
			System.out.println("Voc� est� na area da obesidade morbida.");
			
		}
	}
}
