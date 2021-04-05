package br.edu.opet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.opet.Model.Pessoa;
import br.edu.opet.util.BancoDeDados;


public class PessoaDAO {	
	
		
	public String inserir (Pessoa p)  {
		Connection conn = BancoDeDados.getConexao();		
		PreparedStatement pstm = null;
	
			try {
				pstm = conn.prepareStatement("insert into pessoa (nome, email, pwd) values (?,?,?)");
				//pstm.setInt(1, adicionar1.nextval);
				pstm.setString(1, p.getNome());
				pstm.setString(2, p.getEmail());
				pstm.setString(3, p.getPwd());
				int row = pstm.executeUpdate();
				if (row != 1) {
					conn.rollback();
					return "loginInvalido.xhtml";
				} else {
					conn.commit();
					
				}
				pstm.close();
				conn.close();
				return "loginValido.xhtml";
			} catch (SQLException e) {
				System.err.println("Não foi possível persistir no BD ("+e.getErrorCode()+" - "+e.getMessage()+")");
				
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e1) {
					System.err.println("Não foi possível fechar a conexão com o BD ("+e.getErrorCode()+" - "+e.getMessage()+")");
				}

				return  "loginInvalido.xhtml";
			}
			
			
			
		
		
	}
	public void alterar () {
		
	}
	public void excluir () {
		
	}
	public void consultar () {
		
	}
	

}
