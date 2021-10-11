package com.patos;

public class Malvado extends Pato {
	
	public void descricao() {
		System.out.println("Pato Malvado");
	}
	
	public Malvado() {
		voarInterface = new Voa();
		quackInterface = new Quack();
	}
	
}
