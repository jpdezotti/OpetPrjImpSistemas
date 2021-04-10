package br.edu.opet.Model;


import br.edu.opet.DAO.PessoaDAO;

public class Pessoa extends PessoaDAO {

	private String nome;
	private String email;
	private String pwd;
	
	public Pessoa(String nome, String email, String pwd) {
		this.nome = nome;
		this.email = email;
		this.pwd = pwd;
		
	}
	public Pessoa() {
		
	}
		
	public String login() {
		String resul = super.login(this);
		return resul;		
		
	}
	public String inserir ()  {	
		String resul = super.inserir(this);
		return resul;		
	}
	public void alterar () {
		
	}
	public void excluir () {
		
	}
	public void consultar () {
		
	}


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
	
	
}
