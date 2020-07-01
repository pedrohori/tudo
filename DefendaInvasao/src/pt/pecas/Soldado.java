package pt.pecas;
import pt.principal.*;
public class Soldado extends Aliadas {

	private static final long serialVersionUID = 1L;

	public Soldado(Tabuleiro tab,int z) {
		super("src\\assets\\fabrica.png",z);
		custo = 100;
		vida = 1;
		nome = 's';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		int i = 0;
		while((i + posicaoY + 1) < 10) {
			if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
				tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 1;
				if (tabu.tab[posicaoX][posicaoY+i+1].vida == 0) {
					tabu.tab[posicaoX][posicaoY+i+1] = new Vazio();
				}
				i = 9;
			}
			else {
				i = i+1;
			}
		}
	}
}