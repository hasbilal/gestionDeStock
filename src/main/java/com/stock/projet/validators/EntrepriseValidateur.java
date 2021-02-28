package com.stock.projet.validators;


import com.stock.projet.dto.EntrepriseDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidateur {

    public static List<String> validate(EntrepriseDTO entrepriseDTO) {

        List<String> erreur = new ArrayList<>();

        if(entrepriseDTO==null){
            erreur.add("Veuillez renseigner le nom de l'entreprise");
            erreur.add("Veuillez renseigner le code fiscal de l'entreprise");
            erreur.add("Veuillez renseigner l'email' de l'entreprise");
            erreur.add("Veuillez renseigner le telephone de l'entreprise");
            erreur.add("Veuillez renseigner le site web de l'entreprise");

            return erreur;
        }

        if (!StringUtils.hasLength(entrepriseDTO.getNomEntreprise())) {
            erreur.add("Veuillez renseigner le nom de l'entreprise");
        }

        if (!StringUtils.hasLength(entrepriseDTO.getCodeFiscal())) {
            erreur.add("Veuillez renseigner le code fiscal de l'entreprise");
        }

        if (!StringUtils.hasLength(entrepriseDTO.getEmailEntreprise())) {
            erreur.add("Veuillez renseigner l'email' de l'entreprise");
        }

        if (!StringUtils.hasLength(entrepriseDTO.getNumTelephone())) {
            erreur.add("Veuillez renseigner le telephone de l'entreprise");
        }

        if (!StringUtils.hasLength(entrepriseDTO.getSteWeb())) {
            erreur.add("Veuillez renseigner le site web de l'entreprise");
        }


        return erreur;
    }
}