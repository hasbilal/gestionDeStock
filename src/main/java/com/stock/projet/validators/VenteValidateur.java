package com.stock.projet.validators;

import com.stock.projet.dto.UtilisateurDTO;
import com.stock.projet.dto.VenteDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VenteValidateur {

    public static List<String> validate(VenteDTO venteDTO) {

        List<String> erreur = new ArrayList<>();

        if(venteDTO==null){
            erreur.add("Veuillez renseigner le code de la vente  ");
            erreur.add("Veuillez renseigner la date de la vente  ");


            return erreur;
        }

        if (!StringUtils.hasLength(venteDTO.getCodeVente())) {
            erreur.add("Veuillez renseigner le code de la vente  ");
        }

        if (venteDTO.getDateVente() == null) {
            erreur.add("Veuillez renseigner la date de la vente  ");
        }

        return erreur;
    }
}
