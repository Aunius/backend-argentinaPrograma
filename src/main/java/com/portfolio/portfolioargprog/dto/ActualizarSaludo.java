package com.portfolio.portfolioargprog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class ActualizarSaludo {
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String texto;
   
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
