package com.stock.projet.validators;

import com.stock.projet.dto.UtilisateurDTO;
import com.stock.projet.entities.Utilisateur;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDTO utilisateurDTO){

        List<String> erreur = new ArrayList<>();

        if(utilisateurDTO ==null){
            erreur.add("Veuillez renseigner le nom d'utilisateur ");
            erreur.add("Veuillez renseigner le prenom d'utilisateur ");
            erreur.add("Veuillez renseigner le mail d'utilisateur ");
            erreur.add("Veuillez renseigner le Mot de passe ");
            erreur.add("Veuillez renseigner l'adresse de l'utilisateur ");

            return erreur;
        }
        if(!StringUtils.hasLength(utilisateurDTO.getNomUtilisateur())){
            erreur.add("Veuillez renseigner le nom d'utilisateur ");
        }

        if(!StringUtils.hasLength(utilisateurDTO.getPrenomUtilisateur())){
            erreur.add("Veuillez renseigner le prenom d'utilisateur ");
        }

        if( !StringUtils.hasLength(utilisateurDTO.getMail())){
            erreur.add("Veuillez renseigner le mail d'utilisateur ");
        }



        if(!StringUtils.hasLength(utilisateurDTO.getPwd())){
            erreur.add("Veuillez renseigner le Mot de passe ");
        }

        if(utilisateurDTO.getDateDeNaissance()==null){
            erreur.add("Veuillez renseigner la date de naissance ");
        }

        if(utilisateurDTO.getAdresseUtilisateur()==null){
            erreur.add("Veuillez renseigner l'adresse de l'utilisateur ");
        }
        else {
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseUtilisateur().getAdresse1())){
                erreur.add("Veuillez renseigner l'adrresse1' d'utilisateur ");
            }
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseUtilisateur().getCodePostale())){
                erreur.add("Veuillez renseigner le code postale de la ville  de l'utilisateur ");
            }
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseUtilisateur().getVille())){
                erreur.add("Veuillez renseigner la ville d'utilisateur ");
            }
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseUtilisateur().getPays())){
                erreur.add("Veuillez renseigner le pays d'utilisateur ");
            }
        }

        if(utilisateurDTO==null || !StringUtils.hasLength(utilisateurDTO.getNomUtilisateur())){
            erreur.add("Veuillez renseigner le nom d'utilisateur ");
        }

        return erreur;
    }
}
