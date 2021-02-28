package com.stock.projet.validators;

import com.stock.projet.dto.FournisseurDTO;
import com.stock.projet.dto.UtilisateurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidateur {

    public static List<String> validate(FournisseurDTO fournisseurDTO) {

        List<String> erreur = new ArrayList<>();

        if (fournisseurDTO == null) {
            erreur.add("Veuillez renseigner le nom du Fournisseur ");
            erreur.add("Veuillez renseigner le prenom du Fournisseur ");
            erreur.add("Veuillez renseigner l'email du Fournisseur ");
            erreur.add("Veuillez renseigner le numero de thelephone  du Fournisseur ");

            return erreur;
        }

        if (!StringUtils.hasLength(fournisseurDTO.getNomFournisseur())) {
            erreur.add("Veuillez renseigner le nom du Fournisseur ");
        }

        if (!StringUtils.hasLength(fournisseurDTO.getPrenomFournisseur())) {
            erreur.add("Veuillez renseigner le prenom du Fournisseur ");
        }

        if (!StringUtils.hasLength(fournisseurDTO.getEmailFournisseur())) {
            erreur.add("Veuillez renseigner l'email du Fournisseur ");
        }
        if (!StringUtils.hasLength(fournisseurDTO.getNumTelephone())) {
            erreur.add("Veuillez renseigner le numero de thelephone  du Fournisseur ");
        }

        return erreur;

    }
}
