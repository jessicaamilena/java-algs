package com.fibo;

public class Fibonacci {
	 public static void main(String [] args) {
	        long primeiroNumero = 0;
	        long segundoNumero = 1;
	        long proximoNumero;
	        for (long n = 0; n <= 100; n++) {
	            proximoNumero = primeiroNumero + segundoNumero;

	            System.out.println(segundoNumero);

	            primeiroNumero = segundoNumero;
	            segundoNumero = proximoNumero;
	        }
	        System.out.println(segundoNumero);
	    }
}
