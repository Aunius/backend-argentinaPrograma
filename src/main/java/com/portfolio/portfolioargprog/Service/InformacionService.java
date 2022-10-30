package com.portfolio.portfolioargprog.service;

import com.portfolio.portfolioargprog.entity.Informacion;
import com.portfolio.portfolioargprog.repository.InformacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class InformacionService {

    @Autowired
    InformacionRepository repository;

    public Optional<Informacion> getBySlug(String valor){
        return repository.findBySlug(valor);
    }

    public boolean existsBySlug(String valor){
        return repository.existsBySlug(valor);
    }

    public void save(Informacion objeto){
        repository.save(objeto);
    }
}
