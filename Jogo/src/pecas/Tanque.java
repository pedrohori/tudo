package pecas;

import Basico.Tabuleiro;

public class Tanque extends Aliadas{

	public Tanque(Tabuleiro tab) {
		custo = 200;
		vida = 3;
		nome = 't';
		tipo = "Aliadas";
		this.tabu = tab;
	}

	public void interagir(int posicaoX, int posicaoY) {
		int i = 0;
		if(posicaoX == 0 && posicaoY == 0) {
			if (tabu.tab[posicaoX][posicaoY+1].nome == 'g' || tabu.tab[posicaoX+1][posicaoY].nome == 'g' ) {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoX == 0 && posicaoY == 9) {
			if (tabu.tab[posicaoX+1][posicaoY].nome == 'g' || tabu.tab[posicaoX][posicaoY-1].nome == 'g' ) {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoX == 5 && posicaoY == 0) {
			if (tabu.tab[posicaoX-1][posicaoY].nome == 'g' || tabu.tab[posicaoX][posicaoY+1].nome == 'g' ) {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoX == 5 && posicaoY == 9) {
			if (tabu.tab[posicaoX-1][posicaoY].nome == 'g' || tabu.tab[posicaoX][posicaoY-1].nome == 'g' ) {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoX == 0) {
			if (tabu.tab[posicaoX][posicaoY-1].nome == 'g' || tabu.tab[posicaoX][posicaoY+1].nome == 'g' || tabu.tab[posicaoX+1][posicaoY].nome == 'g') {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoX == 5) {
			if (tabu.tab[posicaoX][posicaoY-1].nome == 'g' || tabu.tab[posicaoX][posicaoY+1].nome == 'g' || tabu.tab[posicaoX-1][posicaoY].nome == 'g') {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoY == 0) {
			if (tabu.tab[posicaoX-1][posicaoY].nome == 'g' || tabu.tab[posicaoX][posicaoY+1].nome == 'g' || tabu.tab[posicaoX+1][posicaoY].nome == 'g') {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (posicaoY == 9) {
			if (tabu.tab[posicaoX][posicaoY-1].nome == 'g' || tabu.tab[posicaoX+1][posicaoY].nome == 'g' || tabu.tab[posicaoX-1][posicaoY].nome == 'g') {
				while((i + posicaoY + 1) < 10) {
					if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
						tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
						if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
		else if (tabu.tab[posicaoX][posicaoY+1].nome == 'g' || tabu.tab[posicaoX+1][posicaoY].nome == 'g' || tabu.tab[posicaoX-1][posicaoY].nome == 'g' || tabu.tab[posicaoX][posicaoY-1].nome == 'g') {
			while((i + posicaoY + 1) < 10) {
				if (tabu.tab[posicaoX][posicaoY+i+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+i+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+i+1].vida = tabu.tab[posicaoX][posicaoY+i+1].vida - 3;
					if (tabu.tab[posicaoX][posicaoY+i+1].vida <= 0) {
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
}