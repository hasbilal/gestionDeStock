package com.stock.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue
    private long idFournisseur;

    private String nomFournisseur;
    private String prenomFournisseur;

    @Embedded
    private Adresse adresseFournisseur;
    private String emailFournisseur;
    private String imageFournisseur;
    private String numTelephone;



    @OneToMany(mappedBy = "fournisseur")
    private List<CmdFournisseur> cmdFournisseurs;


    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;
}
