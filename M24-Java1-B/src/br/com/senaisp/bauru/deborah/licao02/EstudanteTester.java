package br.com.senaisp.bauru.deborah.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		Estudante est01 = new Estudante();
		est01.setNome("Deborah");
		est01.setId(1);
		est01.setMedia(5.5f);
		est01.setDocumento("123456789");
		est01.setFumante(false);
		est01.setBolsaEstudo(200);
		//mostrando os valores
		/*System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: " + est01.getDocumento());*/
		//obtendo o objeto como representação textual
		System.out.println(est01.toString());
		Estudante est02 = new Estudante(2, "Roberto", "123456789", 9.6f, 1600.0, true);
		System.out.println(est02.toString());
	}

}
