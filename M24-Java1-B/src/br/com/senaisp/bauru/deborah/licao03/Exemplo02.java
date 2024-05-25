package br.com.senaisp.bauru.deborah.licao03;

public class Exemplo02 {

	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		int c = ++a;
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		System.out.println("c= " +c);
		
		double total = ++a / 2.0;
		System.out.println(total);
		char letraA = 'A';
		char letraB = 'B';
		System.out.println(++letraA);//soma em cima do valor do caracter (65)
		System.out.println(letraA + letraB); //irá somar o valor do caracter
		//para transformar na concatenação das duas caracteres:
		System.out.println("" + letraA + letraB);
	}

}
