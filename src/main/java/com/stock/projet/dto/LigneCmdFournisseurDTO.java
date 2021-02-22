package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.LigneCmdFournisseur;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneCmdFournisseurDTO {


    private long idligneCmdFournisseur;

    @JsonIgnore
    private CmdFournisseurDTO cmdFournisseur;
    @JsonIgnore
    private ArticleDTO article;

    private BigDecimal quantite;
    private BigDecimal prixUnitaire;


    public static LigneCmdFournisseurDTO fromEntity (LigneCmdFournisseur ligneCmdFournisseur){
       if(ligneCmdFournisseur==null){
           return null;
       }

       return LigneCmdFournisseurDTO.builder()
               .idligneCmdFournisseur(ligneCmdFournisseur.getIdligneCmdFournisseur())
               .quantite(ligneCmdFournisseur.getQuantite())
               .prixUnitaire(ligneCmdFournisseur.getPrixUnitaire())
               .build();
    }
}
