package com.stock.projet.validators;

import com.stock.projet.dto.LigneCmdClientDTO;
import com.stock.projet.dto.LigneCmdFournisseurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCmdFournisseurValidateur {

    public static List<String> validate(LigneCmdFournisseurDTO ligneCmdFournisseurDTO) {

        List<String> erreur = new ArrayList<>();

        if(ligneCmdFournisseurDTO==null){
            erreur.add("Veuillez renseigner une quantité");
            erreur.add("Veuillez renseigner le prix unitaire");
            erreur.add("Veuillez renseigner l'article");
            erreur.add("Veuillez renseigner CmdFournisseur");


            return erreur;
        }


        if(ligneCmdFournisseurDTO.getQuantite()==null){
            erreur.add("Veuillez renseigner une quantité");
        }

        if(ligneCmdFournisseurDTO.getPrixUnitaire()==null){
            erreur.add("Veuillez renseigner le prix unitaire");
        }

        if(ligneCmdFournisseurDTO.getArticle()==null){
            erreur.add("Veuillez renseigner l'article");
        }

        if(ligneCmdFournisseurDTO.getCmdFournisseur()==null){
            erreur.add("Veuillez renseigner CmdFournisseur");
        }



        return erreur;



    }


}
