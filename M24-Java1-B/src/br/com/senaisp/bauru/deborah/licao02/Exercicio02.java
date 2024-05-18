package br.com.senaisp.bauru.deborah.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//mostrando a mensagem para o usuário
		System.out.print("Digie seu nome completo:");
		nome = scn.nextLine();
		//vamos separar nome de sobrenome 
		String primNome = nome.substring(0, (nome + " ").indexOf(" "));
		//pegar o último sobrenome
		String lastName = nome.substring(nome.lastIndexOf(" ") + 1);
		
		System.out.println(primNome);
		System.out.println(lastName);
		//fechando scanner
		scn.close();
	}

}