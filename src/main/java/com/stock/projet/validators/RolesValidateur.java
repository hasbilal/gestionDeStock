package com.stock.projet.validators;

import com.stock.projet.dto.RolesDTO;
import com.stock.projet.dto.UtilisateurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RolesValidateur {

    public static List<String> validate(RolesDTO rolesDTO) {

        List<String> erreur = new ArrayList<>();

        if (rolesDTO == null) {

            erreur.add("Veuillez renseigner un role ");
            erreur.add("Veuillez renseigner un utilisateur ");

            return erreur;
        }

        if (!StringUtils.hasLength(rolesDTO.getNomRole())) {
            erreur.add("Veuillez renseigner un role ");
        }

        if (rolesDTO.getUtilisateur() == null) {
            erreur.add("Veuillez renseigner un utilisateur ");
        }

        return erreur;
    }
}