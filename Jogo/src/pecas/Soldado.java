package pecas;

import Basico.Recursos;
import Basico.Tabuleiro;

public class Soldado extends Aliadas{

	public Soldado() {
		custo = 100;
		vida = 1;
		nome = 's';
		tipo = "Aliadas";
		//dinheiro.alterarRecursos(0, custo);
	}
	
	public void setTabuleiro(Tabuleiro tab) {
		this.tabu = tab;
	}
	
	public void setRecursos(Recursos r) {
		this.dinheiro = r;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		int i = 0;
		while((i + posicaoX + 1) < 10) {
			if (tabu.tab[posicaoX+i+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+i+1][posicaoY].nome == 'p') {
				tabu.tab[posicaoX+i+1][posicaoY].vida = tabu.tab[posicaoX+i+1][posicaoY].vida - 1;
				if (tabu.tab[posicaoX+i+1][posicaoY].vida == 0) {
					tabu.tab[posicaoX+i+1][posicaoY] = new Vazio();
				}
				i = 9;
			}
			else {
				i += 1;
			}
		}
	}
}
