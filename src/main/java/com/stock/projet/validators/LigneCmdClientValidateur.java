package com.stock.projet.validators;

import com.stock.projet.dto.EntrepriseDTO;
import com.stock.projet.dto.LigneCmdClientDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCmdClientValidateur {
    public static List<String> validate(LigneCmdClientDTO ligneCmdClientDTO) {

        List<String> erreur = new ArrayList<>();


        if (ligneCmdClientDTO == null) {
            erreur.add("Veuillez renseigner cmdClient ");
            erreur.add("Veuillez renseigner le prix unitaire");
            erreur.add("Veuillez renseigner la quantité ");
            erreur.add("Veuillez renseigner l'article ");
            erreur.add("Veuillez renseigner cmdClient ");

            return erreur;

        }

        if (ligneCmdClientDTO.getPrixUnitaire() == null) {
            erreur.add("Veuillez renseigner le prix unitaire");
        }

        if (ligneCmdClientDTO.getQuantite() == null) {
            erreur.add("Veuillez renseigner la quantité ");
        }


        if (ligneCmdClientDTO.getArticle() == null) {
            erreur.add("Veuillez renseigner l'article ");
        }

        if (ligneCmdClientDTO.getCmdClient() == null) {
            erreur.add("Veuillez renseigner cmdClient ");
        }

        return erreur;

    }
}
