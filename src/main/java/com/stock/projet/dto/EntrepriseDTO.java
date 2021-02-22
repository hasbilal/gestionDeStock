package com.stock.projet.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Adresse;
import com.stock.projet.entities.Entreprise;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class EntrepriseDTO {

    private long idEntreprise;
    private String nomEntreprise;
    private String descriptionEntreprise;
    private String emailEntreprise;
    private String numTelephone;
    private String steWeb;
    private AdresseDTO adresse;
    private String codeFiscal;
    private String imageEntreprise;
    @JsonIgnore
    private List<UtilisateurDTO> utilisateurs;

    public static EntrepriseDTO fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return null;
        }

        return EntrepriseDTO.builder()
                .idEntreprise(entreprise.getIdEntreprise())
                .nomEntreprise(entreprise.getNomEntreprise())
                .descriptionEntreprise(entreprise.getDescriptionEntreprise())
                .emailEntreprise(entreprise.getEmailEntreprise())
                .numTelephone(entreprise.getNumTelephone())
                .steWeb(entreprise.getSteWeb())
                .codeFiscal(entreprise.getCodeFiscal())
                .imageEntreprise(entreprise.getImageEntreprise())
                .build();
    }


    public static Entreprise toEntity(EntrepriseDTO entrepriseDTO){
        if(entrepriseDTO == null){
            return null;
        }

        return  Entreprise.builder()
                .idEntreprise(entrepriseDTO.getIdEntreprise())
                .nomEntreprise(entrepriseDTO.getNomEntreprise())
                .descriptionEntreprise(entrepriseDTO.getDescriptionEntreprise())
                .emailEntreprise(entrepriseDTO.getEmailEntreprise())
                .numTelephone(entrepriseDTO.getNumTelephone())
                .steWeb(entrepriseDTO.getSteWeb())
                .codeFiscal(entrepriseDTO.getCodeFiscal())
                .imageEntreprise(entrepriseDTO.getImageEntreprise())
                .build();
    }
}
