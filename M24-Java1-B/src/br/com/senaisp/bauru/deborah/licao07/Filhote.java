package br.com.senaisp.bauru.deborah.licao07;

public class Filhote {
	private static int nSeg = 0;
	private int id;
	private String name;
	//constructor
	public Filhote(String nome) {
		id = ++nSeg;
		this.name = nome;
	}
	//getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
}
