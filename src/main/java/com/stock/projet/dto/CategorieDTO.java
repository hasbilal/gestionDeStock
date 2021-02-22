package com.stock.projet.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Categorie;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class CategorieDTO {


    private long idCategorie;
    private  String codeCategorie;
    private String designation;

    @JsonIgnore
    private List<ArticleDTO> articles;

    public CategorieDTO fromEntity(Categorie categorie){
        if (categorie==null){
            return null;
        }
        return CategorieDTO.builder()
                .idCategorie(categorie.getIdCategorie())
                .codeCategorie(categorie.getCodeCategorie())
                .designation(categorie.getDesignation())
                .build();
    }

    public Categorie toEntity(CategorieDTO categorieDTO){
        if(categorieDTO ==null){
            return null;
        }
       return Categorie.builder()
                .idCategorie(categorieDTO.getIdCategorie())
                .codeCategorie(categorieDTO.getCodeCategorie())
                .designation(categorieDTO.getDesignation())
                .build();

    }
}
