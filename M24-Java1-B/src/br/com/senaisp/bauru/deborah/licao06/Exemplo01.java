package br.com.senaisp.bauru.deborah.licao06;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores;
		System.out.println("Digite o número de elementos que você deseja: ");
		int qtde = sc.nextInt();
		valores = new int[qtde];
		//laço de repetição para solicitar os números
		for(int i=0;i<valores.length;i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			valores[i] = sc.nextInt();
		}
		//qual seria o maior valor digitado?
		//qual a média dos valores?
		//Qual seria a soma dos valores?
		int maior=Integer.MIN_VALUE, soma=0;
		for(int el : valores) {
			soma += el; 
			if (el > maior) {
				maior = el;
			}
		}
		//mostrando os valores
		System.out.println("Maior valor: " + maior);
		System.out.println("Média: " + (soma * 1.0/valores.length));
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
