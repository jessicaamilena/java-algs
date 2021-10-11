package com.patos;

public class PatoMadeira extends Pato {
	public void descricao() {
		System.out.println("Pato de Madeira");
	}
	
	public PatoMadeira() {
		voarInterface = new NaoVoa();
		quackInterface = new Quack();
		quackInterface.mudo();
	}
	
}
