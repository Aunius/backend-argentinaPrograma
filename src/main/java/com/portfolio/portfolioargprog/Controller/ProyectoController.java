/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

import com.portfolio.portfolioargprog.service.ProyectoService;
import com.portfolio.portfolioargprog.entity.Proyecto;

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
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;

    @GetMapping("/home/proyectos")
    public Map<String, List> educacion(){
        List<Proyecto> proyectos = proyectoService.findAll();
        HashMap<String, List> map = new HashMap<>();
        map.put("proyectos", proyectos);
        return map;
    }
}
