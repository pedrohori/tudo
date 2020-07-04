package pt.principal;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pt.principal.fases.*;


public class Menu extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel centro;
	public JButton fase1,fase2,fase3,instrucoes;
	public Menu() {
		
		super("Defenda-se da Invas�o");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	
	
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
	
		centro = new Fundo("menu");
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		Icon bot3 = new ImageIcon("src//assets//binstrucao.png");
		instrucoes = new JButton(bot3);
		instrucoes.setBounds(425, 200, 150, 75);
		adicionaComando(instrucoes);
		
		Icon bot = new ImageIcon("src//assets//bfase1.png");
		fase1 = new JButton(bot);
		fase1.setBounds(425, 300, 150, 75);
		adicionaComando(fase1);
		
		Icon bot1 = new ImageIcon("src//assets//bfase2.png");
		fase2 = new JButton(bot1);
		fase2.setBounds(425, 400, 150, 75);
		adicionaComando(fase2);
		
		Icon bot2 = new ImageIcon("src//assets//bfase3.png");
		fase3 = new JButton(bot2);
		fase3.setBounds(425, 500, 150, 75);
		adicionaComando(fase3);
		
		setVisible(true);
			
	}
	
	public void iniciarMenu() {
		fase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		FaseUm f1 = new FaseUm(1,1,1,"Fase 1");
            		f1.iniciar();
            		dispose();
            		
            		
            }
        });
		
		fase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		FaseDois f2 = new FaseDois(3,2,1,"Fase 2");
            		f2.iniciar();
            		dispose();
            		
            }
        });
		
		fase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		FaseTres f3 = new FaseTres(4,3,1,"Fase 3");
            		f3.iniciar();
            		dispose();
            		
            }
        });
		
		instrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
        		Instrucao ins = new Instrucao();
        		ins.irMenu();
        		dispose();
        		
        }
    });
	}
	
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
}
