package com.imparPar;

public class ImparPar {
	public static void main(String[] args) {

		long somaImpar = 0;
		long multPar = 1;
		
		
		for(long i = 1; i <= 30; i++) {
			
			if(i % 2 == 0 && i > 0) {
				multPar *= i;	
			}
			else{
				somaImpar += i;
			}
			
		}
		
		System.out.println("A soma dos numeros impares � " + somaImpar);
		System.out.println("A multiplica��o dos numeros pares � " + multPar);
		
	}
			
}
	

