package com.mediaAluno;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		
		int nota1 = 0;
		int nota2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota.");
		nota1 = scan.nextInt();
		
		if(nota1 > 100) {
			System.out.println("A nota inserida está fora do padrão, favor reiniciar o processo.");
			
		}else {
			System.out.println("Digite a segunda nota.");
			nota2 += scan.nextInt();
			
			
			if(nota2 > 100) {
				System.out.println("A nota inserida está fora do padrão, favor reiniciar o processo.");
			}else {
				int notas = nota1 + nota2;
				System.out.println("A media do aluno é " + notas / 2);
			}
		}
		
	}
	
}
