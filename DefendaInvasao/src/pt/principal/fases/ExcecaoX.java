package pt.principal.fases;

import javax.swing.JOptionPane;

import pt.principal.Tabuleiro;

public class ExcecaoX extends Excecao{

	private static final long serialVersionUID = 1539779194333517578L;

	public ExcecaoX(Tabuleiro f) {
		super(f);
		 
	}

	public void verificarPosicao(String x) {
		
		while(!xCorreto) {
			  
			  
			 try {
				 
				 f.x = Integer.parseInt(x);
				 
				 
				 xCorreto = true;
				
			 }catch(NumberFormatException erro) {
				
				 x  = JOptionPane.showInputDialog("Digite um valor valido para a coordenda x");
			 }
			
		  }
	}
	

}
