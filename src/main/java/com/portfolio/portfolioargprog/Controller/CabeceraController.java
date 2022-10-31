/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

import com.portfolio.portfolioargprog.service.InformacionService;
import com.portfolio.portfolioargprog.entity.Informacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CabeceraController {

    @Autowired
    InformacionService informacionService;
    
    @GetMapping("/home/cabecera")
    public Map<String, String> cabecera(){
        Informacion saludo = informacionService.getBySlug("saludo").get();
        Informacion persona = informacionService.getBySlug("persona").get();
        Informacion url_persona = informacionService.getBySlug("url_persona").get();

        HashMap<String, String> map = new HashMap<>();
        map.put("saludo", saludo.getValor());
        map.put("persona", persona.getValor());
        map.put("url_persona", url_persona.getValor());
        return map;
    }
}
