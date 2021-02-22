package com.stock.projet.controller;

import com.stock.projet.entities.Article;
import com.stock.projet.entities.Categorie;
import com.stock.projet.service.ArticleService;
import com.stock.projet.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {

    @Autowired
    private CategorieService service;

    //<<<<<<<<<<<<<<<<<<<<<<Post method>>>>>>>>>>>>>>>>>>>>>>>>>>>>//


    @PostMapping("/addCategorie")
    public Categorie addCategorie(@RequestBody Categorie categorie){
        return service.saveCategorie(categorie);
    }

    @PostMapping("/addCategories")
    public List<Categorie> addCategories (@RequestBody List<Categorie> categories){
        return service.saveCategories(categories);
    }


    //<<<<<<<<<<<<<<<<<<<<<<Get method>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    @GetMapping("/categories")
    public List<Categorie> findAllCategories(){
        return service.getCategories();
    }

    @GetMapping("/categorieByid/{id}")
    public Categorie findCategorieById(@PathVariable long id){
        return service.getCategorieById(id);
    }

    /*@GetMapping("/categorieByName/{nom}")
    public Categorie findCategorieByName(@PathVariable String nom){
        return service.getCategorieByName(nom);
    }*/

    //<<<<<<<<<<<<<<<<<<<<<<Put method>>>>>>>>>>>>>>>>>>>>>>>>>>>>//

    @PutMapping("/updateCategorie")
    public Categorie updateArticle(@RequestBody Categorie categorie){
        return service.updateCategorie(categorie);
    }

    //<<<<<<<<<<<<<<<<<<<<<<Delete method>>>>>>>>>>>>>>>>>>>>>>>>>>
    @DeleteMapping("/deleteCategorie/{id}")
    public String deleteCategorie(@PathVariable long id ){
        return service.deleteCategorie(id);
    }
}
