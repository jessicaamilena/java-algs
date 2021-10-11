package com.elevador;

import java.util.Scanner;

public class TestaElevador {
	public static void main(String[] args) {
	Elevador elevador = new Elevador();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Quantas pessoas est�o no elevador?");
	elevador.setQtPessoas(scan.nextInt());
	
	elevador.entra();
		
	System.out.println("Em qual andar estamos?");
	elevador.setAndarAtual(scan.nextInt());
	
	System.out.println("Qual andar voc� deseja ir?");
	elevador.setAndarDesejado(scan.nextInt());

	
	if(elevador.getAndarDesejado() > elevador.getAndarAtual()) {
		elevador.sobe();
	}else {
		elevador.desce();
	}
	
	elevador.sai();
	
	}
}
