package br.com.vita.exercio.cruzvitamysqlconfig.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "curso")
public class Curso {

	@Id
	private Long idCurso;
	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
}
