package pt.pecas;
import pt.principal.*;
public abstract class Aliadas extends Pecas {
	private static final long serialVersionUID = 1L;
	public static int custo;

	public Aliadas(String s,int z) {
		super(s,z);
	}
	public void mostrar(){
        System.out.print(nome+" ");
    }
	
	public void mover(int posicaoX, int posicaoY) {
		
	}

	public abstract void interagir(int posicaoX, int posicaoY);
}
