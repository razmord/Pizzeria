package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.PedidoVO;

public interface ServicioPedido {

	long count();

	void delete(PedidoVO arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends PedidoVO> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<PedidoVO> findAll();

	Iterable<PedidoVO> findAllById(Iterable<Integer> arg0);

	Optional<PedidoVO> findById(Integer arg0);

	<S extends PedidoVO> S save(S arg0);

	<S extends PedidoVO> Iterable<S> saveAll(Iterable<S> arg0);

}