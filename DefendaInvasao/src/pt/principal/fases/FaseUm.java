package pt.principal.fases;

import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import pt.principal.*;
import pt.pecas.*;

public class FaseUm {
	
	protected Tabuleiro f1 =  new Tabuleiro("Fase 1");;
	protected JButton next, constr,voltar;
	protected Random rand = new Random();
	protected Aliadas pe;
	protected int novoMonstro,l;
	protected int x,y;
	public FaseUm(int arvores, int pedras, int lagos,String fase) {
		
		f1.criarTab();
		f1.fazerTab(arvores,pedras,lagos,500,20);
		f1.addFundo();
		Icon cont = new ImageIcon("src//assets//continue.png");
		next = new JButton(cont);
		next.setBounds(10,10, 150,75);
		f1.adicionaComando(next);
		
		Icon cont1 = new ImageIcon("src//assets//construir.png");
		constr = new JButton(cont1);
		constr.setBounds(10,90, 150,75);
		f1.adicionaComando(constr);
		
		Icon cont2 = new ImageIcon("src//assets//menub.png");
		voltar = new JButton(cont2);
		voltar.setBounds(10,400, 150,75);
		f1.adicionaComando(voltar);
		
		voltar.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	
	        		f1.dispose();
	        		Menu menu = new Menu();
	        		menu.iniciarMenu();
	        		
	        }
	    });
	
	
	
	}
	
	public void iniciar() {
		
		
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
	}
	
	public void continuar() {
		if(f1.vitoria==true) {
			f1.executar();
			if(f1.rodada<f1.fim) {
				novoMonstro = rand.nextInt(6);
				l = f1.tab[novoMonstro][9].pos;
				if(f1.rodada%2==1) {
					f1.entrar(l,novoMonstro,'m');
				}
				else {
					f1.entrar(l,novoMonstro,'r');//r de monstro rapido
				}
			}
			else if(f1.procurarMonstro() == true) {
				
				f1.executar();
			}
			else {
				f1.dispose();
				EntreFaseDois fase = new EntreFaseDois();
				fase.irFaseDois();
			}
		}
		
		else {
			//gameover
			f1.dispose();
			FimJogo fim = new FimJogo();
			fim.finalizar();
		}
	}
	
	public void construir() {
		String[] itens = {"Fabrica - custo 50","Soldado - custo 100"};
		  String selectedValue = (String) JOptionPane.showInputDialog(null,
		          "Escolha um item", "Construir",
		              JOptionPane.INFORMATION_MESSAGE, null,
		                  itens, itens [0]); //
		 
		  if(selectedValue!=null){
			  String stringX   = JOptionPane.showInputDialog("Digite um valor para a coordenda x");
			  String stringY   = JOptionPane.showInputDialog("Digite um valor para a coordenda y");
			  Excessao e = new Excessao(f1);
			  e.verificarPosicao(stringX,stringY);
			
				 
			  
			  if(selectedValue.equalsIgnoreCase("Fabrica - custo 50")) {
				  if(f1.x<6 && f1.y<6) {
					  construirFabrica(f1);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Soldado - custo 100")) {
				  if(f1.x<6 && f1.y<6) {
					  construirSoldado(f1);
				  }
			  }
			  
			 
			  
			 
			  
			  
		  }
	}
	public void construirFabrica(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
		  if (f.tab[y][x].nome == '-' ) {
				z= f.tab[y][x].pos;
				pe = new Fabrica(f,z);
					if (f.rec.dinheiro >= pe.custo) {
						f.removerPeca(z);
						f.tab[y][x] = new Fabrica(f,z);
						f.adicionaPeca(f.tab[y][x], z);
						f.rec.alterarRecursos(0, pe.custo);		
					}
					
					
			}
	}
	
	public void construirSoldado(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
	
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			pe = new Soldado(f,z);
			if (f.rec.dinheiro >= pe.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Soldado(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, pe.custo);
			}
			
		}
	}
	
}
