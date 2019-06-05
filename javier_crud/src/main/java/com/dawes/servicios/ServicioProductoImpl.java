package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ProductoVO;
import com.dawes.repositorio.ProductoRepository;

@Service
public class ServicioProductoImpl implements ServicioProducto {
	@Autowired
	ProductoRepository pr;

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#count()
	 */
	@Override
	public long count() {
		return pr.count();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#delete(com.dawes.modelo.ProductoVO)
	 */
	@Override
	public void delete(ProductoVO arg0) {
		pr.delete(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#deleteAll()
	 */
	@Override
	public void deleteAll() {
		pr.deleteAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#deleteAll(java.lang.Iterable)
	 */
	@Override
	public void deleteAll(Iterable<? extends ProductoVO> arg0) {
		pr.deleteAll(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer arg0) {
		pr.deleteById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#existsById(java.lang.Integer)
	 */
	@Override
	public boolean existsById(Integer arg0) {
		return pr.existsById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#findAll()
	 */
	@Override
	public Iterable<ProductoVO> findAll() {
		return pr.findAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#findAllById(java.lang.Iterable)
	 */
	@Override
	public Iterable<ProductoVO> findAllById(Iterable<Integer> arg0) {
		return pr.findAllById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#findById(java.lang.Integer)
	 */
	@Override
	public Optional<ProductoVO> findById(Integer arg0) {
		return pr.findById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#save(S)
	 */
	@Override
	public <S extends ProductoVO> S save(S arg0) {
		return pr.save(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioProducto#saveAll(java.lang.Iterable)
	 */
	@Override
	public <S extends ProductoVO> Iterable<S> saveAll(Iterable<S> arg0) {
		return pr.saveAll(arg0);
	}
}
