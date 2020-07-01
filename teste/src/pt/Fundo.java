package pt;

import javax.swing.JLabel;

import java.util.Random;

import javax.swing.ImageIcon;

public class Fundo extends JLabel {
	public int x;
	public Principal p;
	private static final long serialVersionUID = 1L;
	public Fundo(String fundo, int x, Principal p) {
		super(new ImageIcon(fundo));
		this.x= x;
		this.p = p;
	}
	
	public void cima() {
		int l = p.tab[p.y][p.z].x;
    	p.removerPeca(p.tab[p.y][p.z].x);
    	p.tab[p.y][p.z] = new Fundo("src\\imagem\\cont.png",l,p);
    	p.adicionaPeca(p.tab[p.y][p.z],l);
    	l = l - 6;
    	if(l>=0) {
    		p.y--;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	else {
    		l = l + 6;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    
	}
	
	public void baixo() {
		int l = p.tab[p.y][p.z].x;
    	p.removerPeca(p.tab[p.y][p.z].x);
    	p.tab[p.y][p.z] = new Fundo("src\\imagem\\cont.png",l,p);
    	p.adicionaPeca(p.tab[p.y][p.z],l);
    	l = l +6;
    	if(l<=35) {
    		p.y++;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	else {
    		l = l - 6;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	
	}
	
	public void esquerda() {
		int l = p.tab[p.y][p.z].x;
    	p.removerPeca(p.tab[p.y][p.z].x);
    	p.tab[p.y][p.z] = new Fundo("src\\imagem\\cont.png",l,p);
    	p.adicionaPeca(p.tab[p.y][p.z],l);
    	l = l - 1;
    	if(p.z==0) {
    		l=l+1;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	else {
    		p.z--;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	

	}
	
	public void direita() {
		int l = p.tab[p.y][p.z].x;
    	p.removerPeca(p.tab[p.y][p.z].x);
    	p.tab[p.y][p.z] = new Fundo("src\\imagem\\cont.png",l,p);
    	p.adicionaPeca(p.tab[p.y][p.z],l);
    	l = l + 1;
    	if(p.z==5) {
    		l=l-1;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	else {
    		p.z++;
    		p.removerPeca(l);
    		p.tab[p.y][p.z]= new Fundo("src\\imagem\\monstrinho.png",l,p);
    		p.adicionaPeca(p.tab[p.y][p.z],l);
    	}
    	
    }
	
	public void aleatorio() {
		Random aleatorio = new Random();
    	int valor = aleatorio.nextInt(4) + 1;
    	if(valor==1) {
    		cima();
    	}
    	else if(valor==2){
    		baixo();
    	}
    	else if (valor==3) {
    		esquerda();
    	}
    	else {
    		direita();
    	}
	}
}
