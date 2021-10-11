package com.controleRemoto;

public class ControleRemoto {
	private int volume = 40;
	private int volumeAtual;
	private int volumeDesejado;
	private int canalDesejado;
	
	
	public int getVolume() {
		return volume;
	}
	public int getVolumeDesejado() {
		return volumeDesejado;
	}
	public void setVolumeDesejado(int volumeDesejado) {
		this.volumeDesejado = volumeDesejado;
	}
	public int getVolumeAtual() {
		return volumeAtual;
	}
	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	public int getCanalDesejado() {
		return canalDesejado;
	}
	public void setCanalDesejado(int canalDesejado) {
		this.canalDesejado = canalDesejado;
	}
	
	//-----------------Methods
	
	public void aumentaVol() {
		if (volumeDesejado == volume) {
			System.out.println("Volume maximo."); 
		}else {
			System.out.println("Aumentando o volume. O volume atual é " + volumeDesejado);
		}
	}
	public void abaixaVol() {
		if(volumeDesejado == 0 || volumeDesejado < 0) {
			System.out.println("Mudo.");
		}else {
			System.out.println("Abaixando o volume. O volume atual é " + volumeDesejado);
		}
	}
	public void trocaCanal() {
		System.out.println("Trocando para o canal " + canalDesejado);
	}
	public void consulta() {
		System.out.println("O volume atual é " + volumeDesejado + ", e o canal é " + canalDesejado);
	}
}
