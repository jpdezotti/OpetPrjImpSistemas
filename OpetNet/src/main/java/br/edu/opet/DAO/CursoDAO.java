package br.edu.opet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.opet.Model.Curso;
import br.edu.opet.util.BancoDeDados;

public class CursoDAO {	

	public List<Curso> listar() {
		Connection conn = BancoDeDados.getConexao();
		ArrayList<Curso> alC = new ArrayList<Curso>(); 
	
		PreparedStatement pstm=null;
		try {
			pstm = conn.prepareStatement("select * from curso");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Curso curso = new Curso();
				curso.setIdCurso(rs.getInt("id_curso"));
				curso.setNomeCurso(rs.getString("nome_curso"));
				
				alC.add(curso);
			}
			rs.close();
			pstm.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("não foi possível retornar da base. Erro: "+e.getMessage());
		}
		return alC;
	}

}
