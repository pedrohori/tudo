package pt.pecas;
import pt.principal.*;
public abstract class Inimigas extends Pecas {
	private static final long serialVersionUID = 1L;
	
	public Inimigas(String s,int z) {
		super(s,z);
	}

	
	public void mostrar(){
        System.out.print(nome+" ");
    }

	public abstract void interagir(int posicaoX, int posicaoY);
	
	public abstract void mover(int posicaoX, int posicaoY);
}
