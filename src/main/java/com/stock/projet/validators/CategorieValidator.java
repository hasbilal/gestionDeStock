package com.stock.projet.validators;

import com.stock.projet.dto.CategorieDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategorieValidator {

    public static List<String> validate(CategorieDTO categorieDTO){
        List<String> erreur = new ArrayList<>();


        if(categorieDTO==null || !StringUtils.hasLength(categorieDTO.getCodeCategorie())){

            erreur.add("Veuillez renseigner le code de la categorie ");
        }



        return erreur;
    }
}
