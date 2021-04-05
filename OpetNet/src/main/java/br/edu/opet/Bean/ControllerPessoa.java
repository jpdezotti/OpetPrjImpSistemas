package br.edu.opet.Bean;

import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.opet.Model.Pessoa;

@ManagedBean
@SessionScoped

public class ControllerPessoa implements Serializable {
	
	private Pessoa p = new Pessoa();
	
	public ControllerPessoa() {
		
		
	}
	
	public void login() {
		
	}
	
	public String inserir () throws SQLException {
		this.p.inserir();
		return this.p.inserir();		
	}
	public void alterar () {
		
	}
	public void excluir () {
		
	}
	public void consultar () {
		
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

		

}
