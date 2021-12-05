package com.usa.hackathon.repositoriocrud;

import com.usa.hackathon.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepositorio  extends CrudRepository<Usuario, Integer> {
}
