package pt.pecas;
import pt.principal.*;
public class Explosivo extends Aliadas {
	
	private static final long serialVersionUID = 1L;
	int cronometro = 0;

	public Explosivo (Tabuleiro tab,int z) {
		super("src\\assets\\bomba.png",z);
		custo = 200;
		vida = 1;
		nome = 'e';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		cronometro = cronometro+1;
		if(cronometro == 3) {
			if(posicaoX == 0 && posicaoY == 0) {
				if (tabu.tab[posicaoY][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoY][posicaoX+1] = new Vazio(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+1],tabu.tab[posicaoY][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX+1] = new Vazio(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX+1],tabu.tab[posicaoY+1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX] = new Vazio(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX],tabu.tab[posicaoY+1][posicaoX].pos);
				}
			}
			else if(posicaoY == 0 && posicaoX == 9) {
				if (tabu.tab[posicaoY+1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX] = new Vazio(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX],tabu.tab[posicaoY+1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX-1] = new Vazio(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX-1],tabu.tab[posicaoY+1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX-1] = new Vazio(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX-1],tabu.tab[posicaoY][posicaoX-1].pos);
				}
			}
			else if(posicaoY == 5 && posicaoX == 0) {
				if (tabu.tab[posicaoY-1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX] = new Vazio(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX+1] = new Vazio(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX+1],tabu.tab[posicaoY-1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX+1] = new Vazio(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+1],tabu.tab[posicaoY][posicaoX+1].pos);
				}
			}
			else if(posicaoX == 9 && posicaoY == 5) {
				if (tabu.tab[posicaoY-1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX] = new Vazio(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX-1] = new Vazio(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX-1],tabu.tab[posicaoY-1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX-1] = new Vazio(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX-1],tabu.tab[posicaoY][posicaoX-1].pos);
				}
			}
			else if(posicaoY == 0) {
				if (tabu.tab[posicaoY+1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX] = new Vazio(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX+1] = new Vazio(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX+1],tabu.tab[posicaoY+1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX-1] = new Vazio(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX-1],tabu.tab[posicaoY+1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX-1] = new Vazio(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX-1],tabu.tab[posicaoY][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX+1] = new Vazio(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+1],tabu.tab[posicaoY][posicaoX+1].pos);
				}
			}
			else if(posicaoY == 5) {
				if (tabu.tab[posicaoY-1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX] = new Vazio(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX+1] = new Vazio(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX+1],tabu.tab[posicaoY-1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX-1] = new Vazio(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX-1],tabu.tab[posicaoY-1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX-1] = new Vazio(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX-1],tabu.tab[posicaoY][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX+1] = new Vazio(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+1],tabu.tab[posicaoY][posicaoX+1].pos);
				}
			}
			else if(posicaoX == 0) {
				if (tabu.tab[posicaoY+1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX+1] = new Vazio(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX+1],tabu.tab[posicaoY+1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX] = new Vazio(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX],tabu.tab[posicaoY+1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX] = new Vazio(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX+1] = new Vazio(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX+1],tabu.tab[posicaoY-1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX+1] = new Vazio(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+1],tabu.tab[posicaoY][posicaoX+1].pos);
				}
			}
			else if(posicaoX == 9) {
				if (tabu.tab[posicaoY+1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX-1] = new Vazio(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX-1],tabu.tab[posicaoY+1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX] = new Vazio(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX],tabu.tab[posicaoY+1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX] = new Vazio(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX-1] = new Vazio(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX-1],tabu.tab[posicaoY-1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX-1] = new Vazio(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX-1],tabu.tab[posicaoY][posicaoX-1].pos);
				}
			}
			else {
				if (tabu.tab[posicaoY+1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX+1] = new Vazio(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX+1],tabu.tab[posicaoY+1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX] = new Vazio(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX],tabu.tab[posicaoY+1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY+1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY+1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY+1][posicaoX-1] = new Vazio(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY+1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY+1][posicaoX-1],tabu.tab[posicaoY+1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX] = new Vazio(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX],tabu.tab[posicaoY-1][posicaoX].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX+1] = new Vazio(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX+1],tabu.tab[posicaoY-1][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY-1][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY-1][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY-1][posicaoX-1] = new Vazio(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY-1][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY-1][posicaoX-1],tabu.tab[posicaoY-1][posicaoX-1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX+1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX+1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX+1] = new Vazio(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX+1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX+1],tabu.tab[posicaoY][posicaoX+1].pos);
				}
				if (tabu.tab[posicaoY][posicaoX-1].tipo == "Inimigas" || tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
					tabu.tab[posicaoY][posicaoX-1] = new Vazio(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.removerPeca(tabu.tab[posicaoY][posicaoX-1].pos);
					tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX-1],tabu.tab[posicaoY][posicaoX-1].pos);
				}
			}
			tabu.tab[posicaoY][posicaoX] = new Vazio(tabu.tab[posicaoY][posicaoX].pos);
			tabu.removerPeca(tabu.tab[posicaoY][posicaoX].pos);
			tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX],tabu.tab[posicaoY][posicaoX].pos);
		}
	}

	
}
