package pecas;

import Basico.Pecas;

public abstract class Neutras extends Pecas{
		
	public void mostrar(){
		System.out.print(nome+" ");
	}
	public void mover(int posicaoX, int posicaoY) {
		
	}

	public abstract void interagir(int posicaoX, int posicaoY);
}
