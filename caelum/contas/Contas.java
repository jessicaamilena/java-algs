package com.caelum.contas;

public class Contas {
	private String titular;
	private String agencia;
	int numeroConta;
	private double saldo;
	private String dataAbertura;

	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public String getDataAbertura() {
		return this.dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nConta: " + this.numeroConta;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData: " + this.dataAbertura;

		return dados;
	}

}
