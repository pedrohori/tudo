package pt;

import java.util.Random;

import javax.swing.JButton;

public class App {
	public static String DIRETORIO1 =  App.class.getResource(".").getPath();
	public static void main(String[] args) {
		//agradecimento a Egoreurow1695 que disponibilizou a imagem utilizada como personagem no site gratispng
	
		Principal janela = new Principal();
		
		janela.criarFundo(janela);
		janela.addFundo();
		
		
		
		//int y = 0;
		//int z = 0 ;
				
		
		JButton cima = new JButton ("CIMA");
		janela.adicionaComando(cima);
		cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	janela.tab[janela.y][janela.z].cima();
            	
            }
        });
		
		
		JButton baixo = new JButton ("BAIXO");
		janela.adicionaComando(baixo);
		baixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	janela.tab[janela.y][janela.z].baixo();
            }
        });
		
		
		JButton esq = new JButton ("ESQUERDA");
		janela.adicionaComando(esq);
		esq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	janela.tab[janela.y][janela.z].esquerda();
            }
        });
		
		
		JButton dir = new JButton ("DIREITA");
		janela.adicionaComando(dir);
		dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	janela.tab[janela.y][janela.z].direita();
            }
        });
        
		
	
		JButton ale = new JButton ("Aleatorio");
		janela.adicionaComando(ale);
		ale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	janela.tab[janela.y][janela.z].aleatorio();
            }
        });
	}

}
