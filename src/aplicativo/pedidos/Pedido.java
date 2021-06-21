package aplicativo.pedidos;
import java.util.Date;
import java.util.List;

import aplicativo.cadastros.Cadastro;


public class Pedido {

	private Integer id;
	private Date data;
	private Double valorTotal;
	private Cadastro cliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	
	private List<PedidoItem> itens;

	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	public List<PedidoItem> getItens() {
		return itens;
	}
}
