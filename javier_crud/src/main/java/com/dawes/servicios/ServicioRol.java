package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.RolVO;

public interface ServicioRol {

	long count();

	void delete(RolVO arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends RolVO> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<RolVO> findAll();

	Iterable<RolVO> findAllById(Iterable<Integer> arg0);

	RolVO findById(int id);

	Optional<RolVO> findById(Integer arg0);

	RolVO findByNombre(String Nombre);

	<S extends RolVO> S save(S arg0);

	<S extends RolVO> Iterable<S> saveAll(Iterable<S> arg0);

}