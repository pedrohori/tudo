package pt.principal;

import java.awt.Graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fundo extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image fundo;
	ImageIcon ref;
	
	public Fundo(String s) {
		if(s.equalsIgnoreCase("menu")) {
			ref = new ImageIcon("src\\assets\\fundoMenu.png");
		}
		else if(s.equalsIgnoreCase("gameover")) {
			ref = new ImageIcon("src\\assets\\gameover.png");
		}
		else if(s.equalsIgnoreCase("fase2")) {
			ref = new ImageIcon("src\\assets\\vafase2.png");
		}
		else if(s.equalsIgnoreCase("fase3")) {
			ref = new ImageIcon("src\\assets\\vafase3.png");
		}
		else if(s.equalsIgnoreCase("venceu")) {
			ref = new ImageIcon("src\\assets\\venceu.png");
		}
		else if(s.equalsIgnoreCase("instrucao")) {
			ref = new ImageIcon("src\\assets\\instrucoes.png");
		}
	
		fundo = ref.getImage();
	}
	
	public void paintComponent(Graphics g) {
		//Graphics2D graficos = (Graphics2D) g;
		super.paintComponent(g);
		g.drawImage(fundo, 0, 0, this);
		//g.dispose();
	}
}
