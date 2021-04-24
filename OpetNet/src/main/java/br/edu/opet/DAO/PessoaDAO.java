package br.edu.opet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.opet.Model.Pessoa;
import br.edu.opet.util.BancoDeDados;
import br.edu.opet.util.Criptografia;


public class PessoaDAO {	
	
	private Criptografia crip;
	
	public PessoaDAO () {
		this.crip = new Criptografia();
	}
	
		
	public String inserir (Pessoa p)  {
		Connection conn = BancoDeDados.getConexao();		
		PreparedStatement pstm = null;
			try {
				pstm = conn.prepareStatement("insert into pessoa (codigo,nome, pwd,login, ano, curso) values (addNumber.nextval,?,?,?,?,?)");
				//pstm.setInt(1, addNumber.nextval);
				pstm.setString(1, p.getNome());
				pstm.setString(2, crip.criptografa(p.getPwd()));
				pstm.setString(3, p.getLogin());
				pstm.setInt(4, p.getAno());
				pstm.setInt(5, p.getCurso());
				int row = pstm.executeUpdate();
				if (row != 1) {
					conn.rollback();
					return "false";
				} else {
					conn.commit();
					
				}
				pstm.close();
				conn.close();
				return "true";
			} catch (SQLException e) {
				System.err.println("Não foi possível persistir no BD ("+e.getErrorCode()+" - "+e.getMessage()+")");			
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e1) {
					System.err.println("Não foi possível fechar a conexão com o BD ("+e.getErrorCode()+" - "+e.getMessage()+")");
				}
				return  "false";
			}
	}
	public void alterar () {
		
	}
	public void excluir () {
		
	}
	public void consultar () {
		
	}
	public String login(Pessoa p) {
		Connection conn = BancoDeDados.getConexao();		
		PreparedStatement pstm = null;		
			try {
				pstm = conn.prepareStatement("select login, pwd from pessoa where login = ? and pwd = ?");
				//pstm.setInt(1, adicionar1.nextval);
				pstm.setString(1, p.getLogin());
				pstm.setString(2, crip.criptografa(p.getPwd()));
				ResultSet row = pstm.executeQuery();
				row.next();
				System.out.println(row.getString("login"));
				System.out.println(row.getString("pwd"));				
				row.close();
				pstm.close();
				conn.close();
				return "true";
			} catch (SQLException e) {
				System.err.println("Não foi possível receber dados do BD ("+e.getErrorCode()+" - "+e.getMessage()+")");
				
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e1) {
					System.err.println("Não foi possível fechar a conexão com o BD ("+e.getErrorCode()+" - "+e.getMessage()+")");
				}

				return  "false";
			}
			
	}
}
