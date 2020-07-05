package pt.principal.fases;

import javax.swing.JOptionPane;
import pt.principal.*;
public class Excecao extends Exception {

	private static final long serialVersionUID = -1536643558414006369L;
	boolean xCorreto = false;
	boolean yCorreto = false;
	Tabuleiro f;
	public String stringX,stringY;
	public Excecao(Tabuleiro f){
		this.f=f;
	  
	}
	public void verificarPosicao(String x,String y) {
		
		ExcecaoX t = new ExcecaoX(f);
		t.verificarPosicao(x);
		
				
		ExcecaoY v = new ExcecaoY(f);
		v.verificarPosicao(y);
		
	}
}
