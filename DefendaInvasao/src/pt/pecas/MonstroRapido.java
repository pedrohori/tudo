package pt.pecas;

import pt.principal.Tabuleiro;

public class MonstroRapido extends Inimigas {
	
	private static final long serialVersionUID = 1072432926757815722L;

	public MonstroRapido(Tabuleiro tab,int z) {
		super("src\\assets\\rapido.png",z);
		vida = 2;
		dano = 1;
		nome = 'M';
		tipo = "Inimigas";
		this.tabu = tab;
	}


	public void interagir(int posicaoX, int posicaoY) {
		super.interagir(posicaoX, posicaoY);
		
	
	}


	public void mover(int posicaoX, int posicaoY) {
		if(posicaoX==0) {
			tabu.vitoria= false;
		}
		else if(tabu.tab[posicaoY][posicaoX-1].nome == '-') {
			andar(posicaoX,posicaoY,-1,0,tabu.tab[posicaoY][posicaoX].pos);
			if(posicaoX-1==0) {
				tabu.vitoria= false;
			}
			else if(tabu.tab[posicaoY][posicaoX-2].nome == '-') {
				andar(posicaoX-1,posicaoY,-1,0,tabu.tab[posicaoY][posicaoX-1].pos);
			}
			
			else {
				interagir(posicaoX, posicaoY);
			}
		}
		
		else {
			interagir(posicaoX, posicaoY);
		}
		
	}


	
	public void andar(int posicaoX, int posicaoY, int x, int y, int l) {
		int v =tabu.tab[posicaoY+y][posicaoX+x].pos;
		tabu.tab[posicaoY+y][posicaoX+x] = new MonstroRapido(tabu,v);
		tabu.tab[posicaoY+y][posicaoX+x].vida = tabu.tab[posicaoY][posicaoX].vida;
		tabu.tab[posicaoY][posicaoX] = new Vazio(l);
		
		tabu.removerPeca(l);
		tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX],l);
		
		tabu.removerPeca(v);
		tabu.adicionaPeca(tabu.tab[posicaoY+y][posicaoX+x],v);
		
	}
}
