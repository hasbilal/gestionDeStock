package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
