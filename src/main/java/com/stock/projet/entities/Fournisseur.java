package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue
    private long idFournisseur;
    private String nomFournisseur;
    private String prenomFournisseur;
    private String adresseFournisseur;
    private String emailFournisseur;
    private String imageFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    private List<CmdFournisseur> cmdFournisseurs;


}
