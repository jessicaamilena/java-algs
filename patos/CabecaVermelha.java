package com.patos;

public class CabecaVermelha extends Pato {
	public void descricao() {
		System.out.println("Cabe�a Vermelha");
	}
	
	public CabecaVermelha() {
		voarInterface = new Voa();
		quackInterface = new Quack();
	}
	
}
