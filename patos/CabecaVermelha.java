package com.patos;

public class CabecaVermelha extends Pato {
	public void descricao() {
		System.out.println("Cabeça Vermelha");
	}
	
	public CabecaVermelha() {
		voarInterface = new Voa();
		quackInterface = new Quack();
	}
	
}
