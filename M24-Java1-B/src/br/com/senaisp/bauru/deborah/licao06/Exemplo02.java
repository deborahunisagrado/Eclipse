package br.com.senaisp.bauru.deborah.licao06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] cinema = new String[10][10];
		//inicializando o cinema
		for(int i=0;i<cinema.length;i++) {
			for(int j=0;j<cinema[i].length;j++) {
				cinema[i][j] = "-";				
			}
		}
		//comprando os ingressos
		String term;
		mostrarCinema(cinema);
		do {
			System.out.println("Qual fileira você deseja?");
			int fl = sc.nextInt();
			System.out.println("Qual poltrona você deseja?");
			int po = sc.nextInt();
			//verificando se esta disponivel
			try {
				if(cinema[fl-1][po-1].equals("-")) {
					cinema[fl-1][po-1] = "X";
				}
				else {
					System.out.println("Não disponível!");
				}
			} catch (Exception e) {
				System.out.println("Fileira e/ou poltrona inexistente.");
			}
			//mostrando as poltronas como ficou 
			mostrarCinema(cinema);
			System.out.println("Deseja continuar(S/N)");
			sc.nextLine();
			term = sc.nextLine();
			
		}
		while(!term.equalsIgnoreCase("N"));
			sc.close();

	}

	private static void mostrarCinema(String[][] cinema) {
		for(int i=0;i<cinema.length;i++) 
		{
			System.out.print("FL" + (i<9 ? " ": "") + (i+1) + " ");
			for(int j=0;j<cinema[i].length;j++) 
			{
				System.out.print(cinema[i][j] + " ");		
			}
			System.out.print("\n");
		}
	}

}
