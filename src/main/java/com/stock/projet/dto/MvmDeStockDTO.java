package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.MvmDeStock;
import com.stock.projet.entities.TypeMvmStock;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvmDeStockDTO {


    private long idMvmDeStock;
    private Instant dateMvmStock;
    private BigDecimal quantite;

    @JsonIgnore
    private TypeMvmStock typeMovement;
    @JsonIgnore
    private ArticleDTO article;


    public static MvmDeStockDTO fromEntity(MvmDeStock mvmDeStock){
        if(mvmDeStock==null){
            return null;
        }


        return MvmDeStockDTO.builder()
                .idMvmDeStock(mvmDeStock.getIdMvmDeStock())
                .dateMvmStock(mvmDeStock.getDateMvmStock())
                .quantite(mvmDeStock.getQuantite())
                .build();
    }


    public static MvmDeStock toEntity(MvmDeStockDTO mvmDeStockDTO){
        if(mvmDeStockDTO == null){
            return null;
        }

        return MvmDeStock.builder()
                .idMvmDeStock(mvmDeStockDTO.getIdMvmDeStock())
                .dateMvmStock(mvmDeStockDTO.getDateMvmStock())
                .quantite(mvmDeStockDTO.getQuantite())
                .build();
    }
}
