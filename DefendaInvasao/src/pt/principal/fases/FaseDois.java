package pt.principal.fases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import pt.pecas.*;
import pt.principal.*;


public class FaseDois extends FaseUm implements IFases{
	protected TabuleiroDois f2 =  new TabuleiroDois("Fase 2");
	public FaseDois(int arvores, int pedras, int lagos,String fase) {
		super(arvores, pedras, lagos,fase);
		f1.dispose();
		f2.criarTab();
		f2.fazerTab(arvores,pedras,lagos,500,50);//precisa ver a quantidade de recursos
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

		
		
	
	public void continuar() {
		if(f2.vitoria==true) {
			f2.executar();
			if(f2.rodada<f2.fim) {
				novoMonstro = rand.nextInt(6);
				l = f2.tab[novoMonstro][9].pos;
				f2.entrarDois(l,novoMonstro);
			}
			else if(f2.procurarMonstro() == true) {
				
				f2.executar();
			}
			else {
				f2.dispose();
				EntreFaseTres fase = new EntreFaseTres();
				fase.irFaseTres();
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
		String[] itens = {"Fabrica - custo 50","Soldado - custo 100","Barreira - custo 70","Explosivo - custo 200" };
		  String selectedValue = (String) JOptionPane.showInputDialog(null,
		          "Escolha um item", "Construir",
		              JOptionPane.INFORMATION_MESSAGE, null,
		                  itens, itens [0]); //
		 
		  if(selectedValue!=null){
			  String stringX   = JOptionPane.showInputDialog("Digite um valor para a coordenda x");
			  String stringY   = JOptionPane.showInputDialog("Digite um valor para a coordenda y");
			  Excecao e = new Excecao(f2);
			  e.verificarPosicao(stringX,stringY);
			  
			  if(selectedValue.equalsIgnoreCase("Fabrica - custo 50")) {
				  if(f2.x<6 && f2.y<6) {
					  construirFabrica(f2);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Soldado - custo 100")) {
				  if(f2.x<6 && f2.y<6) {
					  construirSoldado(f2);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Barreira - custo 70")) {
				  if(f2.x<6 && f2.y<6) {
					  construirBarreira(f2);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Explosivo - custo 200")) {
				  if(f2.y<6) {
					  construirBomba(f2);
				  }
					  
				  
			  }
		  }
		
	}
	
	public void construirBarreira(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			pe = new Barreira(f,z);
			if (f.rec.dinheiro >= pe.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Barreira(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, pe.custo);
			}
		}
	}
	
	public void construirBomba(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			pe = new Explosivo(f,z);
			if (f.rec.dinheiro >= pe.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Explosivo(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, pe.custo);
			}
		}
	}
}
