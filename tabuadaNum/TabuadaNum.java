package com.tabuadaNum;

import java.util.Scanner;

public class TabuadaNum {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero.");
		num = scan.nextInt();
		System.out.println("Tabuada do " + num);
		
		for (int i = 1; i < 11; i++) {
			System.out.println(num + (" x ") + i + " = " + (num*i));			
		}
	}
}
