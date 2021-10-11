package com.exercicioSEPLAGFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFunc {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Empresa empresa = new Empresa();
		double media = 0;
		double maior;
		List<Funcionario> funcionarios = new ArrayList<>();
		List<Funcionario> salarios = new ArrayList<>();
		
		
		System.out.println("Nome da empresa: ");
		empresa.setNomeEmpresa(scan.next());
		
		System.out.println("Segmento empresarial: ");
		empresa.setSegmento(scan.next());
		
		//-----------Employees
		
		for(int i = 0; i < 2; i++) {
			Funcionario funcionario = new Funcionario();
			
			System.out.println("Nome do funcionario: ");
			funcionario.setNome(scan.next());

			System.out.println("Matricula do funcionario: ");
			funcionario.setMatricula(scan.nextInt());
			
			System.out.println("Possui filhos? (0- Não / 1- Sim) ");
			funcionario.setFilhos(scan.nextInt());
			
			System.out.println("Grau de formação: ");
			funcionario.setGrauFormacao(scan.next());
			
			System.out.println("Salário bruto: ");
			funcionario.setSalarioBruto(scan.nextDouble());
			
			
			funcionario.salarioLiquido();
			funcionario.impostoRenda();
			
			
			
			funcionarios.add(funcionario);
		}
		
		
		
		//-----Media
		
		
		for(int i = 0; i < 2; i++) {
			
			media += funcionarios.get(i).getSalario();
			
		}
		
		System.out.println("O maior salario é ");
		System.out.println("O menor salario é ");
		System.out.println("A media dos salarios é " + (media/2));
		
	}
}
