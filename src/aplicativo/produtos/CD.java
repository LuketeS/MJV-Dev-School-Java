package aplicativo.produtos;

import aplicativo.cadastros.Cadastro;

public class CD extends Produto{

	private Integer faixas;
	private Cadastro artista;
	
	public Integer getFaixas() {
		return faixas;
	}
	public void setFaixas(Integer faixas) {
		this.faixas = faixas;
	}
	public Cadastro getArtista() {
		return artista;
	}
	public void setArtista(Cadastro artista) {
		this.artista = artista;
	}
	
}
