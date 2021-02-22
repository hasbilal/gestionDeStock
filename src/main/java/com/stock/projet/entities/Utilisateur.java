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
@Table(name = "utilisateur")
public class Utilisateur  implements Serializable {

    @Id
    @GeneratedValue
    private long idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String mail;
    private Instant dateDeNaissance;
    private String pwd;

    @Embedded
    private Adresse adresseUtilisateur;
    private String imageUtilisateur;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;


    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;
}
