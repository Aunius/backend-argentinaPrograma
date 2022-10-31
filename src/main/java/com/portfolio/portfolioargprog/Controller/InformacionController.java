/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

import java.security.Principal;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfolioargprog.dto.ActualizarSaludo;
import com.portfolio.portfolioargprog.dto.ActualizarTextoFoto;
import com.portfolio.portfolioargprog.service.InformacionService;
import com.portfolio.portfolioargprog.entity.Informacion;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "*")
public class InformacionController {
    
    @Autowired
    InformacionService informacionService;
    
    @PostMapping("/actualizarSaludo")
    public String acualizarSaludo(@Valid @RequestBody ActualizarSaludo acualizarSaludo){
        Informacion saludo = informacionService.getBySlug("saludo").get();
        saludo.setValor(acualizarSaludo.getTexto());
        informacionService.save(saludo);
        return "{\"mensaje\": \"Saludo actualizado\"}";
    }
    
    @PostMapping("/actualizarNombreFoto")
    public String actualizarNombreFoto(@Valid @RequestBody ActualizarTextoFoto acualizarNombreFoto){
        Informacion texto = informacionService.getBySlug("persona").get();
        texto.setValor(acualizarNombreFoto.getTexto());
        informacionService.save(texto);
        
        Informacion foto = informacionService.getBySlug("url_persona").get();
        foto.setValor(acualizarNombreFoto.getFoto());
        informacionService.save(foto);
        return "{\"mensaje\": \"Datos actualizados\"}";
    }
    
    @PostMapping("/actualizarAcercaDe")
    public String actualizarAcercaDe(@Valid @RequestBody ActualizarTextoFoto acualizarNombreFoto){
        Informacion texto = informacionService.getBySlug("sobremi").get();
        texto.setValor(acualizarNombreFoto.getTexto());
        informacionService.save(texto);
        
        Informacion foto = informacionService.getBySlug("url_imagen_sobremi").get();
        foto.setValor(acualizarNombreFoto.getFoto());
        informacionService.save(foto);
        return "{\"mensaje\": \"Datos actualizados\"}";
    }
}
