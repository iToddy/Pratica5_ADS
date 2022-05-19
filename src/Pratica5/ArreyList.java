package Pratica5;

import javax.swing.JOptionPane;
import java.util.*;

public class ArreyList {

	public static void main(String[] args) {
		
		int menu;
		
	     ArrayList<String> cadastro = new ArrayList();
	     do
	     	{
	    	  menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1-Inserir\n2-Alterar\n3-Excluir\n4-Listar\n5-Sair"));
	    	 
	    	 switch (menu) 
	    	 {
	    	 case 1:
	    		  String name= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	              String phone= JOptionPane.showInputDialog("Digite o telefone: ");
	              
	              String insta= JOptionPane.showInputDialog("Digite o @insta: ");
	              
	              String email= JOptionPane.showInputDialog("Digite o email: ");
	              
	              cadastro.add(name+";"+ phone + ";" + insta + ";" + email );
	              
	              JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	               
	              break;
	              
	    	 case 2:
	    		 
	    		 String excludename = JOptionPane.showInputDialog("Digite um dado do contato q deseja excluir: ");
	    		 
	    		 for (int i = 0; i<cadastro.size(); i++)
	    		 
	    		 {
	    			if (cadastro.get(i).contains(excludename)) 
	    			{
	    				JOptionPane.showMessageDialog(null, cadastro.get(i) + " excluído com sucesso");
	    				cadastro.remove(i);
	    				 i--;
	    			} else if (i==cadastro.size()-1) 
	    			{
	    				JOptionPane.showMessageDialog(null, "Item não encontrado");
	    			}
	    		 }
	    		 
	    		 break;
	    		 
	    	 case 3: 

	    		 String search = JOptionPane.showInputDialog("Digite um dado do contato q deseja pesquisar: ");
	    		 
	    		 for (int y = 0; y<cadastro.size(); y++)
	    		 
	    		 {
	    			if (cadastro.get(y).contains(search)) 
	    			{
	    				JOptionPane.showMessageDialog(null,"Item excluído: " + cadastro.get(y) );
	    			}else if (y==cadastro.size()-1) 
	    			{
	    				JOptionPane.showMessageDialog(null, "Usuário nao encontrado");
	    			}
	    		 }
	    		 
	    		 break;
	    		 
	    	 case 4: 
	    		 break;
	    		 
	    	default:
	    		
	    		JOptionPane.showMessageDialog(null, "Sabe ler não? escolha uma opção de 1 a 4");
	    		 
	    	 }
	    	 
	     } while(menu!=4);
	     
	}
	
}