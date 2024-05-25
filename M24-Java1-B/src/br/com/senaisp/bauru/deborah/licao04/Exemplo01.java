package br.com.senaisp.bauru.deborah.licao04;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//strings
		String nome1 = "Deborah";
		String nome2 = "Deborah";
		
		System.out.println("Digite o nome:");
		nome2 = scn.next();
		if (nome1 == nome2) {
			System.out.println("São iguais");
		} 
		else {
			System.out.println("Não são iguais");
		}

		if(nome1.equals(nome2)) {
			System.out.println("São iguais no conteúdo");
		}
		else {
			System.out.println("Não são iguais no conteúdo");
		}
		
		if (nome1.compareTo(nome2)>0) {
			System.out.println("Nome 1 é maior que o nome 2 - " + nome1.compareTo(nome2));
		}
		if (nome1.compareTo(nome2)<0) {
			System.out.println("Nome 1 é menos que o nome 2 - " + nome1.compareTo(nome2));
		}
		if (nome1.compareTo(nome2) == 0) {
			System.out.println("Nome 1 é igual ao nome 2 - " + nome1.compareTo(nome2));
		}
		
	}

}
