package com.portfolio.portfolioargprog.service;

import com.portfolio.portfolioargprog.entity.Item;
import com.portfolio.portfolioargprog.repository.ItemRepository;
import com.portfolio.portfolioargprog.enums.TipoItem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository repository;

    public void save(Item objeto){
        repository.save(objeto);
    }

    public List<Item> findAll(Item objeto){
        return repository.findAll();
    }

    public List<Item> findByTipo(TipoItem tipo){
        return repository.findByTipo(tipo);
    }
}
