package Basico;

public abstract class Pecas implements IPecas{
	public String tipo;
	public char nome; 
	public int posicaoX;
	public int posicaoY;
	public int vida;
	public Tabuleiro tabu;
	public Recursos dinheiro;
	
	public abstract void mostrar();

	public abstract void interagir(int posicaoX, int posicaoY);

	protected abstract void mover(int posicaoX, int posicaoY);
}
