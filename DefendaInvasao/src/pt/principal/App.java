package pt.principal;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class App {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Icon bot = new ImageIcon("src//assets//bfase1.png");
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
		menu.adicionaComando(fase3);
		
		fase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		Tabuleiro f1 = new Tabuleiro("Fase 1");
            	
            }
        });
		

	}

}
