package pt.principal.fases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import pt.principal.*;

public class FaseTres extends FaseDois {
	protected TabuleiroTres f3 =  new TabuleiroTres("Fase 3");
	public FaseTres(int arvores, int pedras, int lagos,String fase) {
		super(arvores, pedras, lagos, fase);
		f2.dispose();
		f3.criarTab();
		f3.fazerTab(arvores,pedras,lagos,500,40);
		f3.addFundo();
		Icon cont = new ImageIcon("src//assets//continue.png");
		next = new JButton(cont);
		next.setBounds(10,10, 150,75);
		f3.adicionaComando(next);
		
		Icon cont1 = new ImageIcon("src//assets//construir.png");
		constr = new JButton(cont1);
		constr.setBounds(10,90, 150,75);
		f3.adicionaComando(constr);
		
		Icon cont2 = new ImageIcon("src//assets//menub.png");
		voltar = new JButton(cont2);
		voltar.setBounds(10,400, 150,75);
		f3.adicionaComando(voltar);
	
	
	voltar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	
        		f3.dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
        		
        }
    });
	}
	public void continuar() {
		
	}
	
	public void construir() {
		
	}
	public void construirPosto(){
		
	}
	public void construirTanque() {
		
	}

}
