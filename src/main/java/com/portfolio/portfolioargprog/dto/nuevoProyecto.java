package com.portfolio.portfolioargprog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class nuevoProyecto {
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String titulo;
    
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String subtitulo;
    
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String url_imagen;
    
    @NotBlank
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private String url;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
