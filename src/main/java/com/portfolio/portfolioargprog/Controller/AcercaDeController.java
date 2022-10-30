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
@CrossOrigin
public class AcercaDeController {

    @Autowired
    InformacionService informacionService;

    @GetMapping("/home/acerca_de")
    public Map<String, String> acerca_de(){
        Informacion sobremi = informacionService.getBySlug("sobremi").get();
        Informacion url_imagen_sobremi = informacionService.getBySlug("url_imagen_sobremi").get();

        HashMap<String, String> map = new HashMap<>();
        map.put("sobremi", sobremi.getValor());
        map.put("url_imagen_sobremi", url_imagen_sobremi.getValor());
        return map;
    }
}
