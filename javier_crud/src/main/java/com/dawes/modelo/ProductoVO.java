package com.dawes.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class ProductoVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;
	private String nombre;
	private String descripción;
	private float precio;
	private String imagen;
	@OneToMany(mappedBy="producto", fetch=FetchType.EAGER)
	private List<PedidoProductoVO> pedidos;	
	public List<PedidoProductoVO> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<PedidoProductoVO> pedidos) {
		this.pedidos = pedidos;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripción == null) ? 0 : descripción.hashCode());
		result = prime * result + idproducto;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + Float.floatToIntBits(precio);
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
		ProductoVO other = (ProductoVO) obj;
		if (descripción == null) {
			if (other.descripción != null)
				return false;
		} else if (!descripción.equals(other.descripción))
			return false;
		if (idproducto != other.idproducto)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProductoVO [idproducto=" + idproducto + ", nombre=" + nombre + ", descripción=" + descripción
				+ ", precio=" + precio + "]";
	}
	public ProductoVO(int idproducto, String nombre, String descripción, float precio, String imagen,
			List<PedidoProductoVO> pedidos) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
		this.imagen = imagen;
		this.pedidos = pedidos;
	}
	public ProductoVO(String nombre, String descripción, float precio, String imagen, List<PedidoProductoVO> pedidos) {
		super();
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
		this.imagen = imagen;
		this.pedidos = pedidos;
	}
	public ProductoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
