package Basico;

import java.util.Random;

import pecas.Arvore;
import pecas.Lago;
import pecas.Pedra;
import pecas.Vazio;

public class Tabuleiro implements ITabuleiro{
	
	int rodada=0;
	public Pecas tab[][];
	public void criarTab(int a, int b) {//cria os objetos na matriz
        this.tab = new Pecas [a][b];
        for (int i=0; i < a; i++) {
        	for (int j=0; j < b; j++) {
        		tab[i][j] = new Vazio();
        	}
        }
	}
	
	void fazerTab(int arvores, int pedras, int lagos) {
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
		for (int i=0; i<10; i++){
            for (int j=0; j<6; j++){
            	if (tab[j][i].nome != '-') {
            		if (tab[j][i].tipo == "inimigas") {
            			System.out.println("top");
            			tab[j][i].mover(j, i);
            		}
            	}
            }
		}
	}
	
	void mostrarTab(){
		for (int i=0; i<6; i++){
            for (int j=0; j<10; j++){
            	if (tab[i][j].nome == '-') {
            		System.out.print("- ");
            	}
            	else {
            		tab[i][j].mostrar();
            	}
            }
            System.out.println();
		}
		System.out.println();
	}
}
