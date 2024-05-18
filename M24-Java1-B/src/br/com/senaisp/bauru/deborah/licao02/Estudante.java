package br.com.senaisp.bauru.deborah.licao02;

public class Estudante {
	//campos ou fields ou variáveis de instância
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEstudo;
	//Constructors 
	public Estudante() {
		id = 0;
		nome = "Sem nome";
		documento = "sem documento";
		media = 0;
		fumante = false;
		bolsaEstudo = 0.0;
	}
	public Estudante(int id, String nome, String documento, float media, double bolsa, boolean fum) {
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.media = media;
		bolsaEstudo = bolsa;
		fumante = fum;		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()<2) {
			throw new RuntimeException("Nome deve ter pelo menos dois caracteres");			
		}
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public boolean isFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	public double getBolsaEstudo() {
		return bolsaEstudo;
	}
	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}
	//Metodos
	@Override
	public String toString() {
		return "Id: " + getId() + "\n" +
				"Nome: " + getNome() + "\n" +
				"Documento: " + getDocumento() + "\n" +
				"Media: " + getMedia() + "\n" +
				"Bolsa Estudos: " + getBolsaEstudo() + "\n" +
				"Fumante: " + isFumante() + "\n";

	}
}
