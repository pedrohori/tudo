package Basico;

import pecas.Monstro;

public class invasão {
	
	public static void main(String[] args) {
		
		Tabuleiro jogo1 = new Tabuleiro();
		
		jogo1.criarTab(6, 10);
		
		jogo1.fazerTab(0, 0, 0);
		
		jogo1.mostrarTab();
		
		jogo1.tab[2][2] = new Monstro(jogo1);
		
		jogo1.mostrarTab();
		jogo1.executar();
		
		jogo1.mostrarTab();
	}
}
