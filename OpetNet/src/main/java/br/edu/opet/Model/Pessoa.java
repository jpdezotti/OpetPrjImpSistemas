package br.edu.opet.Model;


import br.edu.opet.DAO.PessoaDAO;

public class Pessoa extends PessoaDAO {
	
	private Pessoa p;
	
	private int codigo;
	private String nome;
	private String login;
	private String pwd;
	private int ano;
	private int curso;
	
	public Pessoa(String nome, String pwd, String login, int ano, int curso) {		
		this.ano = ano;
		this.login = login;
		this.nome = nome;
		this.pwd = pwd;
		this.curso = curso;
		
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
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Pessoa getP() {
		return p;
	}
	public void setP(Pessoa p) {
		this.p = p;
	}
	
}
