package br.com.senaisp.bauru.deborah.licao05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua cidade: ");
		String cidade = sc.next();
		//mostrando os dados 
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade);
	}

}
