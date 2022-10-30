/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

import com.portfolio.portfolioargprog.service.InformacionService;
import com.portfolio.portfolioargprog.entity.Informacion;
import com.portfolio.portfolioargprog.service.ItemService;
import com.portfolio.portfolioargprog.entity.Item;
import com.portfolio.portfolioargprog.enums.TipoItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class HomeController {

    @Autowired
    InformacionService informacionService;

    @Autowired
    ItemService ItemService;
    
    @GetMapping("/cabecera")
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

    @GetMapping("/acerca_de")
    public Map<String, String> acerca_de(){
        Informacion sobremi = informacionService.getBySlug("sobremi").get();
        Informacion url_imagen_sobremi = informacionService.getBySlug("url_imagen_sobremi").get();

        HashMap<String, String> map = new HashMap<>();
        map.put("sobremi", sobremi.getValor());
        map.put("url_imagen_sobremi", url_imagen_sobremi.getValor());
        return map;
    }

    @GetMapping("/educacion")
    public Map<String, List> educacion(){
        List<Item> items = ItemService.findByTipo(TipoItem.educacion);
        HashMap<String, List> map = new HashMap<>();
        map.put("items", items);
        return map;
    }

    @GetMapping("/experiencia")
    public Map<String, List> experiencia(){
        List<Item> items = ItemService.findByTipo(TipoItem.experiencia);
        HashMap<String, List> map = new HashMap<>();
        map.put("items", items);
        return map;
    }

    /*
    @GetMapping("/tecnologias")
    public String tecnologias(Principal principal){
        return principal.getName();
    }

    @GetMapping("/proyectos")
    public String proyectos(Principal principal){
        return principal.getName();
    } */
}
