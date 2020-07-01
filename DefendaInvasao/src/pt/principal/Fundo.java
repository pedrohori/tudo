package pt.principal;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fundo extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image fundo;
	
	public Fundo() {
		ImageIcon ref = new ImageIcon("src\\assets\\fundoMenu.png");
		fundo = ref.getImage();
	}
	
	public void paintComponent(Graphics g) {
		//Graphics2D graficos = (Graphics2D) g;
		super.paintComponent(g);
		g.drawImage(fundo, 0, 0, this);
		//g.dispose();
	}
}
