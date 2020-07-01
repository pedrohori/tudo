package pt.pecas;
import pt.principal.*;
public class Barreira extends Aliadas{

	private static final long serialVersionUID = 1L;
	public Barreira (Tabuleiro tab,int z) {
		super("src\\assets\\barreira.png",z);
		custo = 150;
		vida = 5;
		nome = 'b';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
	}
}
