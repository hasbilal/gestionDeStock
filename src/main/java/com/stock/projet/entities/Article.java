package com.stock.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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
    private String imageArticle;

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

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;


}
