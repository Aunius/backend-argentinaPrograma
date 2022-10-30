/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

import com.portfolio.portfolioargprog.service.SkillService;
import com.portfolio.portfolioargprog.entity.Skill;

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
public class SkillController {

    @Autowired
    SkillService skillService;
    
    @GetMapping("/home/skills")
    public Map<String, List> skills(){
        List<Skill> skills = skillService.findAll();
        HashMap<String, List> map = new HashMap<>();
        map.put("skills", skills);
        return map;
    }
}
