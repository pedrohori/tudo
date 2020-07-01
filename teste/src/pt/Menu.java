package pt;

import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JPanel centro, norte, sul,cent;
	public Menu() {
		super("Laboratorio 11 - ra241640 & ra223402");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	public void janelaVisual() {
		setSize(610,700);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
		//norte = new JPanel();
		//norte.setLayout(new BorderLayout());
		//norte.setSize(200,200);
		//painelPrincipal.add(norte, BorderLayout.CENTER);
		
	//	cent = new JPanel();
		//cent.setLayout(new BorderLayout());
		//centro.setSize(200,200);
		//painelPrincipal.add(cent,BorderLayout.CENTER);
		
		centro = new JPanel();
		centro.setLayout(null);
		//centro.setSize(200,200);
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		
		
		//sul = new JPanel();
		//sul.setLayout(new BorderLayout());
		
		//painelPrincipal.add(sul, 2);
		
		setVisible(true);
			
	}
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
}
