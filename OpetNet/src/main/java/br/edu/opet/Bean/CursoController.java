package br.edu.opet.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.opet.Model.Curso;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped

public class CursoController implements Serializable{
	
	private Curso c;	
	
	public CursoController () {	
		this.c = new Curso();
	}	
	
	
	public List<Curso> listar() {
		return this.c.listar();		
	}


	public Curso getC() {
		return c;
	}


	public void setC(Curso c) {
		this.c = c;
	}
	
	

}
