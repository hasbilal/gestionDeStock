package com.stock.projet.validators;

import com.stock.projet.dto.MvmDeStockDTO;


import java.util.ArrayList;
import java.util.List;

public class MvmDeStockValidateur {

    public static List<String> validate(MvmDeStockDTO mvmDeStockDTO) {

        List<String> erreur = new ArrayList<>();

        if (mvmDeStockDTO == null) {
            erreur.add("Veuillez renseigner le nom d'utilisateur ");
            erreur.add("Veuillez renseigner l'article' ");
            erreur.add("Veuillez renseigner le type de mouvement ");
            erreur.add("Veuillez renseigner la date du mvmDeStock ");
            return erreur;
        }

        if (mvmDeStockDTO.getQuantite() == null) {
            erreur.add("Veuillez renseigner le nom d'utilisateur ");
        }

        if (mvmDeStockDTO.getArticle() == null) {
            erreur.add("Veuillez renseigner l'article' ");
        }

        if (mvmDeStockDTO.getTypeMovement() == null) {
            erreur.add("Veuillez renseigner le type de mouvement ");
        }

        if (mvmDeStockDTO.getDateMvmStock() == null) {
            erreur.add("Veuillez renseigner la date du mvmDeStock ");
        }

        return erreur;
    }
}