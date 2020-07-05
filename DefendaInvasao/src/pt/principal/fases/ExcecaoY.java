package pt.principal.fases;

import javax.swing.JOptionPane;

import pt.principal.Tabuleiro;

public class ExcecaoY extends Excecao {
	private static final long serialVersionUID = 367341906488757876L;
	public ExcecaoY(Tabuleiro f) {
		super(f);
		
	}

	public void verificarPosicao(String y) {
		
		while(!yCorreto) {
			 
			try {
				
				f.y = Integer.parseInt(y);
				 yCorreto = true;
				}catch(NumberFormatException erro) {
					y = JOptionPane.showInputDialog("Digite um valor valido para a coordenda y"); 
				}
		}
			
	}

}
