package com.stock.projet.validators;

import com.stock.projet.dto.CmdFournisseurDTO;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CmdFournisseurValidateur {

    public static List<String> validate(CmdFournisseurDTO cmdFournisseurDTO) {

        List<String> erreur = new ArrayList<>();


        if(cmdFournisseurDTO==null){
            erreur.add("Veuillez renseigner le code  cmdFournisseur");
            erreur.add("Veuillez renseigner la date  cmdFournisseur");
            erreur.add("Veuillez renseigner le  Fournisseur");

            return erreur;
        }

        if (!StringUtils.hasLength(cmdFournisseurDTO.getCodeFournisseur())) {
            erreur.add("Veuillez renseigner le code  cmdFournisseur");
        }

        if (cmdFournisseurDTO.getDateCmdFournisseur() == null) {
            erreur.add("Veuillez renseigner la date  cmdFournisseur");
        }

        if (cmdFournisseurDTO.getFournisseur() == null) {
            erreur.add("Veuillez renseigner le  Fournisseur");
        }

        return erreur;
    }
}