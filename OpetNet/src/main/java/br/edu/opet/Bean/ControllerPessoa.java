package br.edu.opet.Bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.opet.Model.Curso;
import br.edu.opet.Model.Pessoa;


@ManagedBean
@RequestScoped

public class ControllerPessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pessoa p;
	private Curso c;
	
	public ControllerPessoa() {
		this.p = new Pessoa();	
		this.c = new Curso();
		
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

	public Curso getC() {
		return c;
	}

	public void setC(Curso c) {
		this.c = c;
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

		

}
