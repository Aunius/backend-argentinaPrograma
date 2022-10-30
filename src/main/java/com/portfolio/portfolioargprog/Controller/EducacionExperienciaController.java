/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

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
@CrossOrigin
public class EducacionExperienciaController {

    @Autowired
    ItemService itemService;

    @GetMapping("/home/educacion")
    public Map<String, List> educacion(){
        List<Item> items = itemService.findByTipo(TipoItem.educacion);
        HashMap<String, List> map = new HashMap<>();
        map.put("items", items);
        return map;
    }

    @GetMapping("/home/experiencia")
    public Map<String, List> experiencia(){
        List<Item> items = itemService.findByTipo(TipoItem.experiencia);
        HashMap<String, List> map = new HashMap<>();
        map.put("items", items);
        return map;
    }
}
