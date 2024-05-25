package br.com.senaisp.bauru.deborah.licao03;

public class Exemplo01 {

	public static int idade = 18;
	public static void main(String[] args) {
		byte vByte = 127;
		vByte ++; //aqui ocorre o estouro do limite do byte
		System.out.println(vByte); //mostrar limite inferior
		float vFloat = 6_000.00f; //precisa colocar f para dizer que é float
		//exemplo de escopo de variavel
		if (vByte == -128) {
			String nome = "Deborah";
			System.out.println("Meu nome é " + nome);
		}
		//aqui não existe a variavel nome
		//System.out.println(nome);
		//alterando a variavel idade
		idade = 20;
		System.out.println(idade);
		int idade = 50;
		System.out.println(idade);
		idade += 20; //somando 20 à idade
		System.out.println(idade);
	}

}
