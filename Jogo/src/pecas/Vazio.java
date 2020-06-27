package pecas;

import Basico.Pecas;

public class Vazio extends Pecas{
	
	public Vazio() {
		nome = '-';
		tipo = "vazio";
	}


	public void mostrar() {
		System.out.print(nome+" ");
	}

	public void interagir(int posicaoX, int posicaoY) {
		
	}

	protected void mover(int posicaoX, int posicaoY) {
		
	}
}
