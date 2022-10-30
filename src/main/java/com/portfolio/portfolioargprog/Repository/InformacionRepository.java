package com.portfolio.portfolioargprog.repository;

import com.portfolio.portfolioargprog.entity.Informacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InformacionRepository extends JpaRepository<Informacion, Integer> {
    Optional<Informacion> findBySlug(String slug);
    boolean existsBySlug(String slug);
}
