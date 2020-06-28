package Basico;

import java.util.Random;

//import pecas.Arvore;
//import pecas.Lago;
import pecas.Monstro;
//import pecas.Pedra;
import pecas.Soldado;
import pecas.Vazio;
import pecas.Fabrica;

import java.util.Scanner;

public class invasão {
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		Tabuleiro jogo1 = new Tabuleiro();
		
		jogo1.criarTab(6, 10);
		
		jogo1.fazerTab(0, 0, 0, 10, 10);
		
		jogo1.mostrarTab();
		Random rand = new Random();
		int novoMonstro;
		
		while (jogo1.rodada < jogo1.fim) {
			int n = reader.nextInt();
			if (n==1) {
				jogo1.executar();
				novoMonstro = rand.nextInt(5);
				jogo1.tab[novoMonstro][9] = new Monstro(jogo1);
				jogo1.mostrarTab();
			}
			
			if (n==2) {
				System.out.println("Escolha sua construção:");
				int c = reader.nextInt();
				
				if (c==1) {
					System.out.println("Digite as coordenadas da fábrica:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-' ) {
						jogo1.tab[y][x] = new Fabrica(jogo1);
							if (jogo1.rec.dinheiro >= Fabrica.custo) {
								jogo1.rec.alterarRecursos(0, Fabrica.custo);
								System.out.println("Fabrica construida");
								jogo1.mostrarTab();
							}
							else {
								jogo1.tab[y][x] = new Vazio();
								System.out.println("Dinheiro insuficiente");
							}
					}
					else {
						System.out.println("Posição Inválida");
					}
				}
				else if (c==2) {
					System.out.println("Digite as coordenadas do Soldado:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Soldado(jogo1);
						if (jogo1.rec.dinheiro >= Soldado.custo) {
							jogo1.rec.alterarRecursos(0, Soldado.custo);
							System.out.println("Soldado construido");
							jogo1.mostrarTab();
						}
						else {
							jogo1.tab[y][x] = new Vazio();
							System.out.println("Dinheiro insuficiente");
						}
					}
					else {
						System.out.println("Construção Inválida");
					}
				}
			}
		}
		System.out.println("PARABÉNS!!!!");
		System.out.println("vOCE SE DEFENDEU DA INVASÃO");
		
		/*jogo1.tab[1][9] = new Monstro(jogo1);
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
		jogo1.mostrarTab();*/
	}
}
