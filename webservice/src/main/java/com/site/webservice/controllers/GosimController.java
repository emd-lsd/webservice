package com.site.webservice.controllers;

import com.site.webservice.models.Gosim;
import com.site.webservice.models.Promp;
import com.site.webservice.repo.GosimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class GosimController {

    @Autowired
    GosimRepository gosimRepository;

    @GetMapping("/gosim")
    public String gosimMain(Model model, @RequestParam(required = false) String keyword){
        Iterable<Gosim> gosims;
        if (keyword != null && !keyword.isEmpty()) {
            // Если ключевое слово задано, выполните поиск по атрибуту OKVED_Description
            gosims = gosimRepository.findByAddressContainingOrObjectareaContaining(keyword, keyword);
        } else {
            // В противном случае получите все предприятия
            gosims = gosimRepository.findAll();
        }
        model.addAttribute("gosims", gosims);
        model.addAttribute("keyword", keyword);
        return "gosim";
    }

    @GetMapping("/gosim/{id}")
    public String gosimDetails(@PathVariable(value = "id") long id, Model model){
        if(!gosimRepository.existsById(id)){
            return "redirect:/gosim";
        }

        Optional<Gosim> gosim = gosimRepository.findById(id);
        ArrayList<Gosim> res = new ArrayList<>();
        gosim.ifPresent(res::add);
        model.addAttribute("gosim", res);
        return "gosim-details";
    }
}
