package br.com.senaisp.bauru.deborah.licao07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhoSwing extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		//setando a cor de preenchimento 
		g.setColor(Color.BLUE);
		//desenha um quadrado na posição x=50, y=50
		g.fillRect(50, 50, 150, 150);
		//desenhando um circulo
		g.setColor(Color.GREEN);
		g.fillOval(300, 50, 150, 150);
		//dsenhando um triângulo
		g.setColor(Color.RED);
		int[] xPontos = {600, 525, 675};
		int[] yPontos = {50, 200, 200};
		g.fillPolygon(xPontos, yPontos, 3);
	}

}
