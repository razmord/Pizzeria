package com.dawes.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPedido;
	private Date fechaPedido;
	private boolean pagado;
	private int total;
	@ManyToOne
	@JoinColumn(name="idusuario")
	private UsuarioVO usuario;
	
}
