package com.site.webservice.controllers;

import com.site.webservice.models.Gosim;
import com.site.webservice.models.Goszak;
import com.site.webservice.repo.GosimRepository;
import com.site.webservice.repo.GoszakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class GoszakController {

    @Autowired
    GoszakRepository goszakRepository;

    @GetMapping("/goszak")
    public String goszakMain(Model model, @RequestParam(required = false) String keyword){
        Iterable<Goszak> goszaks;
        if (keyword != null && !keyword.isEmpty()) {
            // Если ключевое слово задано, выполните поиск по атрибуту OKVED_Description
            goszaks = goszakRepository.findByNameContainingOrMdobContaining(keyword, keyword);
        } else {
            // В противном случае получите все предприятия
            goszaks = goszakRepository.findAll();
        }
        model.addAttribute("goszaks", goszaks);
        model.addAttribute("keyword", keyword);
        return "goszak";
    }

    @GetMapping("/goszak/{id}")
    public String goszakDetails(@PathVariable(value = "id") long id, Model model){
        if(!goszakRepository.existsById(id)){
            return "redirect:/goszak";
        }

        Optional<Goszak> goszak = goszakRepository.findById(id);
        ArrayList<Goszak> res = new ArrayList<>();
        goszak.ifPresent(res::add);
        model.addAttribute("goszak", res);
        return "goszak-details";
    }
}
