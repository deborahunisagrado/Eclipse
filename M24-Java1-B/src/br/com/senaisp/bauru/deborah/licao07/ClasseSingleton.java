package br.com.senaisp.bauru.deborah.licao07;

/*
 * Exemplol de uso do padrão Singleton no Java
 */

public class ClasseSingleton {
	private static ClasseSingleton instancia = null;
	private static int nSegInstancia = 0;
	private int id;
	private String nome;
	//constructor 
	private ClasseSingleton() {
		id = ++nSegInstancia;
		nome = null;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	//métodos
	public static ClasseSingleton getInstancia() {
		if (instancia == null) {
			instancia = new ClasseSingleton();
		}
		return instancia;
	}
}
