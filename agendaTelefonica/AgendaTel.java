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
			 return (contatos.containsKey(nome)) ? "Esse contato existe." : "Esse contato não existe."; 
		 }
		
		 public void deletContato(Contato contato) {
			 contatos.remove(contato.nome, contato.email);
		 }
		 
		 public AgendaTel() {
			 contatos = new HashMap<>();
		 }
		  //A classe Agenda deve conter um método para adicionar um novo contato em uma posição vazia do vetor.
		 //Um método para buscar um contato (retorna uma instância de Contato) através do nome.
	    //Um método para excluir um contato através do nome.
	}


