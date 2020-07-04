package pt.pecas;
import pt.principal.*;
public class Soldado extends Aliadas {

	private static final long serialVersionUID = 1L;

	public Soldado(Tabuleiro tab,int z) {
		super("src\\assets\\soldado.png",z);
		custo = 100;
		vida = 1;
		nome = 's';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void atirar(int posicaoX, int posicaoY, int dano){
		super.atirar(posicaoX, posicaoY, dano);
		
	}
	public void interagir(int posicaoX, int posicaoY) {
		atirar(posicaoX, posicaoY, 1);
	}

	
}
