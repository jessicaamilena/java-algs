package com.patos;

public abstract class Pato {
	
	protected VoarInterface voarInterface;
	protected QuackInterface quackInterface;

	public abstract void descricao();
	
	public void Quack() {
		quackInterface.quack();
	}
	
	public void Voar() {
		voarInterface.voar();
	}
}
