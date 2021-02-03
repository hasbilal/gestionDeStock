package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ligneCommandeClient")
public class LigneCmdClient implements Serializable {

    @Id
    @GeneratedValue
    private long idLigneCmdClient;


    @ManyToOne
    @JoinColumn(name = "idCmdClient")
    private CmdClient cmdClient;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
}
