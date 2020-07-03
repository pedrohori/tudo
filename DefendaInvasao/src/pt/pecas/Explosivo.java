package pt.pecas;
import pt.principal.*;
public class Explosivo extends Aliadas {
	
	private static final long serialVersionUID = 1L;
	int cronometro = 0;

	public Explosivo (Tabuleiro tab,int z) {
		super("src\\assets\\bomba.png",z);
		custo = 50;
		vida = 1;
		nome = 'e';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		/*cronometro = cronometro+1;
		if(cronometro == 3) {
			if(posicaoX == 0 && posicaoY == 0) {
				if (tabu.tab[posicaoX+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+1] = new Vazio();
				}
			}
			else if(posicaoX == 0 && posicaoY == 9) {
				if (tabu.tab[posicaoX+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY-1] = new Vazio();
				}
			}
			else if(posicaoX == 5 && posicaoY == 0) {
				if (tabu.tab[posicaoX-1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+1] = new Vazio();
				}
			}
			else if(posicaoX == 5 && posicaoY == 9) {
				if (tabu.tab[posicaoX-1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY-1] = new Vazio();
				}
			}
			else if(posicaoX == 0) {
				if (tabu.tab[posicaoX+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+1] = new Vazio();
				}
			}
			else if(posicaoX == 5) {
				if (tabu.tab[posicaoX-1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+1] = new Vazio();
				}
			}
			else if(posicaoY == 0) {
				if (tabu.tab[posicaoX+1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+1] = new Vazio();
				}
			}
			else if(posicaoY == 9) {
				if (tabu.tab[posicaoX+1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY-1] = new Vazio();
				}
			}
			else {
				if (tabu.tab[posicaoX+1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX+1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX+1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX+1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX-1][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX-1][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX-1][posicaoY-1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY+1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY+1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY+1] = new Vazio();
				}
				if (tabu.tab[posicaoX][posicaoY-1].tipo == "Inimigas" || tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
					tabu.tab[posicaoX][posicaoY-1] = new Vazio();
				}
			}
			tabu.tab[posicaoX][posicaoY] = new Vazio();
		}*/
	}

	
}
