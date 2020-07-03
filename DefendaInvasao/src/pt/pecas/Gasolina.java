package pt.pecas;
import pt.principal.*;
public class Gasolina  extends Aliadas{

	private static final long serialVersionUID = 1L;
	public Gasolina (Tabuleiro tab,int z) {
		super("src\\assets\\posto.png",z);
		custo = 50;
		vida = 1;
		nome = 'g';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {
	}

	
}
