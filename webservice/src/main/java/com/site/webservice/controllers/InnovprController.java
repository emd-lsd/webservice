package com.site.webservice.controllers;

import com.site.webservice.models.Goszak;
import com.site.webservice.models.Innovpr;
import com.site.webservice.repo.GoszakRepository;
import com.site.webservice.repo.InnovprRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class InnovprController {
    @Autowired
    InnovprRepository innovprRepository;

    @GetMapping("/innovpr")
    public String innovprMain(Model model, @RequestParam(required = false) String keyword){
        Iterable<Innovpr> innovprs;
        if (keyword != null && !keyword.isEmpty()) {
            // Если ключевое слово задано, выполните поиск по атрибуту OKVED_Description
            innovprs = innovprRepository.findByNameContainingOrTasksContaining(keyword, keyword);
        } else {
            // В противном случае получите все предприятия
            innovprs = innovprRepository.findAll();
        }
        model.addAttribute("innovprs", innovprs);
        model.addAttribute("keyword", keyword);
        return "innovpr";
    }

    @GetMapping("/innovpr/{id}")
    public String innovprDetails(@PathVariable(value = "id") long id, Model model){
        if(!innovprRepository.existsById(id)){
            return "redirect:/innovpr";
        }

        Optional<Innovpr> innovpr = innovprRepository.findById(id);
        ArrayList<Innovpr> res = new ArrayList<>();
        innovpr.ifPresent(res::add);
        model.addAttribute("innovpr", res);
        return "innovpr-details";
    }

}
