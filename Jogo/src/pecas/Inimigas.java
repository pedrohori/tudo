package pecas;

import Basico.Pecas;

public abstract class Inimigas extends Pecas {
	public int velocidade;
	
	public void mostrar(){
        System.out.print(nome+" ");
    }

	public abstract void interagir(int posicaoX, int posicaoY);
	
	public abstract void mover(int posicaoX, int posicaoY);
}
