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

public class EntreFaseDois extends JFrame implements IJanela{
	private static final long serialVersionUID = 6477236801859675355L;
	private JPanel centro;
	public JButton fase2;
	public EntreFaseDois() {
		
		super("Defenda-se da Invasão");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
	
		centro = new Fundo("fase2");
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		Icon bot = new ImageIcon("src//assets//bfase2.png");
		fase2 = new JButton(bot);
		fase2.setBounds(425, 500, 150, 75);
		adicionaComando(fase2);
		
		
		
		setVisible(true);
			
	}
	public void irFaseDois() {
		fase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	FaseDois f2 = new FaseDois(3,2,1,"Fase 2");
        		f2.iniciar();
        		dispose();
            		
            }
        });
	}
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
}
