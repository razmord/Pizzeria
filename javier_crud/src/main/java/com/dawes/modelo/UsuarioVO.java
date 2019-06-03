package com.dawes.modelo;

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
@Table(name="usuario")
public class UsuarioVO {
	
	@Id
	private String idusuario; //Email
	private String nombre;
	private String direccion;
	private int telefono;
	private String DNI;
	@ManyToOne
	@JoinColumn(name="idrol")
	private RolVO rol;
	@OneToMany(mappedBy="pedido", fetch=FetchType.EAGER)
	private List<PedidoVO> pedidos;
	public String getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public RolVO getRol() {
		return rol;
	}
	public void setRol(RolVO rol) {
		this.rol = rol;
	}
	public List<PedidoVO> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<PedidoVO> pedidos) {
		this.pedidos = pedidos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((idusuario == null) ? 0 : idusuario.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + telefono;
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
		UsuarioVO other = (UsuarioVO) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (idusuario == null) {
			if (other.idusuario != null)
				return false;
		} else if (!idusuario.equals(other.idusuario))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UsuarioVO [idusuario=" + idusuario + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", DNI=" + DNI + "]";
	}
	public UsuarioVO(String idusuario, String nombre, String direccion, int telefono, String dNI, RolVO rol,
			List<PedidoVO> pedidos) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		DNI = dNI;
		this.rol = rol;
		this.pedidos = pedidos;
	}
	public UsuarioVO(String nombre, String direccion, int telefono, String dNI, RolVO rol, List<PedidoVO> pedidos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		DNI = dNI;
		this.rol = rol;
		this.pedidos = pedidos;
	}
	public UsuarioVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
