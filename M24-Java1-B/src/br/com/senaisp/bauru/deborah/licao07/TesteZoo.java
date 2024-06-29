package br.com.senaisp.bauru.deborah.licao07;

public class TesteZoo {

	public static void main(String[] args) {
		Mamifero mam = new Gato(5, "Neco");
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
		if (mam instanceof Cachorro) {
			((Cachorro) mam).setQuadrupede(true);
		}
		mam.falar();
		System.out.println(mam.toString());
	}

}
