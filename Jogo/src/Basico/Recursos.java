package Basico;

public class Recursos implements IRecursos{
	public int dinheiro;

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
	     System.out.println("Dinheiro disponível: " + dinheiro +" ");
	}
}
