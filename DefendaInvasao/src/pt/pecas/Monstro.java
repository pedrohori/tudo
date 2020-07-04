package pt.pecas;
import pt.principal.*;
public class Monstro extends Inimigas{

	private static final long serialVersionUID = 1L;
	
	public Monstro(Tabuleiro tab,int z) {
		super("src\\assets\\monstro1.png",z);
		vida = 1;
		nome = 'm';
		tipo = "Inimigas";
		dano = 1;
		this.tabu = tab;
	}
	

	
	public void andar(int posicaoX, int posicaoY, int x, int y, int l) {
		
		int v =tabu.tab[posicaoY+y][posicaoX+x].pos;
		tabu.tab[posicaoY+y][posicaoX+x] = new Monstro(tabu,v);
		tabu.tab[posicaoY+y][posicaoX+x].vida = tabu.tab[posicaoY][posicaoX].vida;
		tabu.tab[posicaoY][posicaoX] = new Vazio(l);
		
		tabu.removerPeca(l);
		tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX],l);
		
		tabu.removerPeca(v);
		tabu.adicionaPeca(tabu.tab[posicaoY+y][posicaoX+x],v);
	}
	public void mover(int posicaoX, int posicaoY) {
		if(posicaoX==0) {
			tabu.vitoria= false;
		}
		else if(tabu.tab[posicaoY][posicaoX-1].nome == '-') {
			andar(posicaoX,posicaoY,-1,0,tabu.tab[posicaoY][posicaoX].pos);
		}
		else {
			interagir(posicaoX, posicaoY);
		}
	}
	
	public void interagir(int posicaoX, int posicaoY) {
		super.interagir(posicaoX, posicaoY);
		/*if (tabu.tab[posicaoY][posicaoX-1].tipo == "Aliadas" || tabu.tab[posicaoY][posicaoX-1].nome == 'a') {
			if(tabu.tab[posicaoY][posicaoX-1].nome!='e') {
				causarDano(posicaoX, posicaoY, -1, 0, dano);
			}
			
		}
		else if (tabu.tab[posicaoY][posicaoX-1].nome == 'p') {
			if ((posicaoX-1) == 0) {
				tabu.vitoria=false;
			}
			else if (tabu.tab[posicaoY][posicaoX-2].nome == '-') {
				andar(posicaoX, posicaoY, -2, 0,tabu.tab[posicaoY][posicaoX].pos);
			}
			else if (tabu.tab[posicaoY][posicaoX-2].tipo == "Aliadas" || tabu.tab[posicaoY][posicaoX-2].nome == 'a') {
				if(tabu.tab[posicaoY][posicaoX-2].nome!='e') {
					causarDano(posicaoX, posicaoY, -2, 0, dano);
				}
			}
		}
		else if (tabu.tab[posicaoY][posicaoX-1].nome == 'l') {
			if (posicaoY == 0) {
				if (tabu.tab[posicaoY+1][posicaoX].nome == '-') {
					andar(posicaoX, posicaoY, 0, 1,tabu.tab[posicaoY][posicaoX].pos);
				}
				else if (tabu.tab[posicaoY+1][posicaoX].tipo == "Aliadas" || tabu.tab[posicaoX+1][posicaoY].nome == 'a') {
					if(tabu.tab[posicaoY+1][posicaoX].nome!='e') {
						causarDano(posicaoX, posicaoY, 0, 1, dano);
					}
				}
			}
			else {
				if (tabu.tab[posicaoY-1][posicaoX].nome == '-') {
					andar(posicaoX, posicaoY, 0, -1,tabu.tab[posicaoY][posicaoX].pos);
				}
				else if (tabu.tab[posicaoY-1][posicaoX].tipo == "Aliadas" || tabu.tab[posicaoY-1][posicaoX].nome == 'a') {
					if(tabu.tab[posicaoY][posicaoX-1].nome!='e') {
						causarDano(posicaoX, posicaoY, 0, -1, dano);
					}
					
				}
			}
		}*/
		
	}




}
