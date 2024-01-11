import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Bancoprinci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int op = 0;
		    ArrayList <Conta> con = new ArrayList <Conta>();
			int pos = 0;
			boolean achou = false;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
											"1 - Criar conta\n" +
											"2 - Exibir Todas as contas\n" +
											"3 - Depositar\n" +
											"4 - Sacar\n" +
											"5 - Alterar conta\n" +
											"6 - Excluir conta\n" +
											"7 - Pagar juros\n" +		
											"8 - Pesquisar\n" +	
											"0 - Sair"));
			switch (op) {
			case 1:
				if (pos < 10) {
					Conta cont = new Conta();
					cont.lerDados();
					con.add(cont);
					pos = con.size();
				}else {
					JOptionPane.showMessageDialog(null, "Vetor lotado!");
				}
				break;
				
			case 2:
				String msg = "";
				for(int i = 0; i < pos; i++) {
					con.get(i).exibirDados();
				}
				if (msg.equals("")) {
					
				}else {
					JOptionPane.showMessageDialog(null, msg);
				}
				break;
				
			case 3:
				achou = false;
				int pesq = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta:"));
				for(int i = 0; i < pos; i++){
					if(con.get(i).getcontaid() == pesq){
						con.get(i).Depositar();
						achou = true;
						break;
					}
				
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Conta não encontrada!");
				}
			
					break;
				}
				break;
				
			case 4:
				achou = false;
				int pesq1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta:"));
				for(int i = 0; i < pos; i++){
					if(con.get(i).getcontaid() == pesq1){
						con.get(i).Sacar();
						achou = true;
						break;
					}
				
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Conta não encontrada!");
				}
			
					break;
				}
				break;
			case 5:
				achou = false;
				int alt2 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da conta que vai ser alterada:"));
				for(int i = 0; i < pos; i++){
					if(con.get(i).getcontaid() == alt2){
						con.get(i).exibirDados();
						con.get(i).mudarDados();
						con.get(i).exibirDados();
						
						achou = true;
						break;
					}
				}
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Nome não encontrado!");
				}
            break;
			case 6:
				achou = false;
				int del = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da conta que quer excluir:"));
				for(int p = 0; p < pos; p++){
					if(con.get(p).getcontaid() == del){					
								con.remove(p);
								achou = true;
								break;								
					}
				}
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Nome não encontrado!");
				}
				pos =  con.size();
	    	
            break;
            
            
			case 7:
				achou = false;
				int pesqp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da conta que quer cobrar:"));
				
				for(int p = 0; p < pos; p++){
					if(con.get(p).getcontaid() == pesqp){	
						
						con.get(p).cobrarjuros();
						con.get(p).exibirDados();
						achou = true;
			
								break;								
					}
				}
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Nome não encontrado!");
				}
				pos =  con.size();
	    	
            break;
            
            
			case 8:
	    		achou = false;
				String pesqc = JOptionPane.showInputDialog(null, "Digite o nome do dono da conta:");
				for(int i = 0; i < pos; i++){
					if(con.get(i).getNome().equals(pesqc)){
						JOptionPane.showMessageDialog(null, pesqc+ " está na posição " + (i + 1));
						achou = true;
						con.get(i).exibirDados();
						break;
					}
				}
				if (!achou) {
						JOptionPane.showMessageDialog(null, "Nome não encontrado!");
				}
							    	
	        break;
	        
	        
			}
			
			
		}while(op != 0);
		}
		}
	
		
	


