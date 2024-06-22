package br.com.senaisp.bauru.deborah.licao07;

public class Gato extends Mamifero {
	private boolean quadrupede;
	//getters e setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//metodos
	@Override 
	public void falar() {
		System.out.println("Miau Miau");
	}
}
