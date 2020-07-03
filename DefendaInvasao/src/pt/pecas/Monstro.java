package pt.pecas;
import pt.principal.*;
public class Monstro extends Inimigas{

	private static final long serialVersionUID = 1L;
	
	public Monstro(Tabuleiro tab,int z) {
		super("src\\assets\\monstro1.png",z);
		vida = 1;
		nome = 'm';
		tipo = "Inimigas";
		this.tabu = tab;
	}
	
	public void entrar(int l, int posicaoY) {
		tabu.removerPeca(l);
		tabu.tab[posicaoY][9] = new Monstro(tabu,l);
		tabu.adicionaPeca(tabu.tab[posicaoY][9],l);
	}
	public void mover(int posicaoX, int posicaoY) {
		/*if (posicaoY == 0) {
			System.out.println("GAME OVER");
			tabu.vitoria = false;
		}
		else if (tabu.tab[posicaoX][posicaoY-1].nome == '-') {
			tabu.tab[posicaoX][posicaoY-1] = new Monstro(tabu);//falta a posicao
			tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY].vida;
			tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
		}
		else{
			interagir(posicaoX, posicaoY);
		}
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		
		if (tabu.tab[posicaoX][posicaoY-1].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-1].nome == 'a') {
			tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY-1].vida -1;
			if (tabu.tab[posicaoX][posicaoY-1].vida == 0) {
				tabu.tab[posicaoX][posicaoY-1] = new Monstro(tabu);//falta a posicao
				tabu.tab[posicaoX][posicaoY-1].vida = tabu.tab[posicaoX][posicaoY].vida;
				tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
			}
		}
		else if (tabu.tab[posicaoX][posicaoY-1].nome == 'p') {
			if ((posicaoY-1) == 0) {
				System.out.println("GAME OVER");
				//recomeçar;
			}
			else if (tabu.tab[posicaoX][posicaoY-2].nome == '-') {
				tabu.tab[posicaoX][posicaoY-2] = new Monstro(tabu);//falta a posicao
				tabu.tab[posicaoX][posicaoY-2].vida = tabu.tab[posicaoX][posicaoY].vida;
				tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
			}
			else if (tabu.tab[posicaoX][posicaoY-2].tipo == "Aliadas" || tabu.tab[posicaoX][posicaoY-2].nome == 'a') {
				tabu.tab[posicaoX][posicaoY-2].vida = tabu.tab[posicaoX][posicaoY-2].vida -1;
				if (tabu.tab[posicaoX][posicaoY-2].vida == 0) {
					tabu.tab[posicaoX][posicaoY-2] = new Monstro(tabu);//falta a posicao
					tabu.tab[posicaoX][posicaoY-2].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
				}
			}
		}
		
		if (tabu.tab[posicaoX][posicaoY-1].nome == 'l') {
			if (posicaoY == 0) {
				if (tabu.tab[posicaoX+1][posicaoY].nome == '-') {
					tabu.tab[posicaoX+1][posicaoY] = new Monstro(tabu);//falta a posicao
					tabu.tab[posicaoX+1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
				}
				else if (tabu.tab[posicaoX+1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX+1][posicaoY].nome == 'a') {
					tabu.tab[posicaoX+1][posicaoY].vida = tabu.tab[posicaoX+1][posicaoY].vida -1;
					if (tabu.tab[posicaoX+1][posicaoY].vida == 0) {
						tabu.tab[posicaoX+1][posicaoY] = new Monstro(tabu);//falta a posicao
						tabu.tab[posicaoX+1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
						tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
					}
				}
			}
			else {
				if (tabu.tab[posicaoX-1][posicaoY].nome == '-') {
					tabu.tab[posicaoX-1][posicaoY] = new Monstro(tabu);//falta a posicao
					tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
					tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
				}
				else if (tabu.tab[posicaoX-1][posicaoY].tipo == "Aliadas" || tabu.tab[posicaoX-1][posicaoY].nome == 'a') {
					tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX-1][posicaoY].vida -1;
					if (tabu.tab[posicaoX-1][posicaoY].vida == 0) {
						tabu.tab[posicaoX-1][posicaoY] = new Monstro(tabu);//falta a posicao
						tabu.tab[posicaoX-1][posicaoY].vida = tabu.tab[posicaoX][posicaoY].vida;
						tabu.tab[posicaoX][posicaoY] = new Vazio();//falta a posicao
					}
				}
			}
		}*/
	}


	@Override
	public void interagir(int posicaoX, int posicaoY) {
		// TODO Auto-generated method stub
		
	}

}
