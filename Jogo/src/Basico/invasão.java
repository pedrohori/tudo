package Basico;

import java.util.Random;

//import pecas.Arvore;
//import pecas.Lago;
import pecas.Monstro;
//import pecas.Pedra;
import pecas.Gasolina;
import pecas.Barreira;
import pecas.Explosivo;
import pecas.Soldado;
import pecas.Tanque;
import pecas.Vazio;
import pecas.Fabrica;

import java.util.Scanner;

public class invasão {
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		Tabuleiro jogo1 = new Tabuleiro();
		
		jogo1.criarTab(6, 10);
		
		jogo1.fazerTab(4, 3, 2, 300, 20);
		
		jogo1.mostrarTab();
		Random rand = new Random();
		int novoMonstro;
		
		while (jogo1.rodada < jogo1.fim && jogo1.vitoria == true) {
			System.out.println("Escolha sua ação: Next(1); Construir(2).");
			int n = reader.nextInt();
			if (n==1) {
				jogo1.executar();
				novoMonstro = rand.nextInt(5);
				jogo1.tab[novoMonstro][9] = new Monstro(jogo1);
				jogo1.mostrarTab();
			}
			
			if (n==2) {
				System.out.println("Escolha sua construção: Fábrica(1); Soldado(2); Barreira(3); Tanque(4); Posto de Gasolina(5); Explosivo(6).");
				int c = reader.nextInt();
				
				if (c==1) {
					System.out.println("Digite as coordenadas da Fábrica:");
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
				else if (c==3) {
					System.out.println("Digite as coordenadas da Barreira:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Barreira(jogo1);
						if (jogo1.rec.dinheiro >= Barreira.custo) {
							jogo1.rec.alterarRecursos(0, Barreira.custo);
							System.out.println("Barreira construida");
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
				else if (c==4) {
					System.out.println("Digite as coordenadas do Tanque:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Tanque(jogo1);
						if (jogo1.rec.dinheiro >= Tanque.custo) {
							jogo1.rec.alterarRecursos(0, Tanque.custo);
							System.out.println("Tanque construido");
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
				else if (c==5) {
					System.out.println("Digite as coordenadas do Posto de Gasolina:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Gasolina(jogo1);
						if (jogo1.rec.dinheiro >= Gasolina.custo) {
							jogo1.rec.alterarRecursos(0, Gasolina.custo);
							System.out.println("Posto de Gasolina construido");
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
				else if (c==6) {
					System.out.println("Digite as coordenadas do Explosivo:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Explosivo(jogo1);
						if (jogo1.rec.dinheiro >= Explosivo.custo) {
							jogo1.rec.alterarRecursos(0, Explosivo.custo);
							System.out.println("Explosivo construido");
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
		while (jogo1.vitoria == true && jogo1.procurarMonstro() == true) {
			System.out.println("Escolha sua ação: Next(1); Construir(2).");
			int n = reader.nextInt();
			if (n==1) {
				jogo1.executar();
				jogo1.mostrarTab();
			}
			
			if (n==2) {
				System.out.println("Escolha sua construção: Fábrica(1); Soldado(2); Barreira(3); Tanque(4); Posto de Gasolina(5); Explosivo(6).");
				int c = reader.nextInt();
				
				if (c==1) {
					System.out.println("Digite as coordenadas da Fábrica:");
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
				else if (c==3) {
					System.out.println("Digite as coordenadas da Barreira:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Barreira(jogo1);
						if (jogo1.rec.dinheiro >= Barreira.custo) {
							jogo1.rec.alterarRecursos(0, Barreira.custo);
							System.out.println("Barreira construida");
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
				else if (c==4) {
					System.out.println("Digite as coordenadas do Tanque:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Tanque(jogo1);
						if (jogo1.rec.dinheiro >= Tanque.custo) {
							jogo1.rec.alterarRecursos(0, Tanque.custo);
							System.out.println("Tanque construido");
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
				else if (c==5) {
					System.out.println("Digite as coordenadas do Posto de Gasolina:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Gasolina(jogo1);
						if (jogo1.rec.dinheiro >= Gasolina.custo) {
							jogo1.rec.alterarRecursos(0, Gasolina.custo);
							System.out.println("Posto de Gasolina construido");
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
				else if (c==6) {
					System.out.println("Digite as coordenadas do Explosivo:");
					int x = reader.nextInt();
					int y = reader.nextInt();
					if (jogo1.tab[y][x].nome == '-') {
						jogo1.tab[y][x] = new Explosivo(jogo1);
						if (jogo1.rec.dinheiro >= Explosivo.custo) {
							jogo1.rec.alterarRecursos(0, Explosivo.custo);
							System.out.println("Explosivo construido");
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
		if (jogo1.vitoria == true) {
			System.out.println("PARABÉNS!!!!");
			System.out.println("VOCÊ SE DEFENDEU DA INVASÃO");
		}
	}
}
