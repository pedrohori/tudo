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
import pt.principal.Menu;

public class VoceVenceu extends JFrame{

	private static final long serialVersionUID = -1198451553242123550L;
	
	private JPanel centro;
	public JButton acabou;
	public VoceVenceu() {
		
		super("Defenda-se da Invasão");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
	
		centro = new Fundo("venceu");
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		Icon bot = new ImageIcon("src//assets//menub.png");
		acabou = new JButton(bot);
		acabou.setBounds(425, 500, 150, 75);
		adicionaComando(acabou);
		
		
		
		setVisible(true);
			
	}
	
	public void finalizar() {
		acabou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
            		
            }
        });
	}
	
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
	
}
