package pecas;

import Basico.Recursos;
import Basico.Tabuleiro;

public class Fabrica extends Aliadas {
	
	public Fabrica(Tabuleiro tab) {
		custo = 50;
		vida = 3;
		nome = 'f';
		tipo = "Aliadas";
		this.tabu = tab;
		//dinheiro.alterarRecursos(0, custo);
	}
	
	public void setRecursos(Recursos r) {
		this.dinheiro = r;
	}

	public void interagir(int posicaoX, int posicaoY) {
		tabu.rec.alterarRecursos(1, 10);
	}
}
