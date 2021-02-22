package com.stock.projet.service;

import com.stock.projet.entities.Article;
import com.stock.projet.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    //<<<<<<<<<<<<<<<<<<<<<<Post method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    //post(1 article)
    public Article saveArticle(Article article){
       return repository.save(article);
    }
    //post(plusieurs articles)
    public List<Article> saveArticles(List<Article> articles){
        return repository.saveAll(articles);
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<Get method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    //get(tout les articles)
    public List<Article> getArticles(){
        return repository.findAll();
    }
    //get(article par id)
    //pas de correspondence return null
    public Article getArticleById(long id){
        return repository.findById(id).orElse(null);
    }
    //get(article par nom)
    /*public Article getArticleByName(String  nom){
        return repository.findByName(nom);
    }*/
    //<<<<<<<<<<<<<<<<<<<<<<<<<Delete method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    public String deleteArticle(Long id){
        repository.deleteById(id);
        return "l'article est bien supprimé "+id;
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<Put method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//

    public Article updateArticle(Article article){
        Article articleAncien = repository.findById(article.getIdArticle()).orElse(null);
        articleAncien.setCategorie(article.getCategorie());
        articleAncien.setCodeArticle(article.getCodeArticle());
        articleAncien.setDesignation(article.getDesignation());
        articleAncien.setPrixUnitaireHT(article.getPrixUnitaireHT());
        articleAncien.setPrixUnitaireTTC(article.getPrixUnitaireTTC());
        article.setTauxTVA(article.getTauxTVA());
        return repository.save(article);
    }



}
