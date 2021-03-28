package br.edu.opet.Model;

public class Pessoa {
	
	private String nome="admin";
	private String email="admin@opet.com.br";
	private String pwd="naoeadmin";
	
	public Pessoa() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String login(String n, String p){
		if (n == nome && p == pwd) {
			return "CREDENCIAIS VÁLIDAS";
		} else {
			return "CREDENCIAIS INVÁLIDAS. TENTE NOVAMENTE";
		}
	
	}
	
	

}
