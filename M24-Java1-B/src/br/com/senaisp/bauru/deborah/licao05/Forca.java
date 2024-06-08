package br.com.senaisp.bauru.deborah.licao05;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	private String palavraSecreta;
	private int erros;
	private String vizualizacao;
	//constructor
	public Forca () {
		palavraSecreta = sortearPalavra();
		erros = 0;
		vizualizacao = "";
		//carregar os traços na vizualização
		int i = 0;
		while (i<palavraSecreta.length()) {
			vizualizacao += "-";
			i++;
		}
	}
	
	private String sortearPalavra() {
		Scanner scA = new Scanner(Forca.class.getResourceAsStream("palavras.txt"));
		Random rnd = new Random();
		int linSort = rnd.nextInt(180)+1;
		int lin = 0;
		String ret = "";
		while(scA.hasNextLine()) {
			lin++;
			String linha = scA.nextLine();
			if(lin==linSort) {
				ret = linha;
				break; //forçando a saída while
			}
		}
		scA.close();
		return ret;
	}
	
	public void mostrarForca() {

		String linSup = erros == 0 ? "   ": 
						erros == 1 ? " O ": 
						erros == 2 ? "\\O ":
						erros > 2 ? "\\O/ ": "  ";
		String linBod = erros >= 4 ? " | " : "";
		String linInf = erros == 5? "/  ":
						erros >= 6 ? "/ \\": "  ";
		System.out.println("+------+");
		System.out.println("|     " + linSup);
		System.out.println("|     " + linBod);
		System.out.println("|     " + linInf);
		System.out.println("|");
		System.out.println("+===========+");
		System.out.println("" + vizualizacao);
	}
	
	
	public boolean verificaLetra(char letra) {
		boolean ret = false;
		if (palavraSecreta.indexOf(letra) > -1) {
			int i = 0;
			String apoio = "";
			while(i<palavraSecreta.length()) {
				if(palavraSecreta.charAt(i) == letra) {
					apoio += "" + letra;
				} else {
					apoio += "" + vizualizacao.charAt(i);
				}
				i++;
			}
			vizualizacao = apoio;
			ret = true;
		} else {
			erros++;
			ret = false;
		}
		
		return ret;
	}
	
	public boolean isTerminado() {
		if (vizualizacao.indexOf("-") == -1) {
			System.out.println("Parabéns!!");
		}
		return erros>=6 || vizualizacao.indexOf("-") == -1;
	}
	
	public String mostrarPalavra() {
		return palavraSecreta;
	}
}


