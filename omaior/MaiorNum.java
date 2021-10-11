package com.omaior;

import java.util.Scanner;

public class MaiorNum {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = scan.nextInt();
		
		System.out.println("O numero a seguir é o maior entre os informados.");
		
		if(num3 > num1 && num3 > num2) {
			System.out.println(num3); 
		}else if(num2 > num3 && num2 > num1){
			System.out.println(num2);
		}else {
			System.out.println(num1);
		}
		
	}
}
