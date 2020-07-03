package pt.principal;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public abstract class Pecas extends JLabel implements IPecas{

	private static final long serialVersionUID = 1L;
	
	public String tipo;
	public char nome; 
	public int posicaoX;
	public int posicaoY;
	public int vida;
	public Tabuleiro tabu;
	public Recursos dinheiro;
	public int pos;//posicao no grid
	
	public Pecas(String s,int z) {
		super(new ImageIcon(s));
		this.pos = z; 
	}
	
	//protected abstract void define(char tipo);
	
	public abstract void mostrar();//vai sair

	public abstract void interagir(int posicaoX, int posicaoY);

	protected abstract void mover(int posicaoX, int posicaoY);
	
}
