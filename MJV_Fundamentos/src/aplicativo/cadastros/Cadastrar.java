package aplicativo.cadastros;

import java.util.Scanner;
public class Cadastrar {

	public static Cadastro cadastrar() {
		Cadastro cliente = new Cadastro();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o id");
		Integer id = ler.nextInt();
		cliente.setId(id);
		System.out.println("Digite o nome");
		String nome = ler.next();
		cliente.setNome(nome);
		System.out.println("Digite o telefone");
		Long telefone = ler.nextLong();
		cliente.setTelefone(telefone);
		System.out.println("Digite o email");
		String email = ler.next();
		cliente.setEmail(email);
		return cliente;
	}	
}
