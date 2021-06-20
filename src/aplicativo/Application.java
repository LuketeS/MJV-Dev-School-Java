package aplicativo;

import aplicativo.cadastros.Cadastrar;
import aplicativo.cadastros.Cadastro;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Cadastro cliente = Cadastrar.cadastrarCliente();
		System.out.println("Dados do cliente: \n"+ cliente.getId()+"\n"+cliente.getNome()+"\n"+cliente.getTelefone()+"\n"+cliente.getEmail());
	
		
		
		
		
		
		
		
		
	}
	
	

}
