package pt;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class Principal extends JFrame{
	private static final long serialVersionUID = 1L;
	public int y = 0; //posicao do personagem
	public int z = 0;
	public Fundo tab [][] = new Fundo [6][6];
	private JPanel painelFundo, painelGrid, painelControle;
	public Principal() {
		super("Laboratorio 11 - ra241640 & ra223402");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	public void janelaVisual() {
		setSize(610,700);
		
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
		painelFundo = new JPanel();
		painelFundo.setLayout(new BorderLayout());
		painelPrincipal.add(painelFundo, BorderLayout.CENTER);
	
		painelGrid = new JPanel();
		painelGrid.setLayout(new GridLayout(6,6));
		painelFundo.add(painelGrid, BorderLayout.NORTH);
		
		painelControle = new JPanel();
		painelControle.setLayout(new FlowLayout());
		painelPrincipal.add(painelControle, BorderLayout.SOUTH);
		
		setVisible(true);
			
	}
	
	public void criarFundo(Principal p) {
		int z = 0;
		for(int i=0; i<6;i++) {
			for(int j=0; j<6;j++) {
				tab[i][j] = new Fundo("imagens\\cont.png",z,p);
				z++;
			}
		}
		tab[0][0] = new Fundo("imagens\\monstrinho.png",0,p);
		tab[5][5] = new Fundo("imagens\\monstrinho.png",35,p);
	}
	
	public void addFundo() {
		for(int i=0; i<6;i++) {
			for(int j=0; j<6;j++) {
				//System.out.println(tab[i][j].x);
				adicionaPeca(tab[i][j],tab[i][j].x);
			}
		}
	}
	public void removertudo() {
		for(int i=0; i<6;i++) {
			for(int j=0; j<6;j++) {
				//System.out.println(tab[i][j].x);
				removerPeca(tab[i][j].x);
			}
		}
	}
	public void adicionaPeca(Fundo img) {
		painelGrid.add(img);
		SwingUtilities.updateComponentTreeUI(this);
	    
	}
	public void adicionaPeca(Fundo img, int posicao) {
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
