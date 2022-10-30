package com.portfolio.portfolioargprog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;

import com.portfolio.portfolioargprog.enums.TipoItem;
import javax.persistence.EnumType;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoItem tipo;
    @NotNull
    private String texto;
    @NotNull
    private String url_imagen;

    public Item() {
    }

    public Item(@NotNull TipoItem tipo, @NotNull String texto, @NotNull String url_imagen) {
        this.tipo = tipo;
        this.texto = texto;
        this.url_imagen = url_imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }
}
