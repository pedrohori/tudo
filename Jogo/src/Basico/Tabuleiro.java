package Basico;

import java.util.Random;

import pecas.Arvore;
import pecas.Lago;
import pecas.Pedra;
import pecas.Vazio;

public class Tabuleiro implements ITabuleiro{
	
	public boolean vitoria;
	public int rodada=0;
	public int fim;
	public Recursos rec;
	public Pecas tab[][];
	public void criarTab(int a, int b) {//cria os objetos na matriz
        this.tab = new Pecas [a][b];
        for (int i=0; i < a; i++) {
        	for (int j=0; j < b; j++) {
        		tab[i][j] = new Vazio();
        	}
        }
	}
	
	void fazerTab(int arvores, int pedras, int lagos, int r, int tempo) {
		this.rec = new Recursos(r);
		this.fim = tempo;
		this.vitoria = true;
		Random randx = new Random();
		Random randy = new Random();
		int x;
		int y;
		
		for (int i=0; i < arvores; i++) {
			x=randx.nextInt(5);
			y=randy.nextInt(8);
			if(tab[x][y].nome == '-') {
				tab[x][y] = new Arvore();
			}
			else {
				i=i-1;
			}
		}
		for (int i=0; i < pedras; i++) {
			x=randx.nextInt(5);
			y=randy.nextInt(8);
			if(tab[x][y].nome == '-') {
				tab[x][y] = new Pedra();
			}
			else {
				i=i-1;
			}
		}
		for (int i=0; i < lagos; i++) {
			x=randx.nextInt(5);
			y=randy.nextInt(8);
			if(tab[x][y].nome == '-') {
				tab[x][y] = new Lago();
			}
			else {
				i=i-1;
			}
		}
	}
	
	void executar() {
		if (rodada < fim) {
			rodada = rodada +1;
		}
		for (int i=0; i<10; i++){
            for (int j=0; j<6; j++){
            	if (tab[j][i].nome != '-') {
            		if (tab[j][i].tipo == "Inimigas") {
            			tab[j][i].mover(j, i);
            		}
            	}
            }
		}
		for (int i=0; i<10; i++){
            for (int j=0; j<6; j++){
            	if (tab[j][i].nome != '-') {
            		if (tab[j][i].tipo == "Aliadas") {
            			tab[j][i].interagir(j, i);
            		}
            	}
            }
		}
	}
	
	boolean procurarMonstro() {
		boolean monstro = false;
		for (int i=0; i<6; i++){
            for (int j=0; j<10; j++){
            	if (tab[i][j].tipo == "Inimigas") {
            		monstro = true;
            	}
            }
		}
		return(monstro);
	}
	
	void mostrarTab(){
		System.out.println("Rodada: "+ rodada +"/" + fim);
		rec.mostrarRecursos();
		for (int i=0; i<6; i++){
            for (int j=0; j<10; j++){
            	tab[i][j].mostrar();
            }
            System.out.println();
            
		}
		System.out.println();
	}
}
