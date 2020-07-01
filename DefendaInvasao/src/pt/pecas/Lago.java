package pt.pecas;

public class Lago extends Neutras{
	
	private static final long serialVersionUID = 1L;

	public Lago(int z) {
		super("src\\assets\\lago.png",z);
		vida = 100;
		nome = 'l';
		tipo = "Neutras";
	}
}
