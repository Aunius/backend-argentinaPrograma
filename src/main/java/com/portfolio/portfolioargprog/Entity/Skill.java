package com.portfolio.portfolioargprog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

import com.portfolio.portfolioargprog.enums.TipoSkill;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoSkill tipo;
    @NotNull
    private String texto;
    @NotNull
    private Integer valor;

    public Skill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoSkill getTipo() {
        return tipo;
    }

    public void setTipo(TipoSkill tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Skill(@NotNull TipoSkill tipo, @NotNull String texto, @NotNull Integer valor) {
        this.tipo = tipo;
        this.texto = texto;
        this.valor = valor;
    }
}
