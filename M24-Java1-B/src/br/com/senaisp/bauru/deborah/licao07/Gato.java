package br.com.senaisp.bauru.deborah.licao07;

public class Gato extends Mamifero {
	private boolean quadrupede;
	//constructor
	public Gato() {
		setIdade(0);
		setNome("Gato sem nome");
		setCor("Gato sem cor");
	}
	public Gato(String nome) {
		setNome(nome);
	}
	public Gato(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
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
