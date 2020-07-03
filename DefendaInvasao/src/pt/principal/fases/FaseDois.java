package pt.principal.fases;

import javax.swing.JOptionPane;

public class FaseDois extends FaseUm{
	public FaseDois(int arvores, int pedras, int lagos,String fase) {
		super(arvores,pedras,lagos,fase);
	}
		
		
		public void iniciar() {
			next.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		        	
		        	novoMonstro = rand.nextInt(5);
		        	l = f1.tab[novoMonstro][9].pos;
		        	f1.entrar(l,novoMonstro);
		        	
					
		        		
		        }
			 });
			
			constr.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		        	
		        		String[] itens = {"Fabrica - custo 50","Soldado - custo 100" };
		        		  String selectedValue = (String) JOptionPane.showInputDialog(null,
		        		          "Escolha um item", "Construir",
		        		              JOptionPane.INFORMATION_MESSAGE, null,
		        		                  itens, itens [0]); //
		        		  System.out.println(selectedValue);
		        		
		        }
		    });
		}
}
