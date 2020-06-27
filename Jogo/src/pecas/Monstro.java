package pecas;

import Basico.Tabuleiro;

public class Monstro extends Inimigas {
	
	public Monstro(Tabuleiro tab) {
		vida = 1;
		velocidade = 1;
		nome = 'm';
		tipo = "inimigas";
		this.tabu = tab;
	}
	
	
	public void mover(int posicaoX, int posicaoY) {
		System.out.println(posicaoX-1);
		System.out.println(posicaoY);
		System.out.println(tabu.tab[3][3].nome);
		if (posicaoX == 0) {
			System.out.println("GAME OVER");
			//recomeçar;
		}
		else if (tabu.tab[posicaoX-1][posicaoY].nome == '-') {
			tabu.tab[posicaoX-1][posicaoY] = new Monstro(tabu);
			tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
			tabu.tab[posicaoX][posicaoY] = new Vazio();
		}
		else{
			interagir(posicaoX, posicaoY);
		}
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		
		if (tabu.tab[posicaoX-1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX-1][posicaoY].nome == 'a') {
			tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX-1][posicaoY].vida -1;
			if (tabu.tab[posicaoX-1][posicaoY].vida == 0) {
				tabu.tab[posicaoX-1][posicaoY] = new Vazio();
			}
		}
		else if (tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
			if ((posicaoX-1) == 0) {
				System.out.println("GAME OVER");
				//recomeçar;
			}
			else if (tabu.tab[posicaoX-2][posicaoY].nome == '-') {
				tabu.tab[posicaoX-2][posicaoY] = new Monstro(tabu);
				tabu.tab[posicaoX-2][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
				tabu.tab[posicaoX][posicaoY] = new Vazio();
			}
			else if (tabu.tab[posicaoX-2][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX-2][posicaoY].nome == 'a') {
				tabu.tab[posicaoX-2][posicaoY].vida = tabu.tab[posicaoX-2][posicaoY].vida -1;
				if (tabu.tab[posicaoX-2][posicaoY].vida == 0) {
					tabu.tab[posicaoX-2][posicaoY] = new Vazio();
				}
			}
		}
		
		if (tabu.tab[posicaoX-1][posicaoY].nome == 'l') {
			if (posicaoY == 0) {
				if (tabu.tab[posicaoX][posicaoY+1].nome == '-') {
					tabu.tab[posicaoX][posicaoY+1] = new Monstro(tabu);
					tabu.tab[posicaoX][posicaoY+1].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();
				}
				else if (tabu.tab[posicaoX][posicaoY+1].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY+1].nome == 'a') {
					tabu.tab[posicaoX][posicaoY+1].vida = tabu.tab[posicaoX][posicaoY+1].vida -1;
					if (tabu.tab[posicaoX][posicaoY+1].vida == 0) {
						tabu.tab[posicaoX][posicaoY+1] = new Vazio();
					}
				}
			}
			else {
				if (tabu.tab[posicaoX][posicaoY-1].nome == '-') {
					tabu.tab[posicaoX][posicaoY-1] = new Monstro(tabu);
					tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();
				}
				else if (tabu.tab[posicaoX][posicaoY-1].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-1].nome == 'a') {
					tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY-1].vida -1;
					if (tabu.tab[posicaoX][posicaoY-1].vida == 0) {
						tabu.tab[posicaoX][posicaoY-1] = new Vazio();
					}
				}
			}
		}
	}
}
