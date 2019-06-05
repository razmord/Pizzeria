package com.dawes.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.UsuarioVO;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioVO, String>{
	Optional<UsuarioVO> findById(String id);
	UsuarioVO findByDNI(String DNI);
}
