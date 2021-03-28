package br.edu.opet.Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.opet.Model.Pessoa;

@ManagedBean
@SessionScoped

public class ControllerPessoa {
	
	private Pessoa p;
	
	public ControllerPessoa() {
		this.p = new Pessoa();
		
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}
	
	public String getTexto() {
		String texto = "chegou aqui no GetTexto";
		return texto;
	}
	
	

}
