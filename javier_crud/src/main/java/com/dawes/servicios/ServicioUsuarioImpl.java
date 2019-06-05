package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.UsuarioVO;
import com.dawes.repositorio.UsuarioRepository;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario {
	@Autowired
	UsuarioRepository ur;

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#count()
	 */
	@Override
	public long count() {
		return ur.count();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#delete(com.dawes.modelo.UsuarioVO)
	 */
	@Override
	public void delete(UsuarioVO arg0) {
		ur.delete(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#deleteAll()
	 */
	@Override
	public void deleteAll() {
		ur.deleteAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#deleteAll(java.lang.Iterable)
	 */
	@Override
	public void deleteAll(Iterable<? extends UsuarioVO> arg0) {
		ur.deleteAll(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#deleteById(java.lang.String)
	 */
	@Override
	public void deleteById(String arg0) {
		ur.deleteById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#existsById(java.lang.String)
	 */
	@Override
	public boolean existsById(String arg0) {
		return ur.existsById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#findAll()
	 */
	@Override
	public Iterable<UsuarioVO> findAll() {
		return ur.findAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#findAllById(java.lang.Iterable)
	 */
	@Override
	public Iterable<UsuarioVO> findAllById(Iterable<String> arg0) {
		return ur.findAllById(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#findById(java.lang.String)
	 */
	@Override
	public Optional<UsuarioVO> findById(String id) {
		return ur.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#findByDNI(java.lang.String)
	 */
	@Override
	public UsuarioVO findByDNI(String DNI) {
		return ur.findByDNI(DNI);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#save(S)
	 */
	@Override
	public <S extends UsuarioVO> S save(S arg0) {
		return ur.save(arg0);
	}

	/* (non-Javadoc)
	 * @see com.dawes.servicios.ServicioUsuario#saveAll(java.lang.Iterable)
	 */
	@Override
	public <S extends UsuarioVO> Iterable<S> saveAll(Iterable<S> arg0) {
		return ur.saveAll(arg0);
	}
}
