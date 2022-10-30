package com.portfolio.portfolioargprog.repository;

import com.portfolio.portfolioargprog.entity.Item;
import com.portfolio.portfolioargprog.enums.TipoItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByTipo(TipoItem tipo);
}
