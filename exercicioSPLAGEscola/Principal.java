package com.exercicioSPLAGEscola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exercicioSEPLAGFuncionarios.Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boletim boletim = new Boletim();
		Aluno aluno = new Aluno();
		boletim.setAluno(aluno);
		double media = 0;
		List<Boletim> boletins = new ArrayList<>();
		
		
		for(int i = 0; i < 10; i++) {
		
		System.out.println("Nome do aluno: ");
		aluno.setNome(scan.next());

		System.out.println("Serie do aluno: ");
		boletim.setSerie(scan.next());
		
		System.out.println("Idade do aluno: ");
		aluno.setIdadeAluno(scan.nextInt());
		
		System.out.println("Nota do 1Bim: ");
		boletim.setNota1(scan.nextDouble());
		
		System.out.println("Nota do 2Bim: ");
		boletim.setNota2(scan.nextDouble());
		
		System.out.println("Nota do 3Bim: ");
		boletim.setNota3(scan.nextDouble());
		
		System.out.println("Nota do 4Bim: ");
		boletim.setNota4(scan.nextDouble());
		
		boletim.imprimirMediaAluno();
		
		boletins.add(boletim);
		}
		
		for(int i = 0; i < 10; i++) {
			
			media += boletins.get(i).getMedia();
			
		}
		

		System.out.println("A media dessa turma é " + (media/10));
		
	}
	
}
