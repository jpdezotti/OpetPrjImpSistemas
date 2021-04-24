package br.edu.opet.Model;

import java.util.List;

import br.edu.opet.DAO.CursoDAO;

public class Curso extends CursoDAO {
	
	private int idCurso;
	private String nomeCurso;
	
	public Curso () {
		
	}
	
	public Curso (int idCurso, String nomeCurso) {
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
	}
	public Curso (String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public List<Curso> listar() {		
		return super.listar();
	}
	
	

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	

}
