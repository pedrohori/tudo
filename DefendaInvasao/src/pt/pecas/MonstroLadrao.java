package pt.pecas;

import pt.principal.Tabuleiro;

public class MonstroLadrao extends Inimigas{
	
	private static final long serialVersionUID = 4877530873964427711L;

	public MonstroLadrao(Tabuleiro tab,int z) {
		super("src\\assets\\ladrao.png",z);
		vida = 3;
		nome = 'M';
		tipo = "Inimigas";
		dano = 1;
		this.tabu = tab;
	}

	
	public void roubar() {
		tabu.rec.dinheiro = tabu.rec.dinheiro - 20;
		if (tabu.rec.dinheiro < 0) {
			tabu.rec.dinheiro = 0;
		}
		tabu.rec.mostrarRecursos();
	}
	
	public void andar(int posicaoX, int posicaoY, int x, int y, int l) {
		tabu.tab[posicaoY+y][posicaoX+x] = new MonstroLadrao(tabu,tabu.tab[posicaoY+y][posicaoX+x].pos);
		tabu.tab[posicaoY+y][posicaoX+x].vida = tabu.tab[posicaoY][posicaoX].vida;
		tabu.tab[posicaoY][posicaoX] = new Vazio(l);
		
		tabu.removerPeca(l);
		tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX],l);
		
		tabu.removerPeca(tabu.tab[posicaoY+y][posicaoX+x].pos);
		tabu.adicionaPeca(tabu.tab[posicaoY+y][posicaoX+x],tabu.tab[posicaoY+y][posicaoX+x].pos);
	
	}

	
	public void mover(int posicaoX, int posicaoY) {
		
		roubar();
		if (posicaoX == 0) {
			tabu.vitoria = false;
		}
		else if (tabu.tab[posicaoY][posicaoX-1].nome == '-') {
			andar(posicaoX, posicaoY, -1, 0,tabu.tab[posicaoY][posicaoX].pos);
		}
		else{
			interagir(posicaoX, posicaoY);
		}
	}
	public void interagir(int posicaoX, int posicaoY) {
		super.interagir(posicaoX, posicaoY);
	}
}
