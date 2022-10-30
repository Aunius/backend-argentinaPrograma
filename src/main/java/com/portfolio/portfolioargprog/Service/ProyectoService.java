package com.portfolio.portfolioargprog.service;

import com.portfolio.portfolioargprog.entity.Proyecto;
import com.portfolio.portfolioargprog.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepository repository;

    public void save(Proyecto objeto){
        repository.save(objeto);
    }

    public List<Proyecto> findAll(){
        return repository.findAll();
    }
}
