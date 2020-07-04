package pt.principal.fases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import pt.pecas.*;
import pt.principal.*;


public class FaseDois extends FaseUm{
	protected TabuleiroDois f2 =  new TabuleiroDois("Fase 2");
	public FaseDois(int arvores, int pedras, int lagos,String fase) {
		super(arvores, pedras, lagos,fase);
		f1.dispose();
		f2.criarTab();
		f2.fazerTab(arvores,pedras,lagos,500,40);
		f2.addFundo();
		Icon cont = new ImageIcon("src//assets//continue.png");
		next = new JButton(cont);
		next.setBounds(10,10, 150,75);
		f2.adicionaComando(next);
		
		Icon cont1 = new ImageIcon("src//assets//construir.png");
		constr = new JButton(cont1);
		constr.setBounds(10,90, 150,75);
		f2.adicionaComando(constr);
		
		Icon cont2 = new ImageIcon("src//assets//menub.png");
		voltar = new JButton(cont2);
		voltar.setBounds(10,400, 150,75);
		f2.adicionaComando(voltar);
	
	
	voltar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	
        		f2.dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
        		
        }
    });
	}

		
		
	/*public void iniciar() {
		next.addActionListener(new java.awt.event.ActionListener() {
		       public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	   continuar();
		    	
					
		        		
		        }
			 });
			
		constr.addActionListener(new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		        	
		        		construir();
		        		
		        }
		    });
		}*/
	public void continuar() {
		if(f2.vitoria==true) {
			f2.executar();
			if(f2.rodada<f1.fim) {
				novoMonstro = rand.nextInt(6);
				l = f1.tab[novoMonstro][9].pos;
				f2.entrarDois(l,novoMonstro);
			}
			else if(f2.procurarMonstro() == true) {
				
				f2.executar();
			}
			else {
				f2.dispose();
				//falta entre fases
			}
			
		}
		else {
			//gameover
			f2.dispose();
			FimJogo fim = new FimJogo();
			fim.finalizar();
		}
	}
	public void construir() {
		String[] itens = {"Fabrica - custo 50","Soldado - custo 100","Barreira - custo 150","Explosivo - custo 200" };
		  String selectedValue = (String) JOptionPane.showInputDialog(null,
		          "Escolha um item", "Construir",
		              JOptionPane.INFORMATION_MESSAGE, null,
		                  itens, itens [0]); //
		  boolean xCorreto = false;
		  if(selectedValue!=null){
			
			  String stringX,stringY;
			  while(!xCorreto) {
				  stringX   = JOptionPane.showInputDialog("Digite um valor para a coordenda x");
				  stringY = JOptionPane.showInputDialog("Digite um valor para a coordenda y");
				 try {
					 f2.x = Integer.parseInt(stringX);
					 f2.y = Integer.parseInt(stringY);
					 xCorreto = true;
					
				 }catch(NumberFormatException erro) {
					 
				 }
				 
			  }
			  if(selectedValue.equalsIgnoreCase("Fabrica - custo 50")) {
				  if(f1.x<6 && f1.y<6) {
					  construirFabrica(f2);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Soldado - custo 100")) {
				  if(f1.x<6 && f1.y<6) {
					  construirSoldado(f2);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Barreira - custo 150")) {
				  if(f1.x<6 && f1.y<6) {
					  construirBarreira(f2);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Explosivo - custo 200")) {
				  
					  construirBomba(f2);
				  
			  }
		  }
		
	}
	
	public void construirBarreira(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			if (f.rec.dinheiro >= Barreira.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Barreira(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, Soldado.custo);
			}
		}
	}
	
	public void construirBomba(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			if (f.rec.dinheiro >= Explosivo.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Explosivo(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, Explosivo.custo);
			}
		}
	}
}
