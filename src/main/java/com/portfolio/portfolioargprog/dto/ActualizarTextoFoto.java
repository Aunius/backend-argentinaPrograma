package com.portfolio.portfolioargprog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class ActualizarTextoFoto {
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String texto;
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String foto;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
   
    public String getTexto() {
        return texto;
    }

    public void setTexto(String nombre) {
        this.texto = nombre;
    }
}
