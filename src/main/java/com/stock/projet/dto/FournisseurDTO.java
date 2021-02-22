package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Fournisseur;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class FournisseurDTO {

    private long idFournisseur;
    private String nomFournisseur;
    private String prenomFournisseur;
    @JsonIgnore
    private AdresseDTO adresseFournisseur;
    private String emailFournisseur;
    private String imageFournisseur;
    private String numTelephone;
    @JsonIgnore
    private List<CmdFournisseurDTO> cmdFournisseurs;


    public static FournisseurDTO fromEntity(Fournisseur fournisseur){
        if(fournisseur==null){
            return null;
        }

        return FournisseurDTO.builder()
                .idFournisseur(fournisseur.getIdFournisseur())
                .nomFournisseur(fournisseur.getNomFournisseur())
                .prenomFournisseur(fournisseur.getPrenomFournisseur())
                .emailFournisseur(fournisseur.getEmailFournisseur())
                .imageFournisseur(fournisseur.getImageFournisseur())
                .numTelephone(fournisseur.getNumTelephone())
                .build();
    }


    public static Fournisseur toEntity(FournisseurDTO fournisseurDTO){
        if(fournisseurDTO==null){
            return null;
        }

        return Fournisseur.builder()
                .idFournisseur(fournisseurDTO.getIdFournisseur())
                .nomFournisseur(fournisseurDTO.getNomFournisseur())
                .prenomFournisseur(fournisseurDTO.getPrenomFournisseur())
                .emailFournisseur(fournisseurDTO.getImageFournisseur())
                .imageFournisseur(fournisseurDTO.getImageFournisseur())
                .numTelephone(fournisseurDTO.getNumTelephone())
                .build();
    }
}
