package br.com.senaisp.bauru.deborah.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		Carta ct;
		try {
			ct = new Carta(4, 14);
			System.out.println(ct.toString());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
