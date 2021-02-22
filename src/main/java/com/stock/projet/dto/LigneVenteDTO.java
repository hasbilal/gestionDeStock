package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.LigneVente;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDTO {

    private long idLigneVente;
    private BigDecimal quantite;

    @JsonIgnore
    private ArticleDTO article;
    @JsonIgnore
    private VenteDTO vente;

    private BigDecimal prixUnitaire;


    public static LigneVenteDTO fromEntity(LigneVente ligneVente){
        if(ligneVente == null){
            return null;
        }

        return LigneVenteDTO.builder()
                .idLigneVente(ligneVente.getIdLigneVente())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }


    public static LigneVente toEntity(LigneVenteDTO ligneVenteDTO){
        if(ligneVenteDTO==null){
            return null;
        }

        return LigneVente.builder()
                .idLigneVente(ligneVenteDTO.getIdLigneVente())
                .quantite(ligneVenteDTO.getQuantite())
                .prixUnitaire(ligneVenteDTO.getPrixUnitaire())
                .build();
    }
}
