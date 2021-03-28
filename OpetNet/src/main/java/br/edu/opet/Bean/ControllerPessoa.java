package br.edu.opet.Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.opet.Model.Pessoa;

@ManagedBean
@SessionScoped

public class ControllerPessoa {
	
	String usuario;
	String password;
	
	private Pessoa p;
	
	public ControllerPessoa() {
		this.p = new Pessoa();
		
	}
	
	public String envia() {
		String no = this.p.getNome();
		String pw = this.p.getPwd();
		if (this.usuario == no && this.password == pw){	
			return "/loginValido.xhtml";			
		} else {
			return "/loginInvalido.xhtml";	
		}
	}


	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTexto() {
		String texto = "chegou aqui no GetTexto";
		return texto;
	}
	
	

}
