package pt.pecas;

import pt.principal.*;

public class Vazio extends Pecas {

	private static final long serialVersionUID = 1L;
	public Vazio(int z) {
		super("src\\assets\\vazio.png", z);
		nome = '-';
		tipo = "vazio";
	}


	public void mostrar() {
		System.out.print(nome+" ");
	}

	public void interagir(int posicaoX, int posicaoY) {}

	protected void mover(int posicaoX, int posicaoY) {}
}
