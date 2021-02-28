package com.stock.projet.validators;

import com.stock.projet.dto.ArticleDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidateur {

    public static List<String> validate(ArticleDTO articleDTO){
        List<String> erreur = new ArrayList<>();

        if(articleDTO == null){
            erreur.add("Veuillez renseigner le code d'article ");
            erreur.add("Veuillez renseigner la designation de l'article ");
            erreur.add("Veuillez renseigner le TauxTVA de l'article");
            erreur.add("Veuillez renseigner le PrixUnitaireTTC de l'article");
            erreur.add("Veuillez renseigner une categorie de l'article");erreur.add("Veuillez renseigner l'adresse de l'utilisateur ");
            erreur.add("Veuillez renseigner le PrixUnitaireHT de l'article");

            return erreur;
        }

        if(!StringUtils.hasLength(articleDTO.getCodeArticle())){
            erreur.add("Veuillez renseigner le code de l'article");

        }

        if(!StringUtils.hasLength(articleDTO.getDesignation())){
            erreur.add("Veuillez renseigner Designation de l'article");
        }

        if(articleDTO.getPrixUnitaireHT()==null){
            erreur.add("Veuillez renseigner le PrixUnitaireHT de l'article");
        }

        if(articleDTO.getTauxTVA()==null){
            erreur.add("Veuillez renseigner le TauxTVA de l'article");
        }

        if(articleDTO.getPrixUnitaireTTC()==null){
            erreur.add("Veuillez renseigner le PrixUnitaireTTC de l'article");
        }

        if(articleDTO.getCategorie()==null){
            erreur.add("Veuillez renseigner une categorie de l'article");
        }

        return erreur;

    }

}
