package com.caelum.contas;



public class TestaContas {
	 public static void main(String[] args) {
	        Contas minhaConta = new Contas();

	        minhaConta.setTitular ("Jessica");
	        minhaConta.setAgencia ("Nubank");
	        minhaConta.numeroConta = 01;
	        minhaConta.setDataAbertura ("08 08 2020");

	      
	        minhaConta.deposita(800);

	        //if(minhaConta.sacar()) {
	            //System.out.println("Valor sacado.");
	        //}else {
	            //System.out.println("Não foi possivel realizar o saque, saldo insuficiente.");
	        //}
	        
	        System.out.println(minhaConta.recuperaDadosParaImpressao());
	        System.out.println("O saldo atual da sua conta é de " + minhaConta.getSaldo());
	    }
}
