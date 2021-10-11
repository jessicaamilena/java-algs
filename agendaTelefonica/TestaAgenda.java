package com.agendaTelefonica;

public class TestaAgenda {
	public static void main(String[] args) {
		Contato contato = new Contato("Jessica", "jess@exem.com");
		AgendaTel agenda = new AgendaTel();
		
		agenda.addContato(contato);
		System.out.println(agenda.buscarContato("Jessica"));
		agenda.deletContato(contato);
		System.out.println(agenda.buscarContato("Jessica"));
	}
}