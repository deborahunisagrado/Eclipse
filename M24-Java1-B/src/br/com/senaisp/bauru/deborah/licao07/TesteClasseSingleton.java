package br.com.senaisp.bauru.deborah.licao07;

public class TesteClasseSingleton {

	public static void main(String[] args) {
		ClasseSingleton objt01 = ClasseSingleton.getInstancia();
		ClasseSingleton objt02 = ClasseSingleton.getInstancia();
		//alterando os dados
		System.out.println(objt01);
		System.out.println(objt02);
		//
		objt01.setNome("Roberval");
		System.out.println(objt02.getNome());
	}

}
