package pt;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class App {
	public static String DIRETORIO1 =  App.class.getResource(".").getPath();
	public static void main(String[] args) {
		//agradecimento a Egoreurow1695 que disponibilizou a imagem utilizada como personagem no site gratispng
		Menu menu = new Menu();
		
		Icon bot = new ImageIcon("src//imagem//monstrinho.png");
		JButton iniciar = new JButton(bot);
		iniciar.setBounds(250, 250, 100, 100);
		menu.adicionaComando(iniciar);
		iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		Principal janela = new Principal();
		janela.criarFundo(janela);
		janela.addFundo();
		
		JButton cima = new JButton ("CIMA");
		janela.adicionaComando(cima);
		cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            		janela.tab[janela.y][janela.z].cima();
            		janela.atualizarRecurso("cima");
            	
            }
        });
		
		
		JButton baixo = new JButton ("BAIXO");
		janela.adicionaComando(baixo);
		baixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	janela.tab[janela.y][janela.z].baixo();
            	janela.atualizarRecurso("baixo");
            }
        });
		
		
		JButton esq = new JButton ("ESQUERDA");
		janela.adicionaComando(esq);
		esq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	janela.tab[janela.y][janela.z].esquerda();
            	janela.atualizarRecurso("esquerda");
            }
        });
		
		
		JButton dir = new JButton ("DIREITA");
		janela.adicionaComando(dir);
		dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	janela.tab[janela.y][janela.z].direita();
            	janela.atualizarRecurso("direita");
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
        });
	}

}
