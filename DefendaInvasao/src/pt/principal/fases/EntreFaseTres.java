package pt.principal.fases;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pt.principal.Fundo;

public class EntreFaseTres extends JFrame{
	private static final long serialVersionUID = -7509897561508610950L;
	private JPanel centro;
	public JButton fase3;
	public EntreFaseTres() {
		
		super("Defenda-se da Invasão");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
	
		centro = new Fundo("fase3");
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		Icon bot = new ImageIcon("src//assets//bfase3.png");
		fase3 = new JButton(bot);
		fase3.setBounds(425, 500, 150, 75);
		adicionaComando(fase3);
		
		
		
		setVisible(true);
			
	}
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
	public void irFaseTres() {
		fase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	FaseTres f3 = new FaseTres(3,3,3,"Fase 3");
        		f3.iniciar();
        		dispose();
            		
            }
        });
	}
}
