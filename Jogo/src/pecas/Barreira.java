package pecas;

import Basico.Tabuleiro;

public class Barreira extends Aliadas{

	public Barreira (Tabuleiro tab) {
		custo = 150;
		vida = 5;
		nome = 'b';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
	}
}
