package pecas;

import Basico.Pecas;

public abstract class Inimigas extends Pecas {
	
	int dano;
	
	public void mostrar(){
        System.out.print(nome+" ");
    }
	
	public void causarDano(int posicaoX, int posicaoY, int x, int y, int dano) {
		tabu.tab[posicaoX+x][posicaoY+y].vida = tabu.tab[posicaoX+x][posicaoY+y].vida - dano;
		if (tabu.tab[posicaoX+x][posicaoY+y].vida <= 0) {
			andar(posicaoX, posicaoY, x, y);
		}
	}
	
	public abstract void andar(int posicaoX, int posicaoY, int x, int y);

	public abstract void interagir(int posicaoX, int posicaoY);
	
	public abstract void mover(int posicaoX, int posicaoY);
}
