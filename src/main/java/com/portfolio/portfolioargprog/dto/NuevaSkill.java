package com.portfolio.portfolioargprog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class NuevaSkill {
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String texto;
    
    @Min(0)
    @Max(100)
    private Integer valor;

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
    
}
