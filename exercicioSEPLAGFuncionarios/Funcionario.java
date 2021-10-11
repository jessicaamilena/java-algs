package com.exercicioSEPLAGFuncionarios;

public class Funcionario {
	
	private String nome;
	private int matricula;
	private String grauFormacao;
	private double salarioBruto;
	private int filhos;
	double salario;
	double desconto;
	
	//-----Employees

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getGrauFormacao() {
		return grauFormacao;
	}

	public void setGrauFormacao(String grauFormacao) {
		this.grauFormacao = grauFormacao;
	}
	
	public int getFilhos() {
		return filhos;
	}

	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	//-----Bonus
	
	public int bonus() {
		if(getFilhos() == 1) {
			return 50;
		}else {
			return 0;
		}
	}
	
	
	
	//-----Discount
	
	public void salarioLiquido() {
		if (salarioBruto <= 900) {
			desconto = this.salarioBruto * 0.08;
			salario = this.salarioBruto - desconto;
			System.out.println("Seu salário liquido com o desconto do INSS é " +  (salario + bonus()));
		}
		else if (salarioBruto > 900 && salarioBruto <= 2500) {
			desconto = this.salarioBruto * 0.11;
			salario = this.salarioBruto - desconto;
			System.out.println("Seu salário liquido com o desconto do INSS é " + (salario + bonus()));
		} else {
			salario = this.salarioBruto - (this.salarioBruto * 0.14);
			System.out.println("Seu salário liquido com o desconto do INSS é " + (salario + bonus()));
		}
	}
	
		
	public void impostoRenda() {
			if(salarioBruto <= 1500) {
				System.out.println();
			}else if(salarioBruto > 1501 && salario <= 5000) {
				salario = this.salario - (this.salario * 0.15);
				System.out.println("Seu salario Liquido com o desconto do IRPF é " + salario);
			}else {
				salario = this.salario - (this.salario * 0.25);
				System.out.println("Seu salario Liquido com o desconto do IRPF é " + salario);
			}
		}
		
	}

