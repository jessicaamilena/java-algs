package com.elevador;

public class Elevador {
	//A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo)
	//capacidade do elevador e quantas pessoas estão presentes nele
	private int terreo = 0;
	private int totalAndares = 5;
	private int andarAtual;
	private int andarDesejado;
	private int capacidade = 5;
	private int qtPessoas;
	
	public int getTerreo() {
		return terreo;
	}
	public void setTerreo(int terreo) {
		this.terreo = terreo;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getAndarDesejado() {
		return andarDesejado;
	}
	public void setAndarDesejado(int andarDesejado) {
		this.andarDesejado = andarDesejado;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQtPessoas() {
		return qtPessoas;
	}
	public void setQtPessoas(int qtPessoas) {
		this.qtPessoas = qtPessoas;
	}
	
	//methods
		
	//metodo 1: Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio
	public int inicializa(int capacidade, int totalAndares) {
		return totalAndares - capacidade;
	}
	//metodo 2: Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
	public void entra() {
		if(qtPessoas < capacidade) {
			System.out.println("Agora temos " + (qtPessoas += 1) + " pessoa(s) no elevador.");
			
		}else {
			System.out.println("Espaço insuficiente. Aguarde.");
			System.exit(0);
		}
	}
		
	//metodo 3: Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
	public void sai() {
		if(qtPessoas <= 5 && qtPessoas > 0) {
			System.out.println("Com a sua saida temos " + (qtPessoas -= 1) + " pessoas no elevador.");
		}else {
			System.out.println("Elevador vazio.");
		}
	}
	//metodo 4: Sobe : para subir um andar (não deve subir se já estiver no último andar);
	public void sobe() {
		if(andarAtual == andarDesejado) {
			System.out.println("Estamos nesse andar");
		}
		else if(andarAtual < andarDesejado && andarAtual < 5) {
			System.out.println("Subindo."); 
		}else{
			System.out.println("Estamos no ultimo andar."); 
		}
	}
	//metodo 5: Desce : para descer um andar (não deve descer se já estiver no térreo);
	public void desce() {
		if(andarAtual == terreo || andarAtual == andarDesejado) {
			System.out.println("Estamos nesse andar.");
		}else {
			System.out.println("Descendo.");
		}
	}
}
