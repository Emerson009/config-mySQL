package br.com.vita.exercio.cruzvitamysqlconfig.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "aluno")
public class Aluno {
	
	@Id
	private Long idAluno;
	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

}
