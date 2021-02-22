package com.stock.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.dto.UtilisateurDTO;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Entreprise {
    @Id
    @GeneratedValue
    private long idEntreprise;
    private String nomEntreprise;
    private String descriptionEntreprise;
    private String emailEntreprise;
    private String numTelephone;
    private String steWeb;
    @Embedded
    private Adresse adresse;

    private String codeFiscal;

    private String imageEntreprise;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;

}
