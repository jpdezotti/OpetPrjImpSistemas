package br.edu.opet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
	
	public static Connection getConexao () {
		Connection conn = null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","aula", "aula");
		} catch (SQLException e) {
			System.err.println("Falha ao conectar com o banco[" + e.getMessage() + "]");
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			System.err.println("A biblioteca de conexão com o banco não foi encontrada!");
		}
		System.err.println(conn);
		return conn;
		
	}
}
