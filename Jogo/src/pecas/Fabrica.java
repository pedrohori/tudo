package pecas;

import Basico.Recursos;

public class Fabrica extends Aliadas {
	
	public Fabrica() {
		custo = 50;
		vida = 3;
		nome = 'f';
		tipo = "Aliadas";
		//dinheiro.alterarRecursos(0, custo);
	}
	
	public void setRecursos(Recursos r) {
		this.dinheiro = r;
	}

	public void interagir(int posicaoX, int posicaoY) {
		dinheiro.alterarRecursos(1, 10);
	}
}
