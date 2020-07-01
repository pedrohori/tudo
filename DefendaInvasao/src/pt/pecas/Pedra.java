package pt.pecas;

public class Pedra extends Neutras {

	private static final long serialVersionUID = 1L;

	public Pedra(int z) {
		super("src\\assets\\pedra.png",z);
		vida = 3;
		nome = 'p';
		tipo = "Neutras";
	}
	
}
