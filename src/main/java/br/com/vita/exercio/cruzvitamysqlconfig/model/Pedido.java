package br.com.vita.exercio.cruzvitamysqlconfig.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pedido")
public class Pedido {

	@Id
	private Long idPedido;
	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
}
