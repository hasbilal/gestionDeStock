package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.LigneCmdClient;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneCmdClientDTO {

    private long idLigneCmdClient;
    @JsonIgnore
    private CmdClientDTO cmdClient;
    @JsonIgnore
    private ArticleDTO article;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;


    public static LigneCmdClientDTO fromEntity(LigneCmdClient ligneCmdClient){
        if(ligneCmdClient==null){
            return null;
        }

        return LigneCmdClientDTO.builder()
                .idLigneCmdClient(ligneCmdClient.getIdLigneCmdClient())
                .quantite(ligneCmdClient.getQuantite())
                .prixUnitaire(ligneCmdClient.getPrixUnitaire())
                .build();
    }


    public static LigneCmdClient toEntity(LigneCmdClientDTO ligneCmdClientDTO){
        if(ligneCmdClientDTO == null){
            return null;
        }


        return LigneCmdClient.builder()
                .idLigneCmdClient(ligneCmdClientDTO.getIdLigneCmdClient())
                .quantite(ligneCmdClientDTO.getQuantite())
                .prixUnitaire(ligneCmdClientDTO.getPrixUnitaire())
                .build();
    }
}
