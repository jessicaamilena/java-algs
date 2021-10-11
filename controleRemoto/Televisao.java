package com.controleRemoto;

import java.util.Scanner;

public class Televisao {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá, sua TV está ligando.");
		System.out.println("Qual o numero do canal desejado?");
		controle.setCanalDesejado(scan.nextInt());
		controle.trocaCanal();
		
		System.out.println("Qual o volume atual?");
		controle.setVolumeAtual(scan.nextInt());
		
		System.out.println("Qual o volume desejado?");
		controle.setVolumeDesejado(scan.nextInt());
		
		if(controle.getVolumeDesejado() > controle.getVolumeAtual()) {
			controle.aumentaVol();
		}else {
			controle.abaixaVol();
		}
		
		controle.consulta();
	}
}
