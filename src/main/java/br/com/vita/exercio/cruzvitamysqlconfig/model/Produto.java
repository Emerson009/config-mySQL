package br.com.vita.exercio.cruzvitamysqlconfig.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "produto")
public class Produto {

	@Id
	private Long idProduto;
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
}
