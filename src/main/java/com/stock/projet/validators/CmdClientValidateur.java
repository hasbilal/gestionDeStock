package com.stock.projet.validators;

import com.stock.projet.dto.CmdClientDTO;
import com.stock.projet.dto.FournisseurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CmdClientValidateur {

    public static List<String> validate(CmdClientDTO cmdClientDTO) {

        List<String> erreur = new ArrayList<>();

        if (cmdClientDTO == null) {
            erreur.add("Veuillez renseigner le code cmdClient ");
            erreur.add("Veuillez renseigner la date  cmdClient ");
            erreur.add("Veuillez renseigner un client ");
            return erreur;
        }

        if (!StringUtils.hasLength(cmdClientDTO.getCodeClient())) {
            erreur.add("Veuillez renseigner le code cmdClient ");
        }

        if (cmdClientDTO.getDateCmdClient() == null) {
            erreur.add("Veuillez renseigner la date  cmdClient ");
        }

        if (cmdClientDTO.getClient() == null) {
            erreur.add("Veuillez renseigner un client ");
        }


        return erreur;
    }
}