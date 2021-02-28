package com.stock.projet.validators;

import com.stock.projet.dto.ClientDTO;
import com.stock.projet.dto.UtilisateurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidateur {

    public static List<String> validate(ClientDTO clientDTO){

        List<String> erreur = new ArrayList<>();

        if (clientDTO ==null){
            erreur.add("Veuillez renseigner le nom du client ");
            erreur.add("Veuillez renseigner le prenom du client ");
            erreur.add("Veuillez renseigner le email du client ");
            erreur.add("Veuillez renseigner le telephone du client ");
            return erreur;
        }

        if(!StringUtils.hasLength(clientDTO.getNomClient())){
            erreur.add("Veuillez renseigner le nom du client ");
        }

        if(!StringUtils.hasLength(clientDTO.getPrenomClient())){
            erreur.add("Veuillez renseigner le prenom du client ");
        }

        if(!StringUtils.hasLength(clientDTO.getEmailClient())){
            erreur.add("Veuillez renseigner le email du client ");
        }

        if(!StringUtils.hasLength(clientDTO.getNumTelephone())){
            erreur.add("Veuillez renseigner le telephone du client ");
        }

        return erreur;

    }

}
