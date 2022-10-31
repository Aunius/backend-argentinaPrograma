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
    
    public void delete(Item objeto){
        repository.delete(objeto);
    }

    public List<Item> findAll(){
        return repository.findAll();
    }
    
    public Item findbyId(Integer id){
        return repository.findById(id).get();
    }

    public List<Item> findByTipo(TipoItem tipo){
        return repository.findByTipo(tipo);
    }
}
