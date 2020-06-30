package pecas;

import Basico.Tabuleiro;

public class Explosivo extends Aliadas{

	public Explosivo (Tabuleiro tab) {
		custo = 50;
		vida = 1;
		nome = 'E';
		tipo = "Aliadas";
		this.tabu = tab;
		int tempo = tabu.rodada;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		
	}
}