package pt.principal;

import pt.pecas.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tabuleiro extends JFrame implements ITabuleiro {
//precisa terminar;
	private static final long serialVersionUID = 1L;
	
	private JPanel painelFundo, painelGrid, painelControle;
	
	public boolean vitoria;
	public int rodada=0;
	public int fim;
	public Recursos rec;
	public Pecas tab[][] = new Pecas [6][10];
	

	public Tabuleiro(String s) {
		super("Defenda-se da Invasão - "+ s);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		visual();
		
	}
	
	public void visual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
		painelFundo = new JPanel();
		painelFundo.setLayout(new BorderLayout());
		painelPrincipal.add(painelFundo, BorderLayout.CENTER);
		
		painelGrid = new JPanel();
		painelGrid.setLayout(new GridLayout(10,6));
		painelFundo.add(painelGrid, BorderLayout.SOUTH);
		
		painelControle = new JPanel();
		painelControle.setLayout(new FlowLayout());
		painelPrincipal.add(painelControle, BorderLayout.EAST);
		
		setVisible(true);
	}
	public void criarTab() {//cria os objetos na matriz
	    int z=0;
        for (int i=0; i < 6; i++) {
        	for (int j=0; j < 10; j++) {
        		tab[i][j] = new Vazio(z);
        		z++;
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
				tab[x][y] = new Arvore(tab[x][y].pos);
			}
			else {
				i=i-1;
			}
		}
		for (int i=0; i < pedras; i++) {
			x=randx.nextInt(5);
			y=randy.nextInt(8);
			if(tab[x][y].nome == '-') {
				tab[x][y] = new Pedra(tab[x][y].pos);
			}
			else {
				i=i-1;
			}
		}
		for (int i=0; i < lagos; i++) {
			x=randx.nextInt(5);
			y=randy.nextInt(8);
			if(tab[x][y].nome == '-') {
				tab[x][y] = new Lago(tab[x][y].pos);
			}
			else {
				i=i-1;
			}
		}
	}
	
	public void adicionaPeca(Pecas img) {
		painelGrid.add(img);
		SwingUtilities.updateComponentTreeUI(this);
	    
	}
	public void adicionaPeca(Pecas img, int posicao) {
		painelGrid.add(img,posicao);
		SwingUtilities.updateComponentTreeUI(this);
	    
	}
	
	 public void removerPeca(int posicao) {
	        painelGrid.remove(posicao);
	        SwingUtilities.updateComponentTreeUI(this);
	 }
}
