package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.UsuarioVO;

public interface ServicioUsuario {

	long count();

	void delete(UsuarioVO arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends UsuarioVO> arg0);

	void deleteById(String arg0);

	boolean existsById(String arg0);

	Iterable<UsuarioVO> findAll();

	Iterable<UsuarioVO> findAllById(Iterable<String> arg0);

	Optional<UsuarioVO> findById(String id);

	UsuarioVO findByDNI(String DNI);

	<S extends UsuarioVO> S save(S arg0);

	<S extends UsuarioVO> Iterable<S> saveAll(Iterable<S> arg0);

}