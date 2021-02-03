package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "article")
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private long IdArticle;
    private String designation;
    private String codeArticle;
    private BigDecimal prixUnitaireHT;
    private BigDecimal tauxTVA;
    private BigDecimal prixUnitaireTTC;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;

    @OneToMany(mappedBy = "article")
    private List<LigneCmdClient>ligneCmdClient;

    @OneToMany(mappedBy = "article")
    private List<LigneCmdFournisseur>ligneCmdFournisseurs;

    @OneToMany(mappedBy = "article")
    private List<MvmDeStock>mvmDeStocks;

    @OneToMany(mappedBy = "article")
    private List<LigneVente>ligneVentes;




}
