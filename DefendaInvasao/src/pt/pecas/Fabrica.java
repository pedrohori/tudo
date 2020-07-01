package pt.pecas;
import javax.swing.ImageIcon;

import pt.principal.*;
public class Fabrica extends Aliadas {

	private static final long serialVersionUID = 1L;

	public Fabrica(Tabuleiro tab,int z) {
		super("src\\assets\\fabrica.png",z);
		custo = 50;
		vida = 3;
		nome = 'f';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	//public void setRecursos(Recursos r) {
		//this.dinheiro = r;
	//}

	public void interagir(int posicaoX, int posicaoY) {
		tabu.rec.alterarRecursos(1, 10);
	}
}
