package com.patos;

public class PatoBorracha extends Pato{
	public void descricao() {
		System.out.println("Pato de Borracha");
	}
	
	public PatoBorracha() {
		voarInterface = new NaoVoa();
		quackInterface = new Quack();
		quackInterface.snif();
	}
	
}
