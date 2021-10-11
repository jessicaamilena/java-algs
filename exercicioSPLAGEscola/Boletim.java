package com.exercicioSPLAGEscola;

public class Boletim {
		private Aluno aluno;
		private String sala;
		private double nota1;
		private double nota2;
		private double nota3;
		private double nota4;
		
		
		public Aluno getAluno() {
			return aluno;
		}
		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
		}
		
		
		public String getSala() {
			return sala;
		}
		public void setSerie(String serie) {
			this.sala = serie;
		}
		
		
		public double getNota1() {
			return nota1;
		}
		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}
		
		
		public double getNota2() {
			return nota2;
		}
		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}
		
		
		public double getNota3() {
			return nota3;
		}
		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}
		
		
		public double getNota4() {
			return nota4;
		}
		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}
		
		public double getMedia() {
			return (getNota1() + getNota2()*2 + getNota3()*3 + getNota4()*4) / 10;
		}
		
		public void imprimirMediaAluno() {
			System.out.println("A média do aluno é: " + getMedia());
			if(getMedia() >= 7) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			
		}

}
