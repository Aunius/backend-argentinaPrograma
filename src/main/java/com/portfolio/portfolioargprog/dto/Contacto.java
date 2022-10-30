package com.portfolio.portfolioargprog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class Contacto {
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String nombre;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
