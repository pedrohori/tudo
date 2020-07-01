package pecas;

import Basico.Tabuleiro;

public class Monstro_Forte extends Inimigas {
	
	public Monstro_Forte(Tabuleiro tab) {
		vida = 5;
		nome = 'M';
		tipo = "Inimigas";
		this.tabu = tab;
	}
	
	
	public void mover(int posicaoX, int posicaoY) {
		if (posicaoY == 0) {
			System.out.println("GAME OVER");
			tabu.vitoria = false;
		}
		else if (tabu.tab[posicaoX][posicaoY-1].nome == '-') {
			tabu.tab[posicaoX][posicaoY-1] = new Monstro_Forte(tabu);
			tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY].vida;
			tabu.tab[posicaoX][posicaoY] = new Vazio();
		}
		else{
			interagir(posicaoX, posicaoY);
		}
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		
		if (tabu.tab[posicaoX][posicaoY-1].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-1].nome == 'a') {
			tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY-1].vida -2;
			if (tabu.tab[posicaoX][posicaoY-1].vida <= 0) {
				tabu.tab[posicaoX][posicaoY-1] = new Monstro_Forte(tabu);
				tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY].vida;
				tabu.tab[posicaoX][posicaoY] = new Vazio();
			}
		}
		else if (tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
			if ((posicaoY-1) == 0) {
				System.out.println("GAME OVER");
			}
			else if (tabu.tab[posicaoX][posicaoY-2].nome == '-') {
				tabu.tab[posicaoX][posicaoY-2] = new Monstro_Forte(tabu);
				tabu.tab[posicaoX][posicaoY-2].vida = tabu.tab[posicaoX][posicaoY].vida;
				tabu.tab[posicaoX][posicaoY] = new Vazio();
			}
			else if (tabu.tab[posicaoX][posicaoY-2].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-2].nome == 'a') {
				tabu.tab[posicaoX][posicaoY-2].vida = tabu.tab[posicaoX][posicaoY-2].vida -2;
				if (tabu.tab[posicaoX][posicaoY-2].vida <= 0) {
					tabu.tab[posicaoX][posicaoY-2] = new Monstro_Forte(tabu);
					tabu.tab[posicaoX][posicaoY-2].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();
				}
			}
		}
		
		if (tabu.tab[posicaoX][posicaoY-1].nome == 'l') {
			if (posicaoY == 0) {
				if (tabu.tab[posicaoX+1][posicaoY].nome == '-') {
					tabu.tab[posicaoX+1][posicaoY] = new Monstro_Forte(tabu);
					tabu.tab[posicaoX+1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();
				}
				else if (tabu.tab[posicaoX+1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX+1][posicaoY].nome == 'a') {
					tabu.tab[posicaoX+1][posicaoY].vida = tabu.tab[posicaoX+1][posicaoY].vida -2;
					if (tabu.tab[posicaoX+1][posicaoY].vida == 0) {
						tabu.tab[posicaoX+1][posicaoY] = new Monstro_Forte(tabu);
						tabu.tab[posicaoX+1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
						tabu.tab[posicaoX][posicaoY] = new Vazio();
					}
				}
			}
			else {
				if (tabu.tab[posicaoX-1][posicaoY].nome == '-') {
					tabu.tab[posicaoX-1][posicaoY] = new Monstro_Forte(tabu);
					tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();
				}
				else if (tabu.tab[posicaoX-1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX-1][posicaoY].nome == 'a') {
					tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX-1][posicaoY].vida -2;
					if (tabu.tab[posicaoX-1][posicaoY].vida == 0) {
						tabu.tab[posicaoX-1][posicaoY] = new Monstro_Forte(tabu);
						tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
						tabu.tab[posicaoX][posicaoY] = new Vazio();
					}
				}
			}
		}
	}
}