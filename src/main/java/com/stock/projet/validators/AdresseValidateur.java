package com.stock.projet.validators;

import com.stock.projet.dto.AdresseDTO;
import com.stock.projet.dto.ArticleDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AdresseValidateur {

    public static List<String> validate(AdresseDTO adresseDTO) {
        List<String> erreur = new ArrayList<>();

        if (adresseDTO == null) {

            erreur.add("Veuillez renseigner l'adresse'");
            erreur.add("Veuillez renseigner la ville'");
            erreur.add("Veuillez renseigner le pays'");
            erreur.add("Veuillez renseigner le code postale");

            return erreur;
        }

        if (!StringUtils.hasLength(adresseDTO.getAdresse1())) {
            erreur.add("Veuillez renseigner l'adresse'");
        }

        if (!StringUtils.hasLength(adresseDTO.getVille())) {
            erreur.add("Veuillez renseigner la ville'");
        }

        if (!StringUtils.hasLength(adresseDTO.getPays())) {
            erreur.add("Veuillez renseigner le pays'");
        }

        if (!StringUtils.hasLength(adresseDTO.getCodePostale())) {
            erreur.add("Veuillez renseigner le code postale");
        }

        return erreur;
    }
}
