package pt.pecas;
import pt.principal.*;
public abstract class Aliadas extends Pecas {
	private static final long serialVersionUID = 1L;
	public  int custo;

	public Aliadas(String s,int z) {
		super(s,z);
	}
	
	
	public void mover(int posicaoX, int posicaoY) {
		
	}

	public abstract void interagir(int posicaoX, int posicaoY);
	
	public void atirar(int posicaoX, int posicaoY, int dano){
		int i = 1;
		while((i + posicaoX) < 10) {
			if (tabu.tab[posicaoY][posicaoX+i].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX+i].nome == 'p') {
				tabu.tab[posicaoY][posicaoX+i].vida = tabu.tab[posicaoY][posicaoX+i].vida - dano;
				if (tabu.tab[posicaoY][posicaoX+i].vida <= 0) {
					int l = tabu.tab[posicaoY][posicaoX+i].pos;
					tabu.removerPeca(l);
					tabu.tab[posicaoY][posicaoX+i] = new Vazio(l);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+i],l);
				}
				i = 9;
			}
			else {
				i = i+1;
			}
		}
	}
}
