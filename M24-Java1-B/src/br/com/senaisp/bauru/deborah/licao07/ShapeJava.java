package br.com.senaisp.bauru.deborah.licao07;

public class ShapeJava {
	protected double altura;
	private double largura;
	String cor;
	//constructor
	public ShapeJava(double alt, double larg) {
		altura = alt;
		largura = larg;
	}
	//getters e setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	//classe dentro de outra class
	public class apoio{
		public void chamarApoio() {
			ShapeJava sp2 = new ShapeJava(2,2);
			sp2.altura = 10;
		}
	}
	//metodo estatico de criação
	public static ShapeJava getInstancia(double v1, double v2) {
		ShapeJava ret = new ShapeJava(v1, v2);
		return ret;
	}
	
}
