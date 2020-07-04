package pt.pecas;

import pt.principal.*;

public class Vazio extends Pecas {

	private static final long serialVersionUID = 1L;
	public Vazio(int z) {
		super("src\\assets\\vaziov.png", z);
		nome = '-';
		tipo = "vazio";
	}


	

	public void interagir(int posicaoX, int posicaoY) {}

	public void mover(int posicaoX, int posicaoY) {}


	
}
