package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.RolVO;
import com.dawes.repositorio.RolRepository;

@Service
public class ServicioRolImpl implements ServicioRol {
	@Autowired
	RolRepository rr;

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#count()
	 */
	@Override
	public long count() {
		return rr.count();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#delete(com.dawes.modelo.RolVO)
	 */
	@Override
	public void delete(RolVO arg0) {
		rr.delete(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#deleteAll()
	 */
	@Override
	public void deleteAll() {
		rr.deleteAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#deleteAll(java.lang.Iterable)
	 */
	@Override
	public void deleteAll(Iterable<? extends RolVO> arg0) {
		rr.deleteAll(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer arg0) {
		rr.deleteById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#existsById(java.lang.Integer)
	 */
	@Override
	public boolean existsById(Integer arg0) {
		return rr.existsById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#findAll()
	 */
	@Override
	public Iterable<RolVO> findAll() {
		return rr.findAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#findAllById(java.lang.Iterable)
	 */
	@Override
	public Iterable<RolVO> findAllById(Iterable<Integer> arg0) {
		return rr.findAllById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#findById(int)
	 */
	@Override
	public RolVO findById(int id) {
		return rr.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#findById(java.lang.Integer)
	 */
	@Override
	public Optional<RolVO> findById(Integer arg0) {
		return rr.findById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#findByNombre(java.lang.String)
	 */
	@Override
	public RolVO findByNombre(String Nombre) {
		return rr.findByNombre(Nombre);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#save(S)
	 */
	@Override
	public <S extends RolVO> S save(S arg0) {
		return rr.save(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioRol#saveAll(java.lang.Iterable)
	 */
	@Override
	public <S extends RolVO> Iterable<S> saveAll(Iterable<S> arg0) {
		return rr.saveAll(arg0);
	}
	
	
}
