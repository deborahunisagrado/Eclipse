package br.com.senaisp.bauru.deborah.licao03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base do triângulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite o tamanho da sua altura: ");
		float altura = sc.nextFloat();
		float area = base * altura / 2;
		System.out.println("A área do triângulo é " + area);
		sc.close();
	}

}
