package pt.principal;

import javax.swing.JLabel;

public class Recursos implements IRecursos{
	public int dinheiro;
	public JLabel valor;
	public Recursos(int x) {
		this.dinheiro = x;
		//dinheiro.alterarRecursos(0, custo);
	}
	
	public void alterarRecursos(int operacao, int valor) {
		if(operacao == 1) {
			dinheiro = dinheiro + valor;
		}
		
		if (operacao == 0) {
			dinheiro = dinheiro - valor;
		}
	}

	public void mostrarRecursos() {
	     //System.out.println("Dinheiro disponível: " + dinheiro +" ");
		String s =Integer.toString(dinheiro);
		valor.setText("Dinheiro disponivel: " + s);
		valor.updateUI();
	}
}
