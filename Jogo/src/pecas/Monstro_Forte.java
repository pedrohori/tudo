package pecas;

import Basico.Tabuleiro;

public class Monstro_Forte extends Inimigas {
	
	public Monstro_Forte(Tabuleiro tab) {
		vida = 5;
		dano = 2;
		nome = 'M';
		tipo = "Inimigas";
		this.tabu = tab;
	}
	
	public void andar(int posicaoX, int posicaoY, int x, int y) {
		tabu.tab[posicaoX+x][posicaoY+y] = new Monstro_Forte(tabu);
		tabu.tab[posicaoX+x][posicaoY+y].vida = tabu.tab[posicaoX][posicaoY].vida;
		tabu.tab[posicaoX][posicaoY] = new Vazio();
	}
	
	public void mover(int posicaoX, int posicaoY) {
		if (posicaoY == 0) {
			System.out.println("GAME OVER");
			tabu.vitoria = false;
		}
		else if (tabu.tab[posicaoX][posicaoY-1].nome == '-') {
			andar(posicaoX, posicaoY, 0, -1);
		}
		else{
			interagir(posicaoX, posicaoY);
		}
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		
		if (tabu.tab[posicaoX][posicaoY-1].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-1].nome == 'a') {
			causarDano(posicaoX, posicaoY, 0, -1, dano);
		}
		
		else if (tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
			if ((posicaoY-1) == 0) {
				System.out.println("GAME OVER");
			}
			else if (tabu.tab[posicaoX][posicaoY-2].nome == '-') {
				andar(posicaoX, posicaoY, 0, -2);
			}
			else if (tabu.tab[posicaoX][posicaoY-2].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-2].nome == 'a') {
				causarDano(posicaoX, posicaoY, 0, -2, dano);
			}
		}
		
		else if (tabu.tab[posicaoX][posicaoY-1].nome == 'l') {
			if (posicaoY == 0) {
				if (tabu.tab[posicaoX+1][posicaoY].nome == '-') {
					andar(posicaoX, posicaoY, 1, 0);
				}
				else if (tabu.tab[posicaoX+1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX+1][posicaoY].nome == 'a') {
					causarDano(posicaoX, posicaoY, 1, 0, dano);
				}
			}
			else {
				if (tabu.tab[posicaoX-1][posicaoY].nome == '-') {
					andar(posicaoX, posicaoY, -1, 0);
				}
				else if (tabu.tab[posicaoX-1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX-1][posicaoY].nome == 'a') {
					causarDano(posicaoX, posicaoY, -1, 0, dano);
				}
			}
		}
	}
}
