package Basico;

public class Recursos implements IRecursos{
	int dinheiro = 0;
	
	public void alterarRecursos(int operacao, int valor) {
		if(operacao == 1) {
			dinheiro = dinheiro + valor;
		}
		
		if (operacao == 0) {
			dinheiro = dinheiro - valor;
		}
	}

	public int mostrarRecursos() {
		return (dinheiro);
	}
}
