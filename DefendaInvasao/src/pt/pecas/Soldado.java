package pt.pecas;
import pt.principal.*;
public class Soldado extends Aliadas {

	private static final long serialVersionUID = 1L;

	public Soldado(Tabuleiro tab,int z) {
		super("src\\assets\\soldado.png",z);
		custo = 100;
		vida = 1;
		nome = 's';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
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
	public void interagir(int posicaoX, int posicaoY) {
		atirar(posicaoX, posicaoY, 1);
	}

	
}
