package com.dawes.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	public PedidoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PedidoVO(Date fechaPedido, boolean pagado, int total, UsuarioVO usuario, List<PedidoProductoVO> productos) {
		super();
		this.fechaPedido = fechaPedido;
		this.pagado = pagado;
		this.total = total;
		this.usuario = usuario;
		this.productos = productos;
	}
	public PedidoVO(int idPedido, Date fechaPedido, boolean pagado, int total, UsuarioVO usuario,
			List<PedidoProductoVO> productos) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.pagado = pagado;
		this.total = total;
		this.usuario = usuario;
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "PedidoVO [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", pagado=" + pagado + ", total="
				+ total + ", usuario=" + usuario + ", productos=" + productos + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaPedido == null) ? 0 : fechaPedido.hashCode());
		result = prime * result + idPedido;
		result = prime * result + (pagado ? 1231 : 1237);
		result = prime * result + ((productos == null) ? 0 : productos.hashCode());
		result = prime * result + total;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoVO other = (PedidoVO) obj;
		if (fechaPedido == null) {
			if (other.fechaPedido != null)
				return false;
		} else if (!fechaPedido.equals(other.fechaPedido))
			return false;
		if (idPedido != other.idPedido)
			return false;
		if (pagado != other.pagado)
			return false;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		if (total != other.total)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public UsuarioVO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	public List<PedidoProductoVO> getProductos() {
		return productos;
	}
	public void setProductos(List<PedidoProductoVO> productos) {
		this.productos = productos;
	}
	@OneToMany(mappedBy="pedido", fetch=FetchType.EAGER)
	private List<PedidoProductoVO> productos;	
}
