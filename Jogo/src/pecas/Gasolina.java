package pecas;

import Basico.Tabuleiro;

public class Gasolina extends Aliadas{

	public Gasolina (Tabuleiro tab) {
		custo = 50;
		vida = 1;
		nome = 'g';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
	}
}
