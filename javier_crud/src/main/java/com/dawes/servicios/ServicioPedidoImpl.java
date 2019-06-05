package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.PedidoVO;
import com.dawes.repositorio.PedidoRepository;

@Service
public class ServicioPedidoImpl implements ServicioPedido {
	@Autowired
	PedidoRepository per;

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#count()
	 */
	@Override
	public long count() {
		return per.count();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#delete(com.dawes.modelo.PedidoVO)
	 */
	@Override
	public void delete(PedidoVO arg0) {
		per.delete(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#deleteAll()
	 */
	@Override
	public void deleteAll() {
		per.deleteAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#deleteAll(java.lang.Iterable)
	 */
	@Override
	public void deleteAll(Iterable<? extends PedidoVO> arg0) {
		per.deleteAll(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer arg0) {
		per.deleteById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#existsById(java.lang.Integer)
	 */
	@Override
	public boolean existsById(Integer arg0) {
		return per.existsById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#findAll()
	 */
	@Override
	public Iterable<PedidoVO> findAll() {
		return per.findAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#findAllById(java.lang.Iterable)
	 */
	@Override
	public Iterable<PedidoVO> findAllById(Iterable<Integer> arg0) {
		return per.findAllById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#findById(java.lang.Integer)
	 */
	@Override
	public Optional<PedidoVO> findById(Integer arg0) {
		return per.findById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#save(S)
	 */
	@Override
	public <S extends PedidoVO> S save(S arg0) {
		return per.save(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioPedido#saveAll(java.lang.Iterable)
	 */
	@Override
	public <S extends PedidoVO> Iterable<S> saveAll(Iterable<S> arg0) {
		return per.saveAll(arg0);
	}
	
}
