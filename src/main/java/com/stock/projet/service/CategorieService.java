package com.stock.projet.service;

import com.stock.projet.entities.Article;
import com.stock.projet.entities.Categorie;
import com.stock.projet.repository.ArticleRepository;
import com.stock.projet.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository repository;

    //<<<<<<<<<<<<<<<<<<<<<<Post method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    //post(1 categorie)
    public Categorie saveCategorie(Categorie categorie){
        return repository.save(categorie);
    }
    //post(plusieurs Categorie)
    public List<Categorie> saveCategories(List<Categorie> categories){
        return repository.saveAll(categories);
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<Get method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    //get(tout les Categories)
    public List<Categorie> getCategories(){
        return repository.findAll();
    }
    //get(categorie par id)
    //pas de correspondence return null
    public Categorie getCategorieById(long id){
        return repository.findById(id).orElse(null);
    }
    //get(Categorie par nom)
    /*public Categorie getCategorieByName(String  nom){
        return repository.findByName(nom);
    }*/
    //<<<<<<<<<<<<<<<<<<<<<<<<<Delete method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    public String deleteCategorie(Long id){
        repository.deleteById(id);
        return "l'article est bien supprimé "+id;
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<Put method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//

    public Categorie updateCategorie(Categorie categorie){
        Categorie articleAncien = repository.findById(categorie.getIdCategorie()).orElse(null);
        articleAncien.setCodeCategorie(categorie.getCodeCategorie());
        articleAncien.setDesignation(categorie.getDesignation());

        return repository.save(categorie);
    }

}
