package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VenteDTO {

    private long idVente;
    private String codeVente;
    private Instant dateVente;
    private String commentaire;

    @JsonIgnore
    private List<LigneVenteDTO> ligneVentes;


    public static VenteDTO fromEntity(Vente vente){
        if(vente==null){
            return null;
        }

        return VenteDTO.builder()
                .idVente(vente.getIdVente())
                .codeVente(vente.getCodeVente())
                .dateVente(vente.getDateVente())
                .commentaire(vente.getCommentaire())
                .build();
    }


    public static Vente toEntity(VenteDTO venteDTO){
        if(venteDTO==null){
            return null;
        }

        return Vente.builder()
                .idVente(venteDTO.getIdVente())
                .codeVente(venteDTO.getCodeVente())
                .dateVente(venteDTO.getDateVente())
                .commentaire(venteDTO.getCommentaire())
                .build();
    }
}
