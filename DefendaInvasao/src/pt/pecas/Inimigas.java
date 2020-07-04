package pt.pecas;
import pt.principal.*;
public abstract class Inimigas extends Pecas {
	private static final long serialVersionUID = 1L;
	int dano;
	public Inimigas(String s,int z) {
		super(s,z);
	}

	public void causarDano(int posicaoX, int posicaoY, int x, int y, int dano) {
		tabu.tab[posicaoY+y][posicaoX+x].vida = tabu.tab[posicaoY+y][posicaoX+x].vida - dano;
		if (tabu.tab[posicaoY+y][posicaoX+x].vida <= 0) {
			
			andar(posicaoX, posicaoY, x, y,tabu.tab[posicaoY][posicaoX].pos);
		}
	}	
	
	public void interagir(int posicaoX, int posicaoY){
		if (tabu.tab[posicaoY][posicaoX-1].tipo == "Aliadas" || tabu.tab[posicaoY][posicaoX-1].nome == 'a') {
			if(tabu.tab[posicaoY][posicaoX-1].nome!='e') {
				causarDano(posicaoX, posicaoY, -1, 0, dano);
			}
			
		}
		else if (tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
			if ((posicaoX-1) == 0) {
				tabu.vitoria=false;
			}
			else if (tabu.tab[posicaoY][posicaoX-2].nome == '-') {
			
				andar(posicaoX, posicaoY, -2, 0,tabu.tab[posicaoY][posicaoX].pos);
			}
			else if (tabu.tab[posicaoY][posicaoX-2].tipo == "Aliadas" || tabu.tab[posicaoY][posicaoX-2].nome == 'a') {
				if(tabu.tab[posicaoY][posicaoX-2].nome!='e') {
					causarDano(posicaoX, posicaoY, -2, 0, dano);
				}
			}
		}
		else if (tabu.tab[posicaoY][posicaoX-1].nome == 'l') {
			if (posicaoY == 0) {
				if (tabu.tab[posicaoY+1][posicaoX].nome == '-') {
					andar(posicaoX, posicaoY, 0, 1,tabu.tab[posicaoY][posicaoX].pos);
				}
				else if (tabu.tab[posicaoY+1][posicaoX].tipo == "Aliadas" || tabu.tab[posicaoX+1][posicaoY].nome == 'a') {
					if(tabu.tab[posicaoY+1][posicaoX].nome!='e') {
						causarDano(posicaoX, posicaoY, 0, 1, dano);
					}
				}
			}
			else {
				if (tabu.tab[posicaoY-1][posicaoX].nome == '-') {
					andar(posicaoX, posicaoY, 0, -1,tabu.tab[posicaoY][posicaoX].pos);
				}
				else if (tabu.tab[posicaoY-1][posicaoX].tipo == "Aliadas" || tabu.tab[posicaoY-1][posicaoX].nome == 'a') {
					if(tabu.tab[posicaoY][posicaoX-1].nome!='e') {
						causarDano(posicaoX, posicaoY, 0, -1, dano);
					}
					
				}
			}
		}
	}
	public abstract void andar(int posicaoX, int posicaoY, int x, int y, int l);
	public abstract void mover(int posicaoX, int posicaoY);
}
