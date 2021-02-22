package com.stock.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "ligneCommandeFournisseur")
public class LigneCmdFournisseur implements Serializable {

    @Id
    @GeneratedValue
    private long idligneCmdFournisseur;



    @ManyToOne
    @JoinColumn(name = "idCmdFournisseur")
    private CmdFournisseur cmdFournisseur;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;

}
