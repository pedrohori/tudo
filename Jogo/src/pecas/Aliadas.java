package pecas;

import Basico.Pecas;

public abstract class Aliadas extends Pecas {
	public static int custo;

	public void mostrar(){
        System.out.print(nome+" ");
    }
	
	public void mover(int posicaoX, int posicaoY) {
		
	}

	public abstract void interagir(int posicaoX, int posicaoY);
}
