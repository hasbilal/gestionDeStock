package com.stock.projet.dto;

import com.stock.projet.entities.Adresse;
import com.stock.projet.entities.Categorie;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDTO {

    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostale;
    private String pays;


    public static AdresseDTO fromEntity(Adresse adresse){
        if (adresse==null){
            return null;
        }
        return AdresseDTO.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(AdresseDTO adresseDTO){
        if(adresseDTO ==null){
            return null;
        }
        return Adresse.builder()
                .adresse1(adresseDTO.getAdresse1())
                .adresse2(adresseDTO.getAdresse2())
                .codePostale(adresseDTO.getCodePostale())
                .ville(adresseDTO.getVille())
                .pays(adresseDTO.getPays())
                .build();

    }
}
