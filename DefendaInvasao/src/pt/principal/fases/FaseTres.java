package pt.principal.fases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import pt.pecas.*;
import pt.principal.*;

public class FaseTres extends FaseDois {
	protected TabuleiroTres f3 =  new TabuleiroTres("Fase 3");
	public FaseTres(int arvores, int pedras, int lagos,String fase) {
		super(arvores, pedras, lagos, fase);
		f2.dispose();
		f3.criarTab();
		f3.fazerTab(arvores,pedras,lagos,500,100);//precisa ver a quantidade de recursos
		f3.addFundo();
		Icon cont = new ImageIcon("src//assets//continue.png");
		next = new JButton(cont);
		next.setBounds(10,10, 150,75);
		f3.adicionaComando(next);
		
		Icon cont1 = new ImageIcon("src//assets//construir.png");
		constr = new JButton(cont1);
		constr.setBounds(10,90, 150,75);
		f3.adicionaComando(constr);
		
		Icon cont2 = new ImageIcon("src//assets//menub.png");
		voltar = new JButton(cont2);
		voltar.setBounds(10,400, 150,75);
		f3.adicionaComando(voltar);
	
	
	voltar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	
        		f3.dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
        		
        }
    });
	}
	public void continuar() {
		if(f3.vitoria==true) {
			f3.executar();
			if(f3.rodada<f3.fim) {
				novoMonstro = rand.nextInt(6);
				l = f3.tab[novoMonstro][9].pos;
				f3.entrarTres(l,novoMonstro);
			}
			else if(f3.procurarMonstro() == true) {
				
				f3.executar();
			}
			else {
				f3.dispose();
				
				VoceVenceu fase = new VoceVenceu();
				fase.finalizar();

			}
			
		}
		else {
			//gameover
			f3.dispose();
			FimJogo fim = new FimJogo();
			fim.finalizar();
		}
	}
	
	public void construir() {
		String[] itens = {"Fabrica - custo 50","Soldado - custo 100","Barreira - custo 150","Explosivo - custo 200","Posto de Gasolina - custo 50","Tanque de Guerra - custo 200" };
		  String selectedValue = (String) JOptionPane.showInputDialog(null,
		          "Escolha um item", "Construir",
		              JOptionPane.INFORMATION_MESSAGE, null,
		                  itens, itens [0]); //
		 
		  if(selectedValue!=null){
			  String stringX   = JOptionPane.showInputDialog("Digite um valor para a coordenda x");
			  String stringY   = JOptionPane.showInputDialog("Digite um valor para a coordenda y");
			  Excessao e = new Excessao(f3);
			  e.verificarPosicao(stringX,stringY);
			  
			  if(selectedValue.equalsIgnoreCase("Fabrica - custo 50")) {
				  if(f3.x<6 && f3.y<6) {
					  construirFabrica(f3);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Soldado - custo 100")) {
				  if(f3.x<6 && f3.y<6) {
					  construirSoldado(f3);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Barreira - custo 150")) {
				  if(f3.x<6 && f3.y<6) {
					  construirBarreira(f3);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Explosivo - custo 200")) {
				  if(f3.y<6) {
					  construirBomba(f3);
				  }
					  
				  
			  }
			  else if(selectedValue.equalsIgnoreCase("Posto de Gasolina - custo 50")) {
				  if(f3.x<6 && f3.y<6) {
					  construirPosto(f3);
				  }
			  }
			  else if(selectedValue.equalsIgnoreCase("Tanque de Guerra - custo 200")) {
				  if(f3.x<6 && f3.y<6) {
					  construirTanque(f3);
				  }
			  }
			  
		  }
	}
	public void construirPosto(Tabuleiro f){
		x=f.x;
		y=f.y;
		int z;
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			pe = new Gasolina(f,z);
			if (f.rec.dinheiro >= pe.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Gasolina(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, pe.custo);
			}
		}
	}
	public void construirTanque(Tabuleiro f) {
		x=f.x;
		y=f.y;
		int z;
		if (f.tab[y][x].nome == '-') {
			z= f.tab[y][x].pos;
			pe = new Tanque(f,z);
			if (f.rec.dinheiro >= pe.custo) {
				f.removerPeca(z);
				f.tab[y][x] = new Tanque(f,z);
				f.adicionaPeca(f.tab[y][x], z);
				f.rec.alterarRecursos(0, pe.custo);
			}
		}
	}

}
