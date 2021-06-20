package aplicativo.produtos;

import aplicativo.cadastros.Cadastro;

public class Livro  extends Produto{
	
	private Integer paginas;
	private Cadastro editora;
	
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public Cadastro getEditora() {
		return editora;
	}
	public void setEditora(Cadastro editora) {
		this.editora = editora;
	}
}
