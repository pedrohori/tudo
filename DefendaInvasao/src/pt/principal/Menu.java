package pt.principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel centro;
	private Fundo painelFundo;
	public Menu() {
		
		super("Defenda-se da Invasão");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	
	
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
		
	
		
		/*painelFundo = new Fundo();
		painelFundo.setLayout(null);
		painelPrincipal.add(painelFundo);*/
		
		centro = new Fundo();
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
	
		
		setVisible(true);
			
	}
	
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
}
