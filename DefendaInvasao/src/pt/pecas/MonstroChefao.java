package pt.pecas;

import pt.principal.*;

public class MonstroChefao extends Inimigas {

	
	private static final long serialVersionUID = -5263485707830148426L;
	public MonstroChefao(Tabuleiro tab,int z) {
		super("src\\assets\\chefe.png",z);
		vida = 8;
		nome = 'M';
		tipo = "Inimigas";
		dano = 3;
		this.tabu = tab;
	}
	
	public void andar(int posicaoX, int posicaoY, int x, int y, int l) {
		tabu.tab[posicaoY+y][posicaoX+x] = new MonstroChefao(tabu,tabu.tab[posicaoY+y][posicaoX+x].pos);
		tabu.tab[posicaoY+y][posicaoX+x].vida = tabu.tab[posicaoY][posicaoX].vida;
		tabu.tab[posicaoY][posicaoX] = new Vazio(l);
		
		tabu.removerPeca(l);
		tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX],l);
		
		tabu.removerPeca(tabu.tab[posicaoY+y][posicaoX+x].pos);
		tabu.adicionaPeca(tabu.tab[posicaoY+y][posicaoX+x],tabu.tab[posicaoY+y][posicaoX+x].pos);
	}

	
	public void mover(int posicaoX, int posicaoY) {
	
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
	
	public void interagir(int posicaoX,int posicaoY) {
		super.interagir(posicaoX, posicaoY);
	}

}
