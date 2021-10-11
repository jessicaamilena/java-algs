package com.firstSwitch;

public class FirstSwitch {
	public static void main(String[] args) {
	
		char letra = 'E';
		
		switch (letra) {
		case 'A':
			System.out.println("The letter is A.");
			break;
			
		case 'B':
			System.out.println("The letter is B.");
			break;
			
		case 'C':
			System.out.println("The letter is C.");
			break;
			
		case 'D': case 'E':
			System.out.println(letra + " is the letter typed.");
			break;
			
		default:
			System.out.println("This letter isn't A, B, C, D or E.");
			break;
		}
	}
}
