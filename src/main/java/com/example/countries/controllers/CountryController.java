package com.example.countries.controllers;

import com.example.countries.entitles.Country;
import com.example.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * Created by owoez on 10/12/2019
 *
 * @author : owoez
 * @date : 10/12/2019
 * @project : countries
 */
@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepo;

    @GetMapping("/")
    public String showPage(Model model, @PageableDefault(size=4) Pageable pageable){
        model.addAttribute("data", countryRepo.findAll(pageable));
        model.addAttribute("currentPage", pageable.getPageNumber());
        return "index";
    }

    @PostMapping("/save")
    public String save(Country c){
        countryRepo.save(c);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Integer id){
        countryRepo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Country> findOne(Integer id){
        return countryRepo.findById(id);
    }
}
