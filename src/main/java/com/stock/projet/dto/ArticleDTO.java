package com.stock.projet.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

import java.util.List;

@Builder
@Data
public class ArticleDTO {


    private long IdArticle;
    private String designation;
    private String codeArticle;
    private BigDecimal prixUnitaireHT;
    private BigDecimal tauxTVA;
    private BigDecimal prixUnitaireTTC;
    private String imageArticle;



    @JsonIgnore
    private CategorieDTO categorie;


    @JsonIgnore
    private List<LigneCmdClientDTO> ligneCmdClient;

    @JsonIgnore
    private List<LigneCmdFournisseurDTO>ligneCmdFournisseurs;


    @JsonIgnore
    private List<MvmDeStockDTO>mvmDeStocks;


    @JsonIgnore
    private List<LigneVenteDTO>ligneVentes;


    public static ArticleDTO fromEntity(Article article){
        if(article == null){
            return null;
        }
        return ArticleDTO.builder()
                .IdArticle(article.getIdArticle())
                .designation(article.getDesignation())
                .codeArticle(article.getCodeArticle())
                .imageArticle(article.getImageArticle())
                .prixUnitaireHT(article.getPrixUnitaireHT())
                .prixUnitaireTTC(article.getPrixUnitaireTTC())
                .tauxTVA(article.getTauxTVA())
                .build();
    }

    public static Article toEntity(ArticleDTO articleDTO){
        if(articleDTO == null){
            return null;
        }
        return Article.builder()
                .IdArticle(articleDTO.getIdArticle())
                .designation(articleDTO.getDesignation())
                .codeArticle(articleDTO.getCodeArticle())
                .imageArticle(articleDTO.getImageArticle())
                .prixUnitaireHT(articleDTO.getPrixUnitaireHT())
                .prixUnitaireTTC(articleDTO.getPrixUnitaireTTC())
                .tauxTVA(articleDTO.getTauxTVA())
                .build();
    }
}
