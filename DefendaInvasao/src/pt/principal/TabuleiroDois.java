package pt.principal;


import pt.pecas.*;

public class TabuleiroDois extends Tabuleiro implements ITabuleiroDois{

	public TabuleiroDois(String s) {
		super(s);
		
	}


	private static final long serialVersionUID = 806533332266749533L;

	
	public void entrarDois(int l, int posicaoY) {
		removerPeca(l);
		if(rodada%3==0) {
			tab[posicaoY][9] = new Monstro(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%3==1) {
			tab[posicaoY][9] = new MonstroRapido(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%3==2) {
			tab[posicaoY][9] = new MonstroForte(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		
	}

}
