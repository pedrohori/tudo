package Basico;

import pecas.Arvore;
import pecas.Lago;
import pecas.Monstro;
import pecas.Pedra;
import pecas.Soldado;
import pecas.Fabrica;

import java.util.Scanner;

public class invasão {
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		Tabuleiro jogo1 = new Tabuleiro();
		
		jogo1.criarTab(6, 10);
		
		jogo1.fazerTab(0, 0, 0, 100);
		
		jogo1.tab[1][9] = new Monstro(jogo1);
		jogo1.tab[0][9] = new Monstro(jogo1);
		jogo1.tab[1][8] = new Monstro(jogo1);
		jogo1.tab[2][8] = new Monstro(jogo1);
		jogo1.tab[3][7] = new Monstro(jogo1);
		jogo1.tab[1][4] = new Soldado(jogo1);
		jogo1.tab[5][0] = new Fabrica(jogo1);
		jogo1.tab[4][0] = new Fabrica(jogo1);
		jogo1.tab[0][7] = new Arvore();
		jogo1.tab[0][5] = new Pedra();
		jogo1.tab[2][6] = new Arvore();
		jogo1.tab[3][5] = new Lago();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
		jogo1.executar();
		jogo1.mostrarTab();
	}
}
