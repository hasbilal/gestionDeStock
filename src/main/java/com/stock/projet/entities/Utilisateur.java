package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur  implements Serializable {

    @Id
    @GeneratedValue
    private long idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String mail;
    private String pwd;
    private String imageUtilisateur;



}
