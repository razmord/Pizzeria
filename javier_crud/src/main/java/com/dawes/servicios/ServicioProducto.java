package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.ProductoVO;

public interface ServicioProducto {

	long count();

	void delete(ProductoVO arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends ProductoVO> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<ProductoVO> findAll();

	Iterable<ProductoVO> findAllById(Iterable<Integer> arg0);

	Optional<ProductoVO> findById(Integer arg0);

	<S extends ProductoVO> S save(S arg0);

	<S extends ProductoVO> Iterable<S> saveAll(Iterable<S> arg0);

}