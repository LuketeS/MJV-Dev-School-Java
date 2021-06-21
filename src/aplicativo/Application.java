package aplicativo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aplicativo.cadastros.Cadastrar;
import aplicativo.cadastros.Cadastro;
import aplicativo.pedidos.Pedido;
import aplicativo.pedidos.PedidoItem;
import aplicativo.produtos.CD;
import aplicativo.produtos.Livro;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cadastro editora = Cadastrar.cadastrar();
		System.out.println("\nDados da Editora: \n"+ editora.getId()+"\n"+editora.getNome()+"\n"+editora.getTelefone()+"\n"+editora.getEmail());
				
		
		Livro livro1 = new Livro();
		livro1.setPaginas(300);
		livro1.setEditora(editora);
		livro1.setId(1);
		livro1.setCodigoBarras("12367433");
		livro1.setTitulo("A viagem");
		livro1.setValorVenda(150.5);
		

		Cadastro artista = Cadastrar.cadastrar();
		System.out.println("\nDados do artista: \n"+ artista.getId()+"\n"+artista.getNome()+"\n"+artista.getTelefone()+"\n"+artista.getEmail());
		
		CD cd1 = new CD();
		cd1.setFaixas(8);
		cd1.setArtista(artista);
		cd1.setCodigoBarras("15789654");
		cd1.setId(2);
		cd1.setTitulo("Bombastic");
		cd1.setValorVenda(50.0);
	
		Cadastro cliente = Cadastrar.cadastrar();
		System.out.println("\nDados do cliente: \n"+ cliente.getId()+"\n"+cliente.getNome()+"\n"+cliente.getTelefone()+"\n"+cliente.getEmail());
		
		
		Pedido pedido1 = new Pedido();
		pedido1.setCliente(cliente);
		pedido1.setData(new Date(2020,3,10));
		pedido1.setId(3);
		pedido1.setValorTotal(350.5);
		
		List<PedidoItem> itens = new ArrayList<>();

		PedidoItem item = new PedidoItem();
		item.setProduto(livro1);
		item.setQuantidade(1.0);
		item.setValorVenda(livro1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());		
		itens.add(item);
		
		item= new PedidoItem();
		item.setProduto(cd1);
		item.setQuantidade(1.0);
		item.setValorVenda(cd1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		itens.add(item);
		
		pedido1.setItens(itens);
		
		System.out.println("Pedido Cliente " + pedido1.getCliente());
		

		
		//Cadastro destinatario = Cadastrar.cadastrar();
		//System.out.println("\nDados do destinatario: \n"+ destinatario.getId()+"\n"+destinatario.getNome()+"\n"+destinatario.getTelefone()+"\n"+destinatario.getEmail());
		
	}
}
