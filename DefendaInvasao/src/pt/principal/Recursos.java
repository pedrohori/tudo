package pt.principal;

public class Recursos implements IRecursos{
	public int dinheiro;
	Tabuleiro tab;
	public Recursos(int x,Tabuleiro tab) {
		this.dinheiro = x;
		this.tab=tab;
		//dinheiro.alterarRecursos(0, custo);
	}
	
	public void alterarRecursos(int operacao, int valor) {
		if(operacao == 1) {
			dinheiro = dinheiro + valor;
		}
		
		if (operacao == 0) {
			dinheiro = dinheiro - valor;
		}
		mostrarRecursos();
	}

	public void mostrarRecursos() {
	     
		String s =Integer.toString(dinheiro);
		tab.label1.setText("Recursos disponivel: " + s);
		tab.label1.updateUI();
	}
}
