/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolioargprog.Controller;

import com.portfolio.portfolioargprog.dto.NuevaSkill;
import com.portfolio.portfolioargprog.service.SkillService;
import com.portfolio.portfolioargprog.entity.Skill;
import com.portfolio.portfolioargprog.enums.TipoSkill;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
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
    
    @PostMapping("/skillHard")
    public Boolean skillHard(@Valid @RequestBody NuevaSkill nuevaSkill){
        Skill skill = new Skill(TipoSkill.hard, nuevaSkill.getTexto(), nuevaSkill.getValor());
        skillService.save(skill);
        return true;
    }
    
    @PostMapping("/skillSoft")
    public Boolean skillSoft(@Valid @RequestBody NuevaSkill nuevaSkill){
        Skill skill = new Skill(TipoSkill.soft, nuevaSkill.getTexto(), nuevaSkill.getValor());
        skillService.save(skill);
        return true;
    }
    
    @DeleteMapping("/skill/{id}")
    public Boolean eliminar(@PathVariable Integer id){
         Skill item = skillService.findbyId(id);
         skillService.delete(item);
         return true;
    }
}
