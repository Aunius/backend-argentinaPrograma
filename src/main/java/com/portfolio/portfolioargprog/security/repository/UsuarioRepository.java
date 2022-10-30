package com.portfolio.portfolioargprog.security.repository;

import com.portfolio.portfolioargprog.security.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsuario(String nombreUsuario);
    boolean existsByUsuario(String nombreUsuario);

}
