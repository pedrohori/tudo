package pt.principal;

import pt.pecas.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tabuleiro extends JFrame implements ITabuleiro {
//precisa terminar;
	private static final long serialVersionUID = 1L;
	
	private JPanel painelFundo, painelGrid, painelControle;
	public JLabel label1,label2;
	public boolean vitoria;
	public int rodada=0;
	public int fim;
	public int posBot=0;
	public Recursos rec;
	public Pecas tab[][] = new Pecas [6][10];
	public int x,y;
	protected String fims;

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
		painelFundo.setSize(1010,610);
		painelPrincipal.add(painelFundo, BorderLayout.SOUTH);
		
		painelGrid = new JPanel();
		painelGrid.setLayout(new GridLayout(6,10));
		painelFundo.add(painelGrid, BorderLayout.SOUTH);
		
		painelControle = new JPanel();
		painelControle.setLayout(new FlowLayout());
		painelPrincipal.add(painelControle);
		
		
		
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
	
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo) {
		this.rec = new Recursos(r,this);
		
		this.fim = tempo;
		String s = Integer.toString(rec.dinheiro);
		label1 = new JLabel("Recursos disponiveis: " + s);
		String rod = Integer.toString(rodada);
		fims = Integer.toString(fim);
		label2 = new JLabel("Rodada "+rod+"/"+fims);
		painelControle.add(label2);
		painelControle.add(label1);
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
	public void addFundo() {
		for(int i=0; i<6;i++) {
			for(int j=0; j<10;j++) {
				//System.out.println(tab[i][j].x);
				adicionaPeca(tab[i][j],tab[i][j].pos);
			}
		}
	}
	
	public void entrar(int l, int posicaoY,char t) {
		
		removerPeca(l);
		if(t=='m') {
			tab[posicaoY][9] = new Monstro(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else {
			tab[posicaoY][9] = new MonstroRapido(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
	}
	
	public void executar() {
	
		if (rodada < fim) {
			rodada = rodada +1;
			String rod = Integer.toString(rodada);
			label2.setText("Rodada "+rod+"/"+fims);
			label2.updateUI();
		}
		for (int i=0; i<6; i++){
			for (int j=0; j<10; j++){
				if (tab[i][j].nome != '-') {
					if (tab[i][j].tipo == "Inimigas") {
						tab[i][j].mover(j, i);
					}
						
				}
			}
		}
		
		for (int i=0; i<6; i++){
			for (int j=0; j<10; j++){
				if (tab[i][j].nome != '-') {
					if (tab[i][j].tipo == "Aliadas") {
						tab[i][j].interagir(j, i);
					}
				}
			}
		}
		
	}
	
	public boolean procurarMonstro() {
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
	/*public void adicionaPeca(Pecas img) {
		painelGrid.add(img);
		SwingUtilities.updateComponentTreeUI(this);
	    
	}*/
	public void adicionaPeca(Pecas img, int posicao) {
		painelGrid.add(img,posicao);
		SwingUtilities.updateComponentTreeUI(this);
	    
	}
	
	 public void removerPeca(int posicao) {
	        painelGrid.remove(posicao);
	        SwingUtilities.updateComponentTreeUI(this);
	 }
	 public void adicionaComando (JButton comando) {
	
			 painelControle.add(comando);
			 SwingUtilities.updateComponentTreeUI(this);
		}
}
