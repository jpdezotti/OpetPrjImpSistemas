package br.edu.opet.Bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.opet.Model.Pessoa;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped

public class ControllerPessoa implements Serializable {
	
	private Pessoa p = new Pessoa();
	
	public ControllerPessoa() {
		
		
	}
	
	public String login() {
		String resul = this.p.login();		
		if (resul == "true") {
			return "/PrincipalOpet.xhtml";
		}else {
			return "/loginInvalido.xhtml";
		}
	}
	
	public String inserir ()  {
		String resul = this.p.inserir();
		if (resul == "true") {
			return "/cadastroValido.xhtml";
		}else {
			return "/cadastroInvalido.xhtml";
		}
				
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
