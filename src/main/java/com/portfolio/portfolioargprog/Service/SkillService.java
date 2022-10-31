package com.portfolio.portfolioargprog.service;

import com.portfolio.portfolioargprog.entity.Skill;
import com.portfolio.portfolioargprog.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class SkillService {

    @Autowired
    SkillRepository repository;

    public void save(Skill objeto){
        repository.save(objeto);
    }
    
    public void delete(Skill objeto){
        repository.delete(objeto);
    }
    
    public Skill findbyId(Integer id){
        return repository.findById(id).get();
    }

    public List<Skill> findAll(){
        return repository.findAll();
    }
}
