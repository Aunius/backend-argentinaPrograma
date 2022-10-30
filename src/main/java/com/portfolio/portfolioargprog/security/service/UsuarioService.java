package com.portfolio.portfolioargprog.security.service;

import com.portfolio.portfolioargprog.security.entity.Usuario;
import com.portfolio.portfolioargprog.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByUsuario(String nombreUsuario){
        return usuarioRepository.findByUsuario(nombreUsuario);
    }

    public boolean existsByUsuario(String nombreUsuario){
        return usuarioRepository.existsByUsuario(nombreUsuario);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
