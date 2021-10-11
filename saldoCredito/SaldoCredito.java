package com.saldoCredito;

import java.util.Scanner;

public class SaldoCredito {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float saldoMedio = 0;
		float percentual = 0;
		
		System.out.println("Informe o saldo medio anual de sua conta.");
		saldoMedio = scan.nextFloat();
		
		if(saldoMedio >= 0 && saldoMedio <= 500) {
			System.out.println("O saldo medio anual de sua conta é de " + saldoMedio + " e nesse caso não possui nenhum credito.");
		}else if(saldoMedio > 500 && saldoMedio <= 1000) {
			percentual = saldoMedio * (float)0.3; 
			System.out.println("O saldo medio anual de sua conta é de " + saldoMedio + " e o valor de seu credito é de " + percentual);
		}else if(saldoMedio > 1000 && saldoMedio <= 3000) {
			percentual = saldoMedio * (float)0.4;  
			System.out.println("O saldo medio anual de sua conta é de " + saldoMedio + " e o valor de seu credito é de " + percentual);
		}else{
			percentual = saldoMedio * (float)0.5; 
			System.out.println("O saldo medio anual de sua conta é de " + saldoMedio + " e o valor de seu credito é de " + percentual);
		}
	}
}
