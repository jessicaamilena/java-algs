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
			System.out.println("Você está abaixo do peso.");
		}else if(imc >= 20 && imc <= 25) {
			System.out.println("Você está no peso normal.");
		}else if(imc > 25 && imc <= 30) {
			System.out.println("Você está sobre peso.");
		}else if(imc > 30 && imc <= 40) {
			System.out.println("Você está na area de obesidade.");
		}else {
			System.out.println("Você está na area da obesidade morbida.");
			
		}
	}
}
