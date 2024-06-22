package br.com.senaisp.bauru.deborah.licao07;

public class Mamifero {
	private String nome;
	private String cor;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void falar() {
		System.out.println("Au Au Au");
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + 
			   "Cor: " + cor + "\n" + 
			   "Idade: " + idade + "\n"; 
	}
}
