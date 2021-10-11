package com.agendaTelefonica;
import java.util.HashMap;
//import java.util.Map;


public class AgendaTel {
	//----Behaviors
	private HashMap<String, String> contatos;
	
		 public void addContato(Contato contato) {
			 contatos.put(contato.nome, contato.email);
		 }
		 
		 public String buscarContato(String nome) {
			 return (contatos.containsKey(nome)) ? "Esse contato existe." : "Esse contato n�o existe."; 
		 }
		
		 public void deletContato(Contato contato) {
			 contatos.remove(contato.nome, contato.email);
		 }
		 
		 public AgendaTel() {
			 contatos = new HashMap<>();
		 }
		  //A classe Agenda deve conter um m�todo para adicionar um novo contato em uma posi��o vazia do vetor.
		 //Um m�todo para buscar um contato (retorna uma inst�ncia de Contato) atrav�s do nome.
	    //Um m�todo para excluir um contato atrav�s do nome.
	}


