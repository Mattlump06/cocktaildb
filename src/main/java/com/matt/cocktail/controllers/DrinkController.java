package com.matt.cocktail.controllers;

import com.matt.cocktail.domain.Drink;
import com.matt.cocktail.repositories.DrinkRepository;
import net.bytebuddy.TypeCache;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import net.minidev.json.JSONArray;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Controller
@CrossOrigin
@RequestMapping(path = "/api")
public class DrinkController {






    private final DrinkRepository drinkRepository;

    JSONArray jsonArray = new JSONArray();

    public DrinkController(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }







    @GetMapping(path = "/all")
    @CrossOrigin
    public @ResponseBody Map<String, Iterable<Drink>> getAllDrinks(){
        Map<String, Iterable<Drink>> response = new HashMap<String, Iterable<Drink>>();
        response.put("drinks", drinkRepository.findAll());
        return response;
    }




//

    @GetMapping(path = "all/{id}")
    @CrossOrigin
    public @ResponseBody Map<String, Optional<Drink>> getById(@PathVariable Long id){
        Map<String, Optional<Drink>> response = new HashMap<>();
        response.put("drinks", drinkRepository.findById(id));

        return response;
    }


    @GetMapping(path = "/{drinkName}")
    @CrossOrigin
    public @ResponseBody Iterable<Drink> getByName(String name){
        Iterable<Drink> response = drinkRepository.findByDrinkName(name);
        return response;
    }









}
