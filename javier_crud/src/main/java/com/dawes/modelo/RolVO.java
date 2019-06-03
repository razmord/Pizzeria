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
@Table(name="rol")
public class RolVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrol;
	private String Nombre;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER)
	private List<UsuarioVO> usuarios;
	
	public List<UsuarioVO> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<UsuarioVO> usuarios) {
		this.usuarios = usuarios;
	}
	public int getIdRol() {
		return idrol;
	}
	public void setIdRol(int idRol) {
		this.idrol = idRol;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + idrol;
		return result;
	}
	@Override
	public String toString() {
		return "RolVO [idRol=" + idrol + ", Nombre=" + Nombre + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolVO other = (RolVO) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (idrol != other.idrol)
			return false;
		return true;
	}
	public RolVO(int idrol, String nombre, List<UsuarioVO> usuarios) {
		super();
		this.idrol = idrol;
		Nombre = nombre;
		this.usuarios = usuarios;
	}
	public RolVO(String nombre, List<UsuarioVO> usuarios) {
		super();
		Nombre = nombre;
		this.usuarios = usuarios;
	}
	public RolVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
