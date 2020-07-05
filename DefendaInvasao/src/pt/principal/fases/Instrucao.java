package pt.principal.fases;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pt.principal.*;

public class Instrucao extends JFrame implements IJanela{
	private static final long serialVersionUID = 5243112469295145682L;
	private JPanel centro;
	public JButton menu;
	public Instrucao() {
		
		super("Defenda-se da Invasão - Instruções");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
	
		centro = new Fundo("instrucao");
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		Icon bot = new ImageIcon("src//assets//menub.png");
		menu = new JButton(bot);
		menu.setBounds(425, 500, 150, 75);
		adicionaComando(menu);
		
		
		
		setVisible(true);
			
	}
	
	public void irMenu() {
		menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Menu menup = new Menu();
        		menup.iniciarMenu();
            	dispose();
            		
            }
        });
	}
	
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
}
