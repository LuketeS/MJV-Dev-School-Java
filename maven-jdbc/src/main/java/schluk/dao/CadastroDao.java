package schluk.dao;

import java.sql.Connection;

import schluk.jdbc.connection.CriarConexao;

public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {//construtor
		CriarConexao fc = new CriarConexao();
		cnn = fc.criarConexao();		
	}
	public void incluir() {
		//cnn.close();
		
	}
	public void alterar() {
		//cnn.close();
		
	}
}
