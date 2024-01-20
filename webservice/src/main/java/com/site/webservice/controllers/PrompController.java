package com.site.webservice.controllers;

import com.site.webservice.models.Promp;
import com.site.webservice.repo.PrompRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class PrompController {

    @Autowired
    private PrompRepository prompRepository;

    @GetMapping("/promp")
    public String prompMain(Model model, @RequestParam(required = false) String keyword){
        Iterable<Promp> promps;
        if (keyword != null && !keyword.isEmpty()) {
            // Если ключевое слово задано, выполните поиск по атрибуту OKVED_Description
            promps = prompRepository.findByOKVEDDContainingOrDistrictContainingOrAddressContaining(keyword, keyword, keyword);
        } else {
            // В противном случае получите все предприятия
            promps = prompRepository.findAll();
        }
        model.addAttribute("promps", promps);
        model.addAttribute("keyword", keyword);
        return "promp";
    }

    @GetMapping("/promp/{id}")
    public String promDetails(@PathVariable(value = "id") long id, Model model){
        if(!prompRepository.existsById(id)){
            return "redirect:/promp";
        }

        Optional<Promp> promp = prompRepository.findById(id);
        ArrayList<Promp> res = new ArrayList<>();
        promp.ifPresent(res::add);
        model.addAttribute("promp", res);
        return "promp-details";
    }
}
