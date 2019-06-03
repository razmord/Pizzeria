package com.dawes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedidoproducto")
public class PedidoProductoVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idalumnocurso;
	private int cantidad;
	@ManyToOne
	@JoinColumn(name="idpedido")
	private PedidoVO pedido;
	
	@ManyToOne
	@JoinColumn(name="idproducto")
	private ProductoVO producto;

	public int getIdalumnocurso() {
		return idalumnocurso;
	}

	public void setIdalumnocurso(int idalumnocurso) {
		this.idalumnocurso = idalumnocurso;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public PedidoVO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoVO pedido) {
		this.pedido = pedido;
	}

	public ProductoVO getProducto() {
		return producto;
	}

	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "PedidoProductoVO [idalumnocurso=" + idalumnocurso + ", cantidad=" + cantidad + ", pedido=" + pedido
				+ ", producto=" + producto + "]";
	}

	public PedidoProductoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PedidoProductoVO(int cantidad, PedidoVO pedido, ProductoVO producto) {
		super();
		this.cantidad = cantidad;
		this.pedido = pedido;
		this.producto = producto;
	}

	public PedidoProductoVO(int idalumnocurso, int cantidad, PedidoVO pedido, ProductoVO producto) {
		super();
		this.idalumnocurso = idalumnocurso;
		this.cantidad = cantidad;
		this.pedido = pedido;
		this.producto = producto;
	}
	
}
