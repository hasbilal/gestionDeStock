package com.stock.projet.validators;


import com.stock.projet.dto.LigneVenteDTO;


import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidateur {
    public static List<String> validate(LigneVenteDTO ligneVenteDTO) {

        List<String> erreur = new ArrayList<>();


        if (ligneVenteDTO == null) {
            erreur.add("Veuillez renseigner une quantité");
            erreur.add("Veuillez renseigner le prix unitaire");
            erreur.add("Veuillez renseigner l'article");
            erreur.add("Veuillez renseigner une vente");


            return erreur;
        }


        if (ligneVenteDTO.getQuantite() == null) {
            erreur.add("Veuillez renseigner une quantité");
        }

        if (ligneVenteDTO.getPrixUnitaire() == null) {
            erreur.add("Veuillez renseigner le prix unitaire");
        }

        if (ligneVenteDTO.getArticle() == null) {
            erreur.add("Veuillez renseigner l'article");
        }

        if (ligneVenteDTO.getVente() == null) {
            erreur.add("Veuillez renseigner une vente");
        }


        return erreur;
    }
}