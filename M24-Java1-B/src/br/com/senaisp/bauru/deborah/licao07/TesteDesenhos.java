package br.com.senaisp.bauru.deborah.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteDesenhos {

	public static void main(String[] args) {
		//criando a janela 
		JOptionPane janela = new JOptionPane();
		//criando a janela com diálogo
		JDialog dlg = janela.createDialog("Desenhos");
		//dimensionando a janela
		dlg.setSize(800, 600);
		//criando nosso conteúdo
		DesenhoSwing desenho = new DesenhoSwing();
		//atribuindo o desenho à janela
		dlg.setContentPane(desenho);
		//mostando a janela
		dlg.setVisible(true);

	}

}
