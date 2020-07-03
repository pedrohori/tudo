package pt.principal;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import pt.principal.fases.*;
import pt.principal.*;
public class App {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.iniciarMenu();
		
		/*Icon bot = new ImageIcon("src//assets//bfase1.png");
		JButton fase1 = new JButton(bot);
		fase1.setBounds(200, 300, 150, 75);
		menu.adicionaComando(fase1);
		
		Icon bot1 = new ImageIcon("src//assets//bfase2.png");
		JButton fase2 = new JButton(bot1);
		fase2.setBounds(450, 300, 150, 75);
		menu.adicionaComando(fase2);
		
		Icon bot2 = new ImageIcon("src//assets//bfase3.png");
		JButton fase3 = new JButton(bot2);
		fase3.setBounds(700, 300, 150, 75);
		menu.adicionaComando(fase3);*/
		
		/*fase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		FaseUm f1 = new FaseUm(1,1,1,"Fase 1");
            		f1.iniciar();
            		
            		
            }
        });
		
		fase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		FaseDois f2 = new FaseDois(3,3,3,"Fase 2");
            		f2.iniciar();
            		
            }
        });
		
		fase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		FaseTres f3 = new FaseTres(3,2,2,"Fase 3");
            		f3.iniciar();
            		
            }
        });
		
*/
	}
	

}
