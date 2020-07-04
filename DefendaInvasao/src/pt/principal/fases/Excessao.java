package pt.principal.fases;

import javax.swing.JOptionPane;
import pt.principal.*;
public class Excessao extends Exception {

	private static final long serialVersionUID = -1536643558414006369L;
	boolean xCorreto = false;
	boolean yCorreto = false;
	Tabuleiro f;
	public String stringX,stringY;
	public Excessao(Tabuleiro f){
		this.f=f;
	  
	}
	public void verificarPosicao(String x,String y) {
		
		ExcessaoX t = new ExcessaoX(f);
		t.verificarPosicao(x);
		
				
		ExcessaoY v = new ExcessaoY(f);
		v.verificarPosicao(y);
		
	}
}
