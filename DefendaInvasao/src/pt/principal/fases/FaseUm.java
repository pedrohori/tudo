package pt.principal.fases;

import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import pt.principal.*;
import pt.pecas.*;

public class FaseUm {
	
	protected Tabuleiro f1;
	protected JButton next, constr,voltar;
	protected Random rand = new Random();
	protected int novoMonstro,l;
	
	public FaseUm(int arvores, int pedras, int lagos,String fase) {
		f1 = new Tabuleiro(fase);
		f1.criarTab();
		f1.fazerTab(arvores,pedras,lagos,500,20);
		f1.addFundo();
		Icon cont = new ImageIcon("src//assets//continue.png");
		next = new JButton(cont);
		next.setBounds(10,10, 150,75);
		f1.adicionaComando(next);
		
		Icon cont1 = new ImageIcon("src//assets//construir.png");
		constr = new JButton(cont1);
		constr.setBounds(10,90, 150,75);
		f1.adicionaComando(constr);
		
		Icon cont2 = new ImageIcon("src//assets//menub.png");
		voltar = new JButton(cont2);
		voltar.setBounds(10,400, 150,75);
		f1.adicionaComando(voltar);
	
	
	voltar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	
        		f1.dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
        		
        }
    });
	
	}
	
	public void iniciar() {
		next.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	
	        	novoMonstro = rand.nextInt(5);
	        	l = f1.tab[novoMonstro][9].pos;
	        	f1.entrar(l,novoMonstro);
	        	
				
	        		
	        }
		 });
		
		constr.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	
	        		String[] itens = {"Fabrica - custo 50","Soldado - custo 100"};
	        		  String selectedValue = (String) JOptionPane.showInputDialog(null,
	        		          "Escolha um item", "Construir",
	        		              JOptionPane.INFORMATION_MESSAGE, null,
	        		                  itens, itens [0]); //
	        		  System.out.println(selectedValue);
	        		
	        }
	    });
	}
	
}
