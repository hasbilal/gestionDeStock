package com.stock.projet.controller;

import com.stock.projet.entities.Article;
import com.stock.projet.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService service;

    //<<<<<<<<<<<<<<<<<<<<<<Post method>>>>>>>>>>>>>>>>>>>>>>>>>>>>//


    @PostMapping("/addArticle")
    public Article addArticle(@RequestBody Article article){
        return service.saveArticle(article);
    }

    @PostMapping("/addArticles")
    public List<Article> addArticles(@RequestBody List<Article> articles){
        return service.saveArticles(articles);
    }


    //<<<<<<<<<<<<<<<<<<<<<<Get method>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    @GetMapping("/articles")
    public List<Article> findAllArticles(){
        return service.getArticles();
    }

    @GetMapping("/articleByid/{id}")
    public Article findArticleById(@PathVariable long id){
        return service.getArticleById(id);
    }

    /*@GetMapping("/articleByName/{nom}")
    public Article findArticleByName(@PathVariable String nom){
        return service.getArticleByName(nom);
    }*/

    //<<<<<<<<<<<<<<<<<<<<<<Put method>>>>>>>>>>>>>>>>>>>>>>>>>>>>//

    @PutMapping("/update")
    public Article updateArticle(@RequestBody Article article){
        return service.updateArticle(article);
    }

    //<<<<<<<<<<<<<<<<<<<<<<Delete method>>>>>>>>>>>>>>>>>>>>>>>>>>
    @DeleteMapping("/delete/{id}")
    public String deleteArticle(@PathVariable long id ){
        return service.deleteArticle(id);
    }
}
