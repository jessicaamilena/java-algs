package com.maioresCemDuzendos;

import java.util.Scanner;

public class MaioresCemDuzentos {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero.");
			int aux = scan.nextInt();
			
			if(aux >= 0 && aux <= 100) {
				num1 += 1;
			}else if(aux > 100 && aux <= 200){
				num2 += 1;
			}else {
				num3 += 1;
			}
		}
		System.out.println(num1 + " numeros digitados estão entre 0 e 100.");
		System.out.println(num2 + " numeros digitados estão entre 101 e 200.");
		System.out.println(num3 + " numeros digitados estão acima de 200.");
	}
}
